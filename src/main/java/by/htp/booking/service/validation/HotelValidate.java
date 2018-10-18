package by.htp.booking.service.validation;

import by.htp.booking.entity.Hotel;
import by.htp.booking.dao.impl.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HotelValidate {

    @Autowired
    private OrderDao orderDao;

    public boolean checkDeleteData(Hotel hotel){


        if (orderDao.getListOrderByHotelId(hotel.getId())!=null){
            return false;
        }
        return true;

    }

    public boolean checkCreateData(Hotel hotel) {
        if (hotel.getCity()==null||
                hotel.getName().isEmpty()||
                hotel.getAddress().isEmpty()){
            return false;
        }

        return true;
    }
}
