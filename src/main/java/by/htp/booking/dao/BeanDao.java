package by.htp.booking.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

public abstract class BeanDao<Type> {
    @Autowired
    private SessionFactory sessionFactory;

    public abstract List<Type>  getAll();

    @Transactional
    public boolean create(Type bean ) throws SQLException{
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(bean);
        return true;
    }

    @Transactional
    public boolean update(Type bean) throws SQLException{
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(bean);
        return true;
    }

}
