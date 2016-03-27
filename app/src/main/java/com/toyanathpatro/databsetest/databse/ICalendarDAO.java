package com.toyanathpatro.databsetest.databse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adventure on 3/24/16.
 */
public interface ICalendarDAO {

    ArrayList<CalendarDto> getCalendar(String calendarType, String year);

    ArrayList<CalendarDto> getCalendarByMonth(String calendarType, String year, String month);

    CalendarDto getCalendarByMonthAndDay(String calendarType, String year, String month, String day);

    long setCalendar(List<CalendarDto> calendar);
    long updateCalendarByYearMonthAndDay(CalendarDto calendar, String year, String month, String day);
    long deleteCalendarByday(String year, String month, String day);
    long deleteCalendarByMonth(String year, String month);
    long deleteCalendarByYear(String year);
}
