package by.htp.booking.dao.impl;

import by.htp.booking.entity.Facility;
import by.htp.booking.dao.BeanDao;
import by.htp.booking.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FacilityDao extends BeanDao<Facility> {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Facility> getAll() {
        Session currentSession = sessionFactory.openSession();
        currentSession.beginTransaction();

        Query<Facility> theQuery = currentSession.createQuery("from Facility order by name", Facility.class);
        List<Facility> facilities = theQuery.getResultList();

        currentSession.getTransaction().commit();
        return facilities;
    }


    public Facility findByName(String name){

        Session currentSession = sessionFactory.openSession();
        currentSession.beginTransaction();

        Query<Facility> theQuery = currentSession.createQuery("from Facility where name: "+name, Facility.class);
        List<Facility> facilities = theQuery.getResultList();

        currentSession.getTransaction().commit();

        if (facilities.size()!=0){
            return facilities.get(0);
        }
        else return null;
    }


    public Facility findById(int id){
        Session currentSession = sessionFactory.openSession();
        currentSession.beginTransaction();

        Facility facility = currentSession.get(Facility.class, id);

        currentSession.getTransaction().commit();
         return facility;
    }


}
