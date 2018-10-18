package by.htp.booking.dao.impl;

import by.htp.booking.entity.City;
import by.htp.booking.dao.BeanDao;
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
public class CityDao extends BeanDao<City> {
    @Autowired
    CountryDao countryDao;
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<City> getAll() {
        Session currentSession = sessionFactory.getCurrentSession();

        Query<City> theQuery = currentSession.createQuery("from City ", City.class);
        List<City> cities = theQuery.getResultList();

        return cities;
    }

    @Transactional
    public List<City> getlistCityByCountryId(int countryId) {
        Session currentSession = sessionFactory.getCurrentSession();

        Query<City> theQuery = currentSession.createQuery("from City where country.id=:countryId", City.class);
        theQuery.setParameter("countryId", countryId);
        List<City> cities = theQuery.getResultList();
        return cities;
    }

    @Transactional
    public City getByName(String name) {
        Session currentSession = sessionFactory.getCurrentSession();

        Query<City> theQuery = currentSession.createQuery("from City where name=:name", City.class);
        theQuery.setParameter("name", name);
        List<City> cities = theQuery.getResultList();

        if (cities.size()!=0){
            return cities.get(0);
        }
        else return null;
    }

    @Transactional
    public City getById(int id){
        Session currentSession = sessionFactory.getCurrentSession();
        City city =  currentSession.get(City.class, id);
        return city;
    }

    @Transactional
    public void delete(int id) {
        Session currentSession = sessionFactory.getCurrentSession();

        Query theQuery =
                currentSession.createQuery("delete from City where id=:cityId");
        theQuery.setParameter("cityId", id);

        theQuery.executeUpdate();
    }
}
