package by.htp.booking.service.validation;

import by.htp.booking.entity.Order;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class OrderValidate {
    private static final Logger log = Logger.getLogger(OrderValidate.class);
    public boolean checkCorrectData(Order order) {

        if(order.getApartment()==null&&
        order.getBeginDate()==0&&
        order.getEndDate()==0&&
        order.getCountDay()==0&&
        order.getUser()==null){
            log.info("date order isn't correct");
            return false;
        }
        log.info("date order is correct");

        return true;
    }
}
