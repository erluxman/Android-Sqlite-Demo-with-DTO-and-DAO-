package com.toyanathpatro.databsetest.calendar;



import com.toyanathpatro.databsetest.databse.CalendarDto;

import java.util.ArrayList;

/**
 * Created by adventure on 3/24/16.
 */
public class GetMonthCalendar {
    public GetMonthCalendar(){

    }

    public  ArrayList<CalendarDto> getAmonthData(int yr, int mnt) {
        int year = yr;
        int month = mnt+1;
        int daysOfMonth;
        int[] startingDayinfoInEnglish;
        int[] calendarOfTheYear;
        int[] endingDayinfoInEnglish;
        int transitionDay;
        ArrayList<CalendarDto> temp = new ArrayList<>();


        // System.out.println("Monthly Calendar  for 2072, baishakh");

        DateConverterToNepali.initialize();
        calendarOfTheYear = DateConverterToNepali.nepaliMap.get(year);
        daysOfMonth = calendarOfTheYear[month];
        startingDayinfoInEnglish = DateConverterToEnglish.getEnglishDateArray(
                year, month, 1);
        // System.out.println(" the last day of the month " + startingDayinfoInEnglish[2]);

        endingDayinfoInEnglish = DateConverterToEnglish.getEnglishDateArray(
                year, month, daysOfMonth);


        transitionDay = daysOfMonth - endingDayinfoInEnglish[2];


        int[] startingEnglishDay = DateConverterToEnglish.getEnglishDateArray(year, month, 1);
        int tempNepaliDay = 1;
        int currentEngMonth = startingEnglishDay[1];
        int currentEngYear = startingEnglishDay[0];
        int tempenglishDay = startingEnglishDay[2];

        int week = startingEnglishDay[3];


        for (int i = 0; i < daysOfMonth; i++) {
            CalendarDto tempDto = new CalendarDto();


            if (tempNepaliDay == transitionDay) {
				/*
				System.out.print(tempNepaliDay+" ");
				System.out.print(tempenglishDay+" ");*/
                tempDto.setDay(tempenglishDay+"");
                tempDto.setGate(tempNepaliDay+"");
                tempDto.setMonthEnId(currentEngMonth+"");
                tempDto.setMonthNpId(month+"");
                tempDto.setMahina(DateConverterToNepali.nepaliMonths[month]);
                tempDto.setMonthEn(DateConverterToNepali.engMonths[currentEngMonth - 1]);
                tempDto.setYearEn(currentEngYear+"");
                tempDto.setYearNp(year+"");
                tempDto.setDayId((week - 1)+"");
                tempenglishDay = 1;

                /*if(currentEngMonth==11){
                    currentEngMonth =0;
                    currentEngYear++;
                } else{
                    currentEngMonth++;
                }
                */
                currentEngMonth = DateConverterToEnglish.getEnglishDateArray(year, month, tempNepaliDay + 1)[1];
                currentEngYear = DateConverterToEnglish.getEnglishDateArray(year, month, tempNepaliDay + 1)[0];
                tempNepaliDay++;

                //System.out.print("\t");
                if (week == 7) {
                    //System.out.print("\n");
                    week = 0;

                }
                week++;


            } else {/*
				System.out.print(tempNepaliDay+" ");
				System.out.print(tempenglishDay+" ");*/
                tempDto.setDay(tempenglishDay+"");
                tempDto.setGate(tempNepaliDay+"");
                tempDto.setMonthEnId(currentEngMonth+"");
                tempDto.setMonthNpId(month+"");
                tempDto.setMahina(DateConverterToNepali.nepaliMonths[month]);
                tempDto.setMonthEn(DateConverterToNepali.engMonths[currentEngMonth - 1]);
                tempDto.setYearEn(currentEngYear+"");
                tempDto.setYearNp(year+"");
                tempDto.setDayId((week - 1)+"");


                tempenglishDay++;
                tempNepaliDay++;
                //System.out.print("\t");
                if (week == 7) {
                    //System.out.print("\n");
                    week = 0;

                }

                week++;



            }


            temp.add(tempDto);


        }
        return temp;

    }


}
