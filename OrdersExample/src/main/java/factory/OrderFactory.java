package factory;

import com.sdaMRymarczyk.Client;
import com.sdaMRymarczyk.Order;
import strategy.PercentageRebateStrategy;
import strategy.RebateStrategy;

public class OrderFactory {

    //wzorzec projektowy Factory

    public Order createOrder(int orderId, Client client) {
        Order order = new Order(orderId, client, Order.OrderState.DRAFT);
        RebateStrategy rebateStrategy = new PercentageRebateStrategy();
        order.setRebateStrategy(rebateStrategy);
    return order;
    }
}
