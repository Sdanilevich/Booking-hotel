package by.htp.booking.controller;

import by.htp.booking.entity.Apartment;
import by.htp.booking.entity.Order;
import by.htp.booking.entity.User;
import by.htp.booking.service.Util;
import by.htp.booking.service.impl.ApartmentService;
import by.htp.booking.service.impl.OrderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private ApartmentService apartmentService;
    @Autowired
    private OrderService orderService;

    private static final Logger log = Logger.getLogger(OrderController.class);

    @RequestMapping(value = "/createOrder", method = RequestMethod.POST)
    public String createOrder(HttpServletRequest req) throws ParseException, SQLException {
        User user = Constants.getUserFromSession(req);
        if (user==null){
            log.info("Order can not create without user. Redirect to form logination ");
            return "login";
        }
        else {

            int apartment_id = Integer.valueOf(req.getParameter("apartmentId"));
            Date beginDate = Util.getDateFromFormat(req.getParameter("dateBegin"));
            Date dateEnd = Util.getDateFromFormat(req.getParameter("dateEnd"));
            Apartment apartment = apartmentService.getApartmentById(apartment_id);
            int countDay = Util.getCountDay(beginDate, dateEnd);
            if(apartment!=null){
                Order order = new Order();
                order.setUser(user);
                order.setApartment(apartment);

                order.setBeginDate(beginDate.getTime());
                order.setEndDate(dateEnd.getTime());
                order.setCountDay(countDay);
                order.setPrice(apartment.getPrice());
                order.setTotal(apartment.getPrice()*countDay);
                log.info("Try to create order by user "+user.getName());
                if (orderService.create(order)){
                    log.info("Create order by user "+user.getName());
                    return "redirect:/userorder";

                }
                else {
                    req.setAttribute("err", "Error creating order");
                    log.error("Can't сreate order");
                    return "error";
                }
            }
            else{
                HttpSession session = req.getSession();
                session.setAttribute("err", "Indefined apartment's id");
                log.error("Indefined apartment's id");
                return "error";
            }

        }

    }

    @RequestMapping(value = "/userorder", method = RequestMethod.GET)
    public String showUserOrder(HttpServletRequest req) throws ParseException, SQLException {

        log.info("Go to user's page ");
        User user = Constants.getUserFromSession(req);
        if (user != null) {
            int userId = user.getId();
            if (userId != 0) {
                List<Order> userOrder = orderService.getListOrderByUserId(userId);
                req.setAttribute("userOrder", userOrder);
                return "userorder";
            } else {
                req.setAttribute("err", "No user defined");
                log.error("user don't defined");
                return "error";
            }
        }
        else return "login";
    }
}
