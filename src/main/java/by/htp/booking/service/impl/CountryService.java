package by.htp.booking.service.impl;

import by.htp.booking.entity.Country;
import by.htp.booking.dao.impl.CountryDao;
import by.htp.booking.service.validation.CountryValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;


@Service
public class CountryService {

    @Autowired
    private CountryDao countryDao;
    @Autowired
    private CountryValidate countryValidate;


    public boolean create(Country country) throws SQLException {

        if(countryValidate.checkCreateData(country)){
            return countryDao.create(country);
        }
        return false;
    }

    @Transactional
    public boolean update(Country country) throws SQLException {
        if (countryValidate.checkCreateData(country)) {
           return countryDao.update(country);
        }
        return false;
    }

    @Transactional
    public Country read(int id){
        return countryDao.getById(id);
    }

    @Transactional
    public Country findByName(String name){
        return countryDao.getByName(name);
    }

    @Transactional
    public List<Country> getAll() {
        return countryDao.getAll();
    }
}
