package by.htp.booking.service.impl;

import by.htp.booking.entity.City;
import by.htp.booking.dao.impl.CityDao;
import by.htp.booking.service.validation.CityValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;


@Service
public class CityService {

    @Autowired
    private CityDao cityDao;
    @Autowired
    private CityValidate cityValidate;

    @Transactional
    public boolean create(City city) throws SQLException {
        if (cityValidate.checkCreateData(city)){
            return cityDao.create(city);
        }
        return false;
    }

    @Transactional
    public void delete(City city) throws  SQLException {
        if (cityValidate.checkDeleteData(city)){
            cityDao.delete(city.getId());
        }
    }
@Transactional
    public boolean update(City city) throws SQLException {
        if (cityValidate.checkUpdateData(city)){
            return cityDao.update(city);
        }
        return false;
    }
@Transactional
    public List<City> getlistCityByCountryId(int countryId){
        List<City> cityList = cityDao.getlistCityByCountryId(countryId);
        return cityList;
    }

    @Transactional
    public List<City> getAll() {
        return  cityDao.getAll();
    }

@Transactional
    public City getCityByName(String name) {
        return cityDao.getByName(name);
    }
}
