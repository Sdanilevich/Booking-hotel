package by.htp.booking.service;

import org.apache.commons.codec.digest.DigestUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {



    public static String doEncryptPassword(String password) {
        String md5Hex = DigestUtils.md5Hex(password);

        return md5Hex;
    }

    public static Date getDateFromFormat(String dateString) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd-MM-yyyy");
        return format.parse(dateString);
    }


    public static int getCountDay(Date beginDate, Date dateEnd) {
        long milliseconds = dateEnd.getTime() - beginDate.getTime();
        return  (int) (milliseconds / (24 * 60 * 60 * 1000));

    }
}
