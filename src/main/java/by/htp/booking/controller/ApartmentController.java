package by.htp.booking.controller;

import by.htp.booking.entity.Apartment;
import by.htp.booking.entity.Facility;
import by.htp.booking.service.Util;
import by.htp.booking.service.impl.ApartmentService;
import by.htp.booking.service.impl.CityService;
import by.htp.booking.service.impl.CountryService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Controller
public class ApartmentController {
    private static final Logger log = Logger.getLogger(ApartmentController.class);
    @Autowired
    private CountryService countryService;
    @Autowired
    private CityService cityService;
    @Autowired
    private ApartmentService apartmentService;

    @RequestMapping(value = "/newSearch", method = RequestMethod.GET)
    public String showPageSearch(ModelMap model) {
        model.addAttribute("listCountry", countryService.getAll());
        model.addAttribute("listCity", cityService.getAll());
        return "searchapartment";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String printHello(HttpServletRequest request, ModelMap model) throws ParseException, SQLException {
        int city_id = Integer.valueOf(request.getParameter("country"));
        int country_id = Integer.valueOf(request.getParameter("city"));
        String  dateBeginReq = request.getParameter("dateBegin");
        String dateEndReq = request.getParameter("dateEnd");

        Date dateBegin = Util.getDateFromFormat(dateBeginReq);
        Date dateEnd = Util.getDateFromFormat(dateEndReq);

        int begin = 1;
        if (request.getParameter("beginPortion") != null) {
            begin = Integer.valueOf(request.getParameter("beginPortion"));
        }
        List<Apartment> listApartment = apartmentService.getPortion(dateBegin.getTime(), dateEnd.getTime(), country_id, city_id, begin, Constants.countApartmentOnPage);

        model.addAttribute("countApartment", apartmentService.getCountFreeApartments(dateBegin.getTime(), dateEnd.getTime(), country_id, city_id));
        model.addAttribute("countApartmentOnPage", Constants.countApartmentOnPage);

        model.addAttribute("listApartment", apartmentService.getPortion(dateBegin.getTime(), dateEnd.getTime(), country_id, city_id, begin, Constants.countApartmentOnPage));
        model.addAttribute("listCountry", countryService.getAll());
        model.addAttribute("listCity", cityService.getAll());
        model.addAttribute("listApartment", listApartment);
        return "searchapartment";
    }

    @RequestMapping(value = {"/apartment","/apartmentview"},  method = RequestMethod.GET)
    public String showPageApartment(@RequestParam("id") String id,  ModelMap model,HttpServletRequest request){
        String pageView = ((String) request.getAttribute(
                HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE)).replaceAll("/","");
        int apartmentId = Integer.valueOf(id);
        if (apartmentId!=0){
            Apartment apartment = apartmentService.getApartmentById(apartmentId);
            if (apartment!=null){
                List<Facility> listFacility = apartment.getListFacility();
                List<String> listPathImg = apartmentService.getListPathImg(apartment.getId());

                model.addAttribute("listFacility", listFacility);
                model.addAttribute("apartment", apartment);
                log.info("Go to page review apartment");
                return pageView;
            }
            else {
                log.error("Apartment not found");
                return "error";
            }

        }
        log.error("Apartment not defined");
        return "error";
    }


}
