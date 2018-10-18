package by.htp.booking.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.*;

@Controller
public class MainController extends HttpServlet{

    private static final Logger log = Logger.getLogger(MainController.class);

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String showPageMain(ModelMap model) {
        return "index";
    }








}
