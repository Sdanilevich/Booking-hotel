package by.htp.booking.controller;

import by.htp.booking.entity.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ResourceBundle;

public class Constants {

    public  static  int countApartmentOnPage = 3;
    public  static  String defaultLocale = "ru";
    public Constants(){

    }

    public static User getUserFromSession(HttpServletRequest req) {
        HttpSession session = req.getSession();
        Object objUser = session.getAttribute("user");
        if (objUser != null) {
            return (User) objUser;
        }
        return null;
    }

    public static void putDataToSession(HttpServletRequest request){
        ResourceBundle resource;
        HttpSession httpSession = request.getSession();
        resource = ResourceBundle.getBundle("hotelData");
        countApartmentOnPage = Integer.valueOf(resource.getString("data.countApartmentOnPage"));
        httpSession.setAttribute("countApartmentOnPage", countApartmentOnPage);
        httpSession.setAttribute("local", defaultLocale);
    }

    public static String getLocale(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        return (String) httpSession.getAttribute("local");

    }

}
