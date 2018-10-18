package by.htp.booking.dao.impl;

import by.htp.booking.entity.Apartment;
import by.htp.booking.entity.Order;
import by.htp.booking.dao.BeanDao;
import by.htp.booking.entity.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
public class  ApartmentDao extends BeanDao<Apartment> {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private HotelDao hotelDao;
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Apartment> getAll() {
        Session currentSession = sessionFactory.getCurrentSession();

        Query<Apartment> theQuery = currentSession.createQuery("from Apartment order by name", Apartment.class);
        List<Apartment> apartments = theQuery.getResultList();

        return apartments;
    }

    @Transactional
    public boolean isApartmentInOrder(Apartment apartment) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Order> theQuery = currentSession.createQuery("from Order WHERE apartment.id=: apartmentId", Order.class);
        theQuery.setParameter("apartmentId",apartment.getId());
        theQuery.setFirstResult(0);
        theQuery.setMaxResults(1);
        List<Order> orders = theQuery.getResultList();
        if (orders.size()!=0){
            return true;
        }
        else return false;
    }

    @Transactional
    public Apartment getById(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Apartment apartment =  currentSession.get(Apartment.class, id);
        return apartment;
    }

    @Transactional
    public List<Apartment> getPortionByDateAndCity(Long beginDate, Long endDate, int cityId, int from, int to){
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Apartment> theQuery =
            currentSession.createQuery("from Apartment where  hotel.city.id=:cityId", Apartment.class);
        theQuery.setParameter("cityId",cityId);
        List<Apartment> apartments = theQuery.getResultList();

//
//        Query<Apartment> theQuery =
//                currentSession.createQuery("from Apartment where id!=:apartmentId and hotel.city.id=:cityId", Apartment.class);
//        theQuery.setParameter("apartmentId",1);
//
//        Session session = sessionFactory.openSession();
//        Criteria oderCriteria = session.createCriteria(Order.class);
//        oderCriteria.add(Restrictions.eq("beginDate", beginDate));
//        oderCriteria.add(Restrictions.eq("endDate", endDate));
//
//        user = (User) userCriteria.uniqueResult();
//        session.close();
//
//        theQuery.setParameter("cityId", cityId);
//        theQuery.setFirstResult(from);
//        theQuery.setMaxResults(to);
//        List<Apartment> apartments = theQuery.getResultList();

     //   String sql = "SELECT apartment.* FROM apartment WHERE apartment.id NOT IN " +
     //           "(SELECT apartmentId FROM apartment LEFT JOIN `order` ON apartmentId = `order`.apartmentId " +
     //           "WHERE `apartment`.`hotelId` IN(SELECT id FROM `hotel` WHERE `hotel`.`cityId`=" +cityId+")" +
     //           " AND `order`.`endDate`>"+ beginEnd +")" +
     //           " AND apartment.hotelId IN(SELECT id FROM `hotel` WHERE `hotel`.`cityId`=" + cityId+") LIMIT "+from+", "+to;



        return apartments;

    }

    @Transactional
    public List<Apartment> getPortionByDate(Long beginEnd, Long endDate,int from, int to){
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Apartment> theQuery =
                currentSession.createQuery("from Apartment ", Apartment.class);

        theQuery.setFirstResult(from);
        theQuery.setMaxResults(to);
        List<Apartment> apartments = theQuery.getResultList();

        return apartments;
        /*
        String sql = "SELECT apartment.* FROM apartment " +
                "WHERE apartment.id NOT IN " +
                "(SELECT apartment.id FROM apartment LEFT JOIN `order` ON apartment.id = `order`.apartmentId" +
                " WHERE `order`.`endDate`>" + beginEnd+") LIMIT "+from+", "+to;

        return getAllwithFullRequest(sql);
*/
    }

    @Transactional
    public List<Apartment> getPortionByDateAndCountry(Long beginEnd, Long endDate,int countryId, int from, int to){
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Apartment> theQuery =
                currentSession.createQuery("from Apartment where id!=:apartmentId and hotel.city.country.id=:countryId", Apartment.class);
        theQuery.setParameter("apartmentId",1);
        theQuery.setParameter("countryId", countryId);
        theQuery.setFirstResult(from);
        theQuery.setMaxResults(to);
        List<Apartment> apartments = theQuery.getResultList();

        return apartments;


//        String sql = "SELECT apartment.*, hotel.id,apartment.id, city.id,country.id " +
//                "FROM hotel, apartment, city, country " +
//                "WHERE apartment.id NOT IN " +
//                "(SELECT apartment.id FROM apartment LEFT JOIN `order` ON apartment.id = `order`.apartmentId WHERE `apartment`.`hotelId` IN" +
//                "(SELECT id FROM `hotel` WHERE `hotel`.`cityId` IN(SELECT id FROM `country` WHERE id = "+countryId+"))" +
//                " AND `order`.`endDate`>"+beginEnd+" ) AND country.id ="+countryId+" AND country.id=city.countryId AND city.id = hotel.cityId AND apartment.hotelId = hotel.id LIMIT "+from+", "+to;
//        return getAllwithFullRequest(sql);

    }

    @Transactional
    public int getCountDateAndCity(Long beginEnd, Long endDate,int cityId){

        Session currentSession = sessionFactory.getCurrentSession();

        int count = ((Long)currentSession.createQuery("select count(*) from Apartment ").uniqueResult()).intValue();
        return count;
        //List<Apartment> apartments = theQuery.getResultList();
//        String sql = "SELECT COUNT(*)  as `count_row`  FROM apartment WHERE apartment.id NOT IN " +
//                "(SELECT apartment.id FROM apartment LEFT JOIN `order` ON apartment.id = `order`.apartmentId " +
//                "WHERE `apartment`.`hotelId` IN(SELECT id FROM `hotel` WHERE `hotel`.`cityId`=" +cityId+")" +
//                " AND `order`.`endDate`>"+ beginEnd +")" +
//                " AND apartment.hotelId IN(SELECT id FROM `hotel` WHERE `hotel`.`cityId`=" + cityId+")";
//        return getCountWithFullRequest(sql);


    }

    @Transactional
    public int getCountByDate(Long beginEnd, Long endDate){
/*        String sql = "SELECT COUNT(*)  as `count_row`  FROM apartment " +
                "WHERE apartment.id NOT IN " +
                "(SELECT apartment.id FROM apartment LEFT JOIN `order` ON apartment.id = `order`.apartmentId" +
                " WHERE `order`.`endDate`>" + beginEnd+")";

        return getCountWithFullRequest(sql);*/
        Session currentSession = sessionFactory.getCurrentSession();

        int count = ((Long)currentSession.createQuery("select count(*) from Apartment ").uniqueResult()).intValue();
        return count;
        //List<Apartme
    }

    @Transactional
    public int getCountByDateAndCountry(Long beginEnd, Long endDate, int countryId){
        Session currentSession = sessionFactory.getCurrentSession();

        int count = ((Long)currentSession.createQuery("select count(*) from Apartment ").uniqueResult()).intValue();

        return count;
//        //List<Apartme
//        String sql = "SELECT COUNT(*)  as `count_row` " +
//                "FROM hotel, apartment, city, country " +
//                "WHERE apartment.id NOT IN " +
//                "(SELECT apartment.id FROM apartment LEFT JOIN `order` ON apartment.id = `order`.apartmentId WHERE `apartment`.`hotelId` IN" +
//                "(SELECT id FROM `hotel` WHERE `hotel`.`cityId` IN(SELECT id FROM `country` WHERE id = "+countryId+"))" +
//                " AND `order`.`endDate`>"+beginEnd+" ) AND country.id ="+countryId+" AND country.id=city.countryId AND city.id = hotel.cityId AND apartment.hotelId = hotel.id";
//        return getCountWithFullRequest(sql);

    }

}
