package software.academy.hibernate.orders.dao;

import software.academy.hibernate.orders.entity.Product;

public interface ProductDao {

    public Product findById(Integer id);
}
