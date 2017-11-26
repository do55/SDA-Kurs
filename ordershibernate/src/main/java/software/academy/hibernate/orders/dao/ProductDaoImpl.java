package software.academy.hibernate.orders.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import software.academy.hibernate.orders.entity.Product;
import software.academy.hibernate.orders.utils.HibernateUtil;

public class ProductDaoImpl implements ProductDao{

    private Logger logger = Logger.getLogger(ClientDaoImpl.class);


    @Override
    public Product findById(Integer id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Product product = null;

        try {
            product = session.load(Product.class, id);   //lub metoda find, ale lepiej load
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            logger.error("Problem during product load with id=" + id, e);
        }

        return product;
    }
    }

