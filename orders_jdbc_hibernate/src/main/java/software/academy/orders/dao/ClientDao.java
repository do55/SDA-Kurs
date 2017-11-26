package software.academy.orders.dao;

import software.academy.orders.entities.Client;

public interface ClientDao {

    public Client findById(Integer id);
    public void insert(Client client);
    public void update(Client client);
    public void delete(Integer id);

}
