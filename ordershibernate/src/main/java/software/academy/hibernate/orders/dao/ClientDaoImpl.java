package software.academy.hibernate.orders.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import software.academy.hibernate.orders.entity.Client;
import software.academy.hibernate.orders.utils.HibernateUtil;



public class ClientDaoImpl implements ClientDao {

    private Logger logger = Logger.getLogger(ClientDaoImpl.class);

    @Override
    public Client findById(Integer id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Client client = null;

        try {
            client = session.load(Client.class, id);   //lub metoda find, ale lepiej load
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            logger.error("Problem during client load with id=" + id, e);
        }

    return client;
    }

    @Override
    public void save(Client client) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            session.save(client);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            logger.error("Problem during client save ");
        }
    }

    @Override
    public void delete(Integer id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            Client client = session.find(Client.class, id);
            session.remove(client);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            logger.error("Problem during client delete ");
        }
    }

    @Override
    public void update(Client client) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            session.saveOrUpdate(client);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            logger.error("Problem during client update ");
        }

    }


}
