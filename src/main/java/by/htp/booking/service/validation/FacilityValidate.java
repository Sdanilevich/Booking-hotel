package by.htp.booking.service.validation;

import by.htp.booking.entity.Facility;
import by.htp.booking.dao.impl.FacilityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FacilityValidate {


    @Autowired
    private FacilityDao facilityDao;


    public boolean checkCreateData(Facility facility){

        if (facility.getName().isEmpty()){
            return false;
        }

        if (isDuplicated(facility)){
            return true;
        }

        return false;
    }

    public boolean isDuplicated(Facility facility) {
        if (facilityDao.findByName(facility.getName())!=null){
            return true;
        }
        else return false;
    }

    public boolean isDuplicated(String name) {
        if (facilityDao.findByName(name)!=null){
            return true;
        }
        else return false;
    }
}
