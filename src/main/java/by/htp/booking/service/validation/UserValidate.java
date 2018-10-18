package by.htp.booking.service.validation;

import by.htp.booking.entity.User;
import by.htp.booking.dao.impl.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserValidate  {
    @Autowired
    private UserDao userDao;
    public boolean isDuplicated(User user) {
        if (userDao.getUserByLogin(user.getLogin())!=null){
            return true;
        }
        else return false;
    }

    public boolean isDuplicated(String  login) {
        if (userDao.getUserByLogin(login)==null){
            return true;
        }
        else return false;
    }

    public boolean checkAuthorization(String name, String password){
        User user =  userDao.getUserByLoginPassword(name, password);
        if (user!= null){
            return true;
        }
        else return false;
    }
}
