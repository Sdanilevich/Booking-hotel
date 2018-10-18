package by.htp.booking.service.impl;

import by.htp.booking.entity.Facility;
import by.htp.booking.dao.impl.FacilityDao;
import by.htp.booking.service.validation.FacilityValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
public class FacilityService {
    @Autowired
    private FacilityDao facilityDao;

    @Autowired
    private FacilityValidate facilityValidate;


    @Transactional
    public boolean create(Facility facility) throws SQLException {
        if (facilityValidate.checkCreateData(facility)){
           return  facilityDao.create(facility);
        }
        return false;
    }

    @Transactional
    public Facility getFacilityById(int facilityId) {
        Facility  facility= facilityDao.findById(facilityId);
        return facility;
    }
}
