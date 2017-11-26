package software.academy.hibernate.orders.dao;

import org.apache.log4j.Logger;
import org.junit.Test;
import software.academy.hibernate.orders.entity.*;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;

public class OrderDaoImplTest {

    private Logger logger = Logger.getLogger(ClientDaoImpl.class);

    private OrderDao orderDao = new OrderDaoImpl();
    private ClientDao clientDao = new ClientDaoImpl();
    private ProductDao productDao = new ProductDaoImpl();

    @Test
    public void shouldSaveOrder() throws Exception {
        Client client = clientDao.findById(4);
        Order order = new Order(client, new Date(), null, OrderStatus.NEW, new BigDecimal("20.22"));
        Product bread = productDao.findById(1);
        Product butter = productDao.findById(2);
        order.addItem(bread, 5);
        order.addItem(butter, 3);
        orderDao.save(order);

    }

    @Test
    public void findById() throws Exception {
        Order order = orderDao.findById(5);
        logger.info("order_id: " + order.getId());
        //jak się robi prawdziwe testy to zamiast loggerow w testach uzywac assertow
        logger.info("client first name " + order.getClient().getFirstName());
    }

    @Test
    public void findByIdWithItems() {
        Order order = orderDao.findById(5);
        if (order.getOrderItems() != null) {
            for (OrderItem item: order.getOrderItems()) {
                logger.info(" product " + item.getProduct().getName() + " quantity " + item.getQuantity());
            }
        }
    }

}