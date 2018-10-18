package by.htp.booking.dao.impl;

import by.htp.booking.entity.Hotel;
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
public class HotelDao extends BeanDao<Hotel> {

    @Autowired
    CityDao cityDao;
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Hotel> getAll() {
        Session currentSession = sessionFactory.openSession();
        currentSession.beginTransaction();
        Query<Hotel> theQuery = currentSession.createQuery("from Hotel order by name", Hotel.class);
        List<Hotel> hotels = theQuery.getResultList();
        return hotels;
    }


    public List<Hotel> getListHotelByCountryId(int countryId) {
        Session currentSession = sessionFactory.openSession();
        currentSession.beginTransaction();


        Query<Hotel> theQuery = currentSession.createQuery("from Hotel where city.country.id=:countryId", Hotel.class);
        theQuery.setParameter("countryId", countryId);
        List<Hotel> hotels = theQuery.getResultList();
        currentSession.getTransaction().commit();
        return hotels;
    }


    public Hotel getById(int id) {
        Session currentSession = sessionFactory.openSession();
        currentSession.beginTransaction();
        Hotel hotel =  currentSession.get(Hotel.class, id);
        currentSession.getTransaction().commit();
        return hotel;
    }
}
