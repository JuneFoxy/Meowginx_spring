package com.meowginx.backend.utils;

import java.util.Calendar;
import java.util.Date;

public class Time_Utils {

    public String get_login_time(){
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.YEAR) + "_" +
                (now.get(Calendar.MONTH) + 1) + "_" +
                now.get(Calendar.DAY_OF_MONTH) + "_" +
                now.get(Calendar.HOUR_OF_DAY) + "_" +
                now.get(Calendar.MINUTE) + "_" +
                now.get(Calendar.SECOND);
    }

//    public static void main(String[] args) {
//        System.out.println(get_login_time());
//    }
}
