package by.htp.booking.controller;

import by.htp.booking.entity.Order;
import by.htp.booking.entity.User;
import by.htp.booking.service.Util;
import by.htp.booking.service.impl.OrderService;
import by.htp.booking.service.impl.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

@Controller
public class UserController {
    private static final Logger log = Logger.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model) {
        return "login";
    }


    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String showPageSignUp(ModelMap model) {
        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String addUSer(HttpServletRequest req) throws SQLException {
        String login= req.getParameter("login");
        String name= req.getParameter("name");
        String password= Util.doEncryptPassword(req.getParameter("password"));
        String email= req.getParameter("email");
        User user=new User(name,login,password,email);
        log.info("Attempt to create new user");
        if (userService.create(user)) {
            log.info("Create new user " + user.getName());
            return "login";
        }
        else {
            req.setAttribute("err","Error registration user");
            log.error("Error registration user");
            return "error";
        }

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String autorization(HttpServletRequest req,ModelMap model) {
        String login=req.getParameter("login");
        String password= Util.doEncryptPassword(req.getParameter("password"));
        User user= userService.getUserByLoginPassword(login, password);

        if (user!= null){

            List<Order> orderList = orderService.getListOrderByUserId(user.getId());
            HttpSession session = req.getSession();
            session.setAttribute("user",user);
            if (orderList.size()==0){
                return "redirect:/newSearch";
            }

            req.setAttribute("userOrder", orderList);
            return "userorder";
        }

        else {
            req.setAttribute("err","You entered an login/password combination that doesn't match");
            log.error("Failed login attempt");
            return "error";
        }
    }
}
