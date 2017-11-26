package software.academy.hibernate.orders.dao;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import software.academy.hibernate.orders.entity.Client;
import software.academy.hibernate.orders.entity.ClientType;


public class ClientDaoImplTest {

    private Logger logger = Logger.getLogger(ClientDaoImpl.class);

    @Test
    public void shouldUpdateClient() throws Exception {

        //GIVEN
        ClientDao clientDao = new ClientDaoImpl();
        Client client = new Client(5,"john", "brownie", "brown@mailinator.com", ClientType.PREMIUM);

        //WHEN
        clientDao.update(client);

        //THEN
        Client clientFromDatabase = clientDao.findById(5);
        Assert.assertEquals("Second name should be the same", "brownie", clientFromDatabase.getSecondName());
    }

    @Test
    public void shouldSaveClient() throws Exception {
        ClientDao clientDao = new ClientDaoImpl();
        Client client = new Client("john", "brown", "brown@mailinator.com", ClientType.PREMIUM);
        clientDao.save(client);
    }

    @Test
    public void findById() throws Exception {
        ClientDao clientDao = new ClientDaoImpl();
        Client client = clientDao.findById(2);
        logger.info("Email: " + client.getEmail());
        logger.info("Street: " + client.getAddress().getStreet());

    }

}