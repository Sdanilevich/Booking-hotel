package by.htp.booking.service.validation;

import by.htp.booking.entity.Apartment;
import by.htp.booking.dao.impl.ApartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApartmentValidate {
    @Autowired
    private ApartmentDao apartmentDao;

    public boolean checkCreateData(Apartment apartment) {
        if (apartment.getName().isEmpty()||
                apartment.getDescription().isEmpty()||
                apartment.getHotel()==null||
                apartment.getRoomSize()==0||
                apartment.getPrice()==0||
                apartment.getCountGuest()==0){
            return false;
        }

        return true;


    }

    public boolean checkDeleteData(Apartment apartment) {
        if(apartmentDao.isApartmentInOrder(apartment)){
            return false;
        }
        return true;
    }
}
