package by.htp.booking.dao.impl;

import by.htp.booking.entity.Country;
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
public class CountryDao extends BeanDao<Country> {

    @Autowired
    private SessionFactory sessionFactory;

    //@Transactional
    public List<Country> getAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Query<Country> theQuery = session.createQuery("from Country order by name", Country.class);
        List<Country> countries = theQuery.getResultList();

        session.getTransaction().commit();
        return countries;

    }

    @Transactional
    public Country getByName(String name){
        Session currentSession = sessionFactory.getCurrentSession();

        Query<Country> theQuery = currentSession.createQuery("from Country where name=:name", Country.class);
        theQuery.setParameter("name", name);
        List<Country> countries = theQuery.getResultList();

       if (countries.size()!=0){
            return countries.get(0);
        }
        else return null;
    }

    @Transactional
    public Country getById(int id) {
        Session currentSession = sessionFactory.getCurrentSession();

        Country country =  currentSession.get(Country.class, id);


        return country;
    }
}
