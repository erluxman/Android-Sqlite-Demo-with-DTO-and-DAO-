
package com.toyanathpatro.databsetest.calendar;


import com.toyanathpatro.databsetest.databse.CalendarDto;

import java.util.ArrayList;

public class Test {



    public static void main(String[] args) {
        GetMonthCalendar monthCalendar  = new GetMonthCalendar();

        ArrayList<CalendarDto> data =monthCalendar.getAmonthData(2072, 8);
        CalendarDto temp;
        for (int i=0;i<data.size();i++){
            temp = data.get(i);
            System.out.println(temp.getGate()+"  ,"+temp.getDay()+"  ,"+temp.getMonthEnId()+"   "+temp.getMonthNpId()+"   "+temp.getMahina()+"   "+temp.getMonthEn() + "  "+temp.getYearNp() +"  "+temp.getYearEn()+ "    "+DateConverterToEnglish.getDayName(temp.getDayId()));
        }

       /* String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

        int year, month, day;
        year = Integer.parseInt(timeStamp.substring(0,4));
        month = Integer.parseInt(timeStamp.substring(4,6));
        day = Integer.parseInt(timeStamp.substring(6,8));
        int [] currnetNepaliDate = DateConverte





        rToNepali.getNepaliDateArray(year,month,day);

        System.out.println(year + " "+month + " "+day);
        System.out.println(currnetNepaliDate[0] + " "+currnetNepaliDate[1] + " "+currnetNepaliDate[2]);

*/
    }



}
