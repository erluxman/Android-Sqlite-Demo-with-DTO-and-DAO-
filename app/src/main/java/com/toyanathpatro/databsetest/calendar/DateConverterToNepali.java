package com.toyanathpatro.databsetest.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by adventure on 12/21/15.
 */
public class DateConverterToNepali {


    public static int tempYear;
    public static int tempMonth;
    public static int tempDay;
    public static String temp;
    public static int [] nepaliDateArray = {0000,00,00,00};


    public static final int startingEngYear = 1944;
    public static final int startingEngMonth = 0;
    public static final int startingEngDay = 1;
    public static int dayOfWeek; // 1944/1/1 is Saturday

    //Equivalent REFRENCE NEPALI DATE
    public static final int startingNepYear = 2000;
    public static final int startingNepMonth = 9;
    public static final int startingNepDay = 17;


    //MAPPING ARRAY FOR NEPALI ith MONTH DAYS VALUE
    public static Map<Integer, int[]> nepaliMap;


    public static int[] adBase = {1944, 1, 1, 7};


    public static int[] bsBase = {2000, 1, 1, 4};
    public static int[] adToBS = {2000, 9, 16, 6};
    public static int[] bsTOAD = {1943, 4, 13, 3};

    public static int dateArray[][] = {{2, 4, 3, 4, 3, 2, 2, 2, 1, 2, 1, 3}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 4, 3, 2, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 3}, {2, 4, 3, 4, 3, 2, 2, 2, 1, 2, 1, 3}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 4, 3, 2, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 3}, {3, 3, 3, 4, 3, 3, 1, 2, 2, 1, 1, 3}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 4, 3, 2, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 3}, {3, 3, 3, 4, 3, 3, 1, 2, 2, 1, 2, 2}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 4, 3, 2, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 3}, {3, 3, 3, 4, 3, 3, 1, 2, 2, 1, 2, 2}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 2, 1, 3}, {3, 3, 3, 4, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 2, 1, 3}, {3, 3, 3, 4, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 3}, {2, 4, 3, 4, 3, 2, 2, 2, 1, 2, 1, 3}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 3, 4, 2, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 3}, {2, 4, 3, 4, 3, 2, 2, 2, 1, 2, 1, 3}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 4, 3, 2, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 3}, {2, 4, 3, 4, 3, 3, 1, 2, 2, 1, 1, 3}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 4, 3, 2, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 3}, {3, 3, 3, 4, 3, 3, 1, 2, 2, 1, 2, 2}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 4, 3, 2, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 3}, {3, 3, 3, 4, 3, 3, 1, 2, 2, 1, 2, 2}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 3}, {3, 3, 3, 4, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 2, 1, 3}, {3, 3, 3, 4, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 2, 1, 3}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 3, 4, 2, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 3}, {2, 4, 3, 4, 3, 2, 2, 2, 1, 2, 1, 3}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 4, 3, 2, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 3}, {2, 4, 3, 4, 3, 3, 1, 2, 1, 2, 1, 3}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 4, 3, 2, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 3}, {3, 3, 3, 4, 3, 3, 1, 2, 2, 1, 1, 3}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 4, 3, 2, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 3}, {3, 3, 3, 4, 3, 3, 1, 2, 2, 1, 2, 2}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 3}, {3, 3, 3, 4, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 2, 1, 3}, {3, 3, 3, 4, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 3, 4, 3, 3, 3, 2, 1, 2, 1, 2, 2}, {3, 4, 3, 4, 3, 2, 2, 2, 1, 1, 2, 2}, {3, 3, 4, 4, 3, 2, 2, 2, 1, 2, 2, 2}, {2, 4, 3, 4, 3, 2, 2, 2, 1, 2, 2, 2}, {3, 3, 4, 3, 3, 2, 2, 2, 1, 2, 2, 2}, {3, 3, 4, 3, 3, 2, 2, 2, 1, 2, 2, 2}, {3, 4, 3, 4, 2, 3, 2, 2, 1, 2, 2, 2}, {2, 4, 3, 4, 3, 2, 2, 2, 1, 2, 2, 2}, {3, 3, 4, 3, 3, 3, 2, 2, 1, 2, 2, 2}, {2, 3, 4, 4, 2, 3, 2, 2, 1, 2, 2, 2}, {2, 4, 3, 4, 3, 2, 2, 2, 1, 2, 2, 2}, {2, 4, 3, 4, 3, 2, 2, 2, 1, 2, 2, 2}};


    public static String[] nepaliMonths = {"चैत्र", "बैशाख", "जेष्ठ", "आषाढ", "श्रावण", "भाद्र",
            "आश्विन", "कार्तिक", "मंसिर", "पौष", "माघ", "फाल्गुन", "चैत्र"};
    public static String[] nepaliDays = {"श", "आ", "सो", "म", "बु", "बि", "शु", "श"};
    public static String[] lngNepaliDays = {"शनिबार", "आइतबार", "सोमबार", "मंगलबार", "बुधबार", "बिहिबार", "शुक्रबार", "शनिबार"};
    public static String[] lngEngMonths = {"January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October", "November", "December"};

    public static String[] engMonths = {"Jan", "Feb", "Mar", "Apr", "May",
            "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static String[] engDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    // This class will convert the  date from AD to BC and vice Versa
    // Normally called from converter Fragment


    public static String convertToNepali(int y, int m, int d) {


        temp = "";
        tempYear = y;
        tempMonth = m - 1;
        tempDay = d;

        if (dateValidation()) {

            initialize();
            // main block goes here


            Calendar currentEngDate = new GregorianCalendar();
            currentEngDate.set(tempYear, tempMonth, tempDay);
            Calendar baseEngDate = new GregorianCalendar();
            baseEngDate.set(startingEngYear, startingEngMonth, startingEngDay);
            long totalEngDaysCount = daysBetween(baseEngDate, currentEngDate);
            calculateNepaliDate(totalEngDaysCount);


            // main conversion ends

        } else {
            temp = "!! Enter Date From 1944AD TO 2033 AD !!";
        }


        return temp;

    }

    //FUNCTION THAT RETURNS THE DIFFERENCE BETWEEN THE REFRENCE ENGLISH DATE AND THE GIVEN ENGLISH DATE IN DAYS
    public static long daysBetween(Calendar startDate, Calendar endDate) {
        Calendar date = (Calendar) startDate.clone();
        long daysBetween = 0;
        while (date.before(endDate)) {
            date.add(Calendar.DAY_OF_MONTH, 1);
            daysBetween++;
        }

        return daysBetween;
    }


    //THIS JUST INITIIALIZES THE MONTH AND DAY MAPPING OF NEPALI DATE
    public static void initialize() {

        nepaliMap = new HashMap<Integer, int[]>();
        nepaliMap.put(2000, new int[]{0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        nepaliMap.put(2001, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2002, new int[]{0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2003, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        nepaliMap.put(2004, new int[]{0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        nepaliMap.put(2005, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2006, new int[]{0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2007, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        nepaliMap.put(2008, new int[]{0, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31});
        nepaliMap.put(2009, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2010, new int[]{0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2011, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        nepaliMap.put(2012, new int[]{0, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        nepaliMap.put(2013, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2014, new int[]{0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2015, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        nepaliMap.put(2016, new int[]{0, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        nepaliMap.put(2017, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2018, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2019, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        nepaliMap.put(2020, new int[]{0, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2021, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2022, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        nepaliMap.put(2023, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        nepaliMap.put(2024, new int[]{0, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2025, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2026, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        nepaliMap.put(2027, new int[]{0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        nepaliMap.put(2028, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2029, new int[]{0, 31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2030, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        nepaliMap.put(2031, new int[]{0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        nepaliMap.put(2032, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2033, new int[]{0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2034, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        nepaliMap.put(2035, new int[]{0, 30, 32, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31});
        nepaliMap.put(2036, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2037, new int[]{0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2038, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        nepaliMap.put(2039, new int[]{0, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        nepaliMap.put(2040, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2041, new int[]{0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2042, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        nepaliMap.put(2043, new int[]{0, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        nepaliMap.put(2044, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2045, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2046, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        nepaliMap.put(2047, new int[]{0, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2048, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2049, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        nepaliMap.put(2050, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        nepaliMap.put(2051, new int[]{0, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2052, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2053, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        nepaliMap.put(2054, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        nepaliMap.put(2055, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2056, new int[]{0, 31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2057, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        nepaliMap.put(2058, new int[]{0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        nepaliMap.put(2059, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2060, new int[]{0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2061, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        nepaliMap.put(2062, new int[]{0, 30, 32, 31, 32, 31, 31, 29, 30, 29, 30, 29, 31});
        nepaliMap.put(2063, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2064, new int[]{0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2065, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        nepaliMap.put(2066, new int[]{0, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31});
        nepaliMap.put(2067, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2068, new int[]{0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2069, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        nepaliMap.put(2070, new int[]{0, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        nepaliMap.put(2071, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2072, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2073, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        nepaliMap.put(2074, new int[]{0, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2075, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2076, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        nepaliMap.put(2077, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        nepaliMap.put(2078, new int[]{0, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2079, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        nepaliMap.put(2080, new int[]{0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        nepaliMap.put(2081, new int[]{0, 31, 31, 32, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        nepaliMap.put(2082, new int[]{0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        nepaliMap.put(2083, new int[]{0, 31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30});
        nepaliMap.put(2084, new int[]{0, 31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30});
        nepaliMap.put(2085, new int[]{0, 31, 32, 31, 32, 30, 31, 30, 30, 29, 30, 30, 30});
        nepaliMap.put(2086, new int[]{0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        nepaliMap.put(2087, new int[]{0, 31, 31, 32, 31, 31, 31, 30, 30, 29, 30, 30, 30});
        nepaliMap.put(2088, new int[]{0, 30, 31, 32, 32, 30, 31, 30, 30, 29, 30, 30, 30});
        nepaliMap.put(2089, new int[]{0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        nepaliMap.put(2090, new int[]{0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});


    }


    private static boolean dateValidation() {


        if ((tempYear >= 1944 && tempYear <= 2033) && (tempDay >= 1 && tempDay <= 31) && (tempMonth >= 1 && tempMonth <= 12)) {
            return true;
        }


        return false;


    }


    private static void calculateNepaliDate(long totalEngDaysCount) {
// decrement totalEngDaysCount until its value becomes 0

        // CONVERTED NEPALI DATE STORING VARAIBALES
        int nepYear;
        int nepMonth;
        int nepDay;

        nepYear = startingNepYear;
        nepMonth = startingNepMonth;
        nepDay = startingNepDay;
        dayOfWeek = Calendar.SATURDAY;
        while (totalEngDaysCount != 0) {

            // getting the total number of days in month nepMonth in year nepYear

            int daysInIthMonth;

            daysInIthMonth = nepaliMap.get(nepYear)[nepMonth];


            nepDay++; // incrementing nepali day

            if (nepDay > daysInIthMonth) {
                nepMonth++;
                nepDay = 1;
            }
            if (nepMonth > 12) {
                nepYear++;
                nepMonth = 1;
            }

            dayOfWeek++; // count the days in terms of 7 days
            if (dayOfWeek > 7) {
                dayOfWeek = 1;
            }

            totalEngDaysCount--;
        }

        // convertedDate.setTextSize(13);


        temp = getNepaliNumber(nepYear) + " " + getMonthName(nepMonth) + " " + getNepaliNumber(nepDay) + ", " + getDayName(dayOfWeek);

        nepaliDateArray[0]=  nepYear;
        nepaliDateArray[1]=  nepMonth;
        nepaliDateArray[2]=  nepDay;
        nepaliDateArray[3]=  dayOfWeek;
        

    }


    //ENGLISH NUMBER CONVERSION TO NEAPLI NUMBER
    private static String getNepaliNumber(Integer digit) {

        String nepaliNo = "";
        char[] splitNo = digit.toString().toCharArray();

        for (char c : splitNo) {
            nepaliNo = nepaliNo + getNepaliDigit(c);

        }


        return nepaliNo;
    }


    //ENGLISH DIGIT CONVERSION TO NEPALI DIGIT

    private static char getNepaliDigit(char c) {
        if (c == '0') return '०';
        if (c == '1') return '१';
        if (c == '2') return '२';
        if (c == '3') return '३';
        if (c == '4') return '४';
        if (c == '5') return '५';
        if (c == '6') return '६';
        if (c == '7') return '७';
        if (c == '8') return '८';
        if (c == '9') return '९';

        return '०';
    }


    //METHOD TO RETURN MONTH NAME WHEN POSITION IS GIVEN
    private static String getMonthName(int pos) {
        if (pos == 1) return "बैसाख";
        if (pos == 2) return "जेठ";
        if (pos == 3) return "असार";
        if (pos == 4) return "साउन";
        if (pos == 5) return "भदौ";
        if (pos == 6) return "असोज";
        if (pos == 7) return "कार्तिक";
        if (pos == 8) return "मंसिर";
        if (pos == 9) return "पुष";
        if (pos == 10) return "माघ";
        if (pos == 11) return "फाल्गुन";
        if (pos == 12) return "चैत";

        return "INVALID";


    }


    //METHOD TO RETURN DAYS NAME WHEN POSITION IS GIVEN
    private static String getDayName(int pos) {
        if (pos == 1) return "आइतबार";
        if (pos == 2) return "सोमबार";
        if (pos == 3) return "मंगलबार";
        if (pos == 4) return "बुधबार";
        if (pos == 5) return "बिहबार";
        if (pos == 6) return "शुक्रबार";
        if (pos == 7) return "शनिबार";

        return "INVALID";


    }
    
    
    public  static int[] getNepaliDateArray(int y,int m, int d ) {
    	String temp = convertToNepali(y, m, d);
    	
    	return nepaliDateArray;
    }

}
