package by.htp.booking.dao.impl;

import by.htp.booking.entity.User;
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
public class UserDao extends BeanDao<User> {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<User> getAll() {
        Session currentSession = sessionFactory.getCurrentSession();

        Query<User> theQuery = currentSession.createQuery("from User order by name", User.class);
        List<User> users = theQuery.getResultList();

        return users;
    }

    @Transactional
    public User getUserByLogin(String login) {
        Session currentSession = sessionFactory.getCurrentSession();

        User user = currentSession.get(User.class, login);

        return user;
    }

    @Transactional
    public User getUserByLoginPassword(String login, String password) {
        Session currentSession = sessionFactory.getCurrentSession();

        Query<User> theQuery = currentSession.createQuery("from User where login=:login and password=: password", User.class);
        theQuery.setParameter("login", login);
        theQuery.setParameter("password", password);
        List<User> users = theQuery.getResultList();

        if (users.size()!=0){
            return users.get(0);
        }
        else return null;

    }

    @Transactional
    public User getById(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        User user =  currentSession.get(User.class, id);
        return user;
    }
}
