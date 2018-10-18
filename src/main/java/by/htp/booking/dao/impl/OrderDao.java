package by.htp.booking.dao.impl;

import by.htp.booking.entity.Order;
import by.htp.booking.dao.BeanDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class OrderDao extends BeanDao<Order> {
    @Autowired
    ApartmentDao apartmentDao;
    @Autowired
    UserDao userDao;
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public List<Order> getAll() {

        Session currentSession = sessionFactory.getCurrentSession();

        Query<Order> theQuery =
                currentSession.createQuery("from Order ",
                        Order.class);

        List<Order> orders = theQuery.getResultList();
        return orders;
    }

    @Transactional
    public List<Order> getListOrderByUserId(int userId) {

        Session currentSession = sessionFactory.getCurrentSession();

        Query<Order> theQuery = currentSession.createQuery("from Order where User .id=:userId", Order.class);
        theQuery.setParameter("userId", userId);
        List<Order> orders = theQuery.getResultList();

        return orders;
    }

    @Transactional
    public Order getById(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Order order =  currentSession.get(Order.class, id);
        return order;
    }

    @Transactional
    public void delete(int orderId) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query theQuery =
                currentSession.createQuery("delete from Order where id=:orderId");
        theQuery.setParameter("orderId", orderId);

        theQuery.executeUpdate();

    }

    @Transactional
    public List<Order> getListOrderByHotelId(int hotelId) {
        Session currentSession = sessionFactory.getCurrentSession();

        Query<Order> theQuery = currentSession.createQuery("from Order where Hotel .id=:hotelId", Order.class);
        theQuery.setParameter("hotelId", hotelId);
        List<Order> orders = theQuery.getResultList();

        return orders;

    }
}
