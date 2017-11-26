package software.academy.hibernate.orders.dao;

import software.academy.hibernate.orders.entity.Order;

public interface OrderDao {

    public Order findById(Integer id);
    public void save(Order order);
}
