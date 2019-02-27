package com.sir.taxesejourV1.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static final String paternYYYYMMDDmmhhSS = "yyyy-MM-dd";
    public static final String paternYYYY_MM_DD_Space_mm_hh_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String COMMANDE_DATE_PATTERN = "dd/MM/yyyy HH:mm:ss";

    private DateUtil() {

    }

    public static boolean isFormatYYYYMMDDmmhhSS(String date) {
        return parseYYYYMMDDmmhhSS(date) != null;
    }

    public static java.util.Date parseCommandeStyle(String date) {
        return parse(date, COMMANDE_DATE_PATTERN);
    }

    public static String formatCommandeStyle(java.util.Date date) {
        return format(date, COMMANDE_DATE_PATTERN);
    }

    public static java.util.Date parseYYYYMMDDmmhhSS(String date) {
        return parse(date, paternYYYYMMDDmmhhSS);
    }

    public static String formatYYYYMMDDmmhhSS(java.util.Date date) {
        return format(date, paternYYYYMMDDmmhhSS);
    }

    public static String formatYYYY_MM_DD_Space_mm_hh_SS(java.util.Date date) {
        return format(date, paternYYYY_MM_DD_Space_mm_hh_SS);
    }

    public static java.util.Date now() {
        return new java.util.Date();
    }

    public static java.util.Date parse(String date, String pattern) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        java.util.Date myParsedDate = null;
        try {
            myParsedDate = formatter.parse(date);
        } catch (ParseException e) {
        }
        return myParsedDate;
    }

    public static String format(java.util.Date date, String pattern) {
        if (date != null) {
            SimpleDateFormat formatter = new SimpleDateFormat(pattern);
            return formatter.format(date);
        }
        return null;
    }

    public static java.sql.Date convertToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
 
}
