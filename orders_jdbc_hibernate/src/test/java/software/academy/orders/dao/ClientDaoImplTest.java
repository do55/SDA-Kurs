package software.academy.orders.dao;

import org.junit.Assert;
import org.junit.Test;
import software.academy.orders.entities.Client;
import software.academy.orders.entities.ClientType;

import static org.junit.Assert.*;

public class ClientDaoImplTest {

    @Test
    public void shouldFindById() throws Exception {
        ClientDao clientDao = new ClientDaoImpl();
        Client clientFromDatabase = clientDao.findById(1);
        Client expectedClient = new Client(1, "John","Bravo","jbravo@ddd.ocm", ClientType.PREMIUM);

        Assert.assertEquals("Clients should be the same", expectedClient, clientFromDatabase);
    }
    @Test
    public void shouldInsertClient() {
        ClientDao clientDao = new ClientDaoImpl();
        Client newClient = new Client("Clint","Eastwood","ceastwood@ddd.com", ClientType.REGULAR);
        clientDao.insert(newClient);
    }

    @Test
    public void shouldUpdateClient() {
        ClientDao clientDao = new ClientDaoImpl();
        Client updatedClient = new Client(2,"Johny","Gost","hkiil@ddd.com", ClientType.REGULAR);
        clientDao.update(updatedClient);

    }

    @Test
    public void shouldDeleteClient() {
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.delete(1);
    }
}