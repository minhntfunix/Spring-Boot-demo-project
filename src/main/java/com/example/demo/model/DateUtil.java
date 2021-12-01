package com.example.demo.model;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateUtil {
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public static String formatDate(Date theDate) {
        
        String result = null;
        
        if (theDate != null) {
            result = formatter.format(theDate);
        }
        
        return result;
    }

}
