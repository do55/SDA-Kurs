package software.academy.hibernate.orders.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import software.academy.hibernate.orders.entity.Order;
import software.academy.hibernate.orders.utils.HibernateUtil;

public class OrderDaoImpl implements OrderDao {

    private Logger logger = Logger.getLogger(ClientDaoImpl.class);

    @Override
    public Order findById(Integer id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Order order = null;

        try {
            order = session.load(Order.class, id);   //lub metoda find, ale lepiej load
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            logger.error("Problem during order load with id=" + id, e);
        }

        return order;
    }

    @Override
    public void save(Order order) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            session.save(order);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            logger.error("Problem during order save ", e);
        }
    }

}
