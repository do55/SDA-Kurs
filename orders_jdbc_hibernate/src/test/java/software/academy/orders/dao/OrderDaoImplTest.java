package software.academy.orders.dao;

import org.junit.Test;
import software.academy.orders.entities.Order;
import software.academy.orders.entities.OrderStatus;

import java.math.BigDecimal;
import java.util.Date;


public class OrderDaoImplTest {
    @Test
    public void shouldInsertOrder() throws Exception {
        OrderDao orderDao = new OrderDaoImpl();
        Date currentTime = new Date();
        Order order = new Order(2, currentTime, null, OrderStatus.NEW, new BigDecimal("2.20"));
        order.addItem(1,2);
        order.addItem(2,3);
        orderDao.insert(order);



    }

}