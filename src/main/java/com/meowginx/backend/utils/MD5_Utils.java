package com.meowginx.backend.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5_Utils {

    public static String get_string_md5(String input) {
        if(input == null || input.length() == 0) {
            return null;
        }

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(input.getBytes());
            byte[] byteArray = md5.digest();

            StringBuilder sb = new StringBuilder();
            for (byte b : byteArray) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public static String get_password_md5(String input) {
        String result_1 = get_string_md5(input);
        if(result_1 == null || result_1.length() == 0) {
            return null;
        }else {
            String result_2 = get_string_md5(result_1 + "5QxCC_wdcMrYPXUm3n3_AK3w");
            if(result_2 == null || result_2.length() == 0) {
                return null;
            }else {
                return result_2;
            }
        }
    }

//    administrator
//    bJoq2_H3TrLND5wi
//    administrator@admin.com

//    public static void main(String[] args) {
//        System.out.println(get_password_md5("bJoq2_H3TrLND5wi"));
//    }

}
