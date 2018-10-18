package by.htp.booking.service.impl;

import by.htp.booking.entity.Hotel;
import by.htp.booking.dao.impl.HotelDao;
import by.htp.booking.service.validation.HotelValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;


@Service
public class HotelService {
    @Autowired
    private HotelDao hotelDao;

    @Autowired
    private HotelValidate hotelValidate;

    @Transactional
    public boolean create(Hotel hotel) throws SQLException {
        if (hotelValidate.checkCreateData(hotel)){
            return hotelDao.create(hotel);
        }
        return false;
    }

    @Transactional
    public List<Hotel> getAll() {
        return hotelDao.getAll();
    }

    @Transactional
    public boolean update(Hotel hotel) throws SQLException {
        if (hotelValidate.checkCreateData(hotel)){
            return  hotelDao.update(hotel);
        }
        return false;
    }

    @Transactional
    public Hotel getHotelById(int hotelId) {
        Hotel hotel = hotelDao.getById(hotelId);
        return hotel;
    }
}
