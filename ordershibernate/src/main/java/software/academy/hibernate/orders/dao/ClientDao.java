package software.academy.hibernate.orders.dao;

import software.academy.hibernate.orders.entity.Client;

public interface ClientDao {

    public Client findById(Integer id);

    public void save(Client client);

    public void delete(Integer id);

    public void update(Client client);
}
