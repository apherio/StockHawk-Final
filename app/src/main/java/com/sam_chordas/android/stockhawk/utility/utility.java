package com.sam_chordas.android.stockhawk.utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Sahil on 9/8/2016.
 */
public class utility {

    public static final String DATE_FORMAT = "yyyy-MM-dd";

    public static String getFormattedDate(long dateInMillis) {
        Locale localeUS = new Locale("en", "US");
        SimpleDateFormat queryDayFormat = new SimpleDateFormat(utility.DATE_FORMAT, localeUS);
        return queryDayFormat.format(dateInMillis);
    }

    public static String get1WeekBackDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, -7);

        return getFormattedDate(cal.getTimeInMillis());
    }

    public static String get1MonthBackDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, -1);
        return getFormattedDate(cal.getTimeInMillis());
    }

    public static String get3MonthsBackDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, -3);
        return getFormattedDate(cal.getTimeInMillis());
    }

    public static String get6MonthsBackDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, -6);

        return getFormattedDate(cal.getTimeInMillis());
    }

    public static String get1YearBackDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, -1);
        return getFormattedDate(cal.getTimeInMillis());
    }
}
