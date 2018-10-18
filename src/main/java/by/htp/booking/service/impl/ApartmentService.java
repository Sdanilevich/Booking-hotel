package by.htp.booking.service.impl;

import by.htp.booking.entity.Apartment;
import by.htp.booking.dao.impl.ApartmentDao;
import by.htp.booking.service.validation.ApartmentValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Service
public class ApartmentService {

    @Autowired
    private ApartmentValidate apartmentValidate;
    @Autowired
    private ApartmentDao apartmentDao;

    @Transactional
    public boolean create(Apartment apartment) throws SQLException {
        if (apartmentValidate.checkCreateData(apartment)){
            return apartmentDao.create(apartment);
        }
        return false;
    }

    @Transactional
    public boolean update(Apartment apartment) throws SQLException {
        if (apartmentValidate.checkCreateData(apartment)){
            return apartmentDao.update(apartment);
        }
        return false;
    }

    @Transactional
    public List<Apartment> getAll(String where) {
        return apartmentDao.getAll();
    }

    @Transactional
    public int getCountFreeApartments(long beginDate,long endDate, int countryId, int cityId) throws SQLException {
        if(cityId==0&&countryId==0){
            return apartmentDao.getCountByDate(beginDate, endDate);
        }
        else if (cityId!=0){
            return apartmentDao.getCountDateAndCity(beginDate, endDate, cityId);
        }
        else {
            return apartmentDao.getCountByDateAndCountry(beginDate, endDate, countryId);
        }
    }

    @Transactional
    public List<Apartment> getPortion(long beginDate, long endDate,  int countryId, int cityId, int from, int to) {
        if(cityId==0&&countryId==0){
            return apartmentDao.getPortionByDate(beginDate,endDate, from, to);
        }
        else if (cityId!=0){
            return apartmentDao.getPortionByDateAndCity(beginDate, endDate, cityId, from, to );
         }
        else {
            return apartmentDao.getPortionByDateAndCountry(beginDate, endDate,countryId, from, to);
        }
    }

    @Transactional
    public Apartment getApartmentById(int id) {
        return apartmentDao.getById(id);
    }

    @Transactional
    public List<String> getListPathImg(int apartmentId){
        List<String> listPath = new ArrayList<>();
        String pathFrom = "src"+
                File.separator+"main"+
                File.separator+
                "webapp"+File.separator+
                "views"+
                File.separator +"jpg"+File.separator+"apartments"+File.separator+apartmentId;
        File folderFrom = new File(pathFrom);
        if (folderFrom!=null) {
            File[] listOfFiles = folderFrom.listFiles();
                if (listOfFiles!=null){
                for (int i = 0; i < listOfFiles.length; i++) {
                    File file = listOfFiles[i];
                    listPath.add(pathFrom + File.separator + file.getName());
                }
            }
        }
        return  listPath;

    }

}
