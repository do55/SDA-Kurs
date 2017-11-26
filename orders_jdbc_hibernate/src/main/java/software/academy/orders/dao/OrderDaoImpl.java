package software.academy.orders.dao;

import org.apache.log4j.Logger;
import software.academy.orders.entities.Order;
import software.academy.orders.entities.OrderItem;
import software.academy.orders.exceptions.DatabaseException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class OrderDaoImpl implements OrderDao {

    private Logger logger = Logger.getLogger(OrderDaoImpl.class);

    @Override
    public void insert(Order order) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            logger.info("Trying to get connection...");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/orders?" + "user=root&password=joga2017");
            statement = connection.prepareStatement("INSERT INTO `order` (client_id, insert_date, update_date, `status`, total_cost) " + "VALUES (?,?,?,?,?)");
            connection.setAutoCommit(false); //wstrzymujemy commit dopoki nie dodamy produktow i wtedy jest pelna transakcja (inaczej rollback)
            statement.setInt(1, order.getClientId());
            statement.setTimestamp(2, new Timestamp(order.getInsertDate().getTime()));
            statement.setTimestamp(3,null);
            statement.setString(4, order.getStatus().name());
            statement.setBigDecimal(5, order.getTotalCost());
            //transakcja nie jest zatwierdzona(autoCommit=false)
            statement.execute();

            if (order.getItems() != null) {
                //zapis pozycji zamówienia
                for (OrderItem orderItem: order.getItems()) {
                    statement = connection.prepareStatement("INSERT INTO `order_item` (order_id, product_id, quantity) " + "VALUES (last_insert_id(),?,?)");

                    statement.setInt(1, orderItem.getProductId());
                    statement.setInt(2,orderItem.getQuantity());
                    statement.execute();
                    connection.commit();
                    logger.info("Order was added");
                }
            }

        } catch (SQLException se) {
            logger.error("Problem during order insert", se);
            throw new DatabaseException("Problem during order insert", se);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}
