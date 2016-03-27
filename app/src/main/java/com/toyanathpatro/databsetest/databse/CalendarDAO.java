package com.toyanathpatro.databsetest.databse;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adventure on 2/1/16.
 */


public class CalendarDAO implements ICalendarDAO {


    DBHelper mDbHelper;

    SQLiteDatabase mDatabase;
    ContentValues mContentValues = new ContentValues();
    Cursor mCursor;

    public CalendarDAO(Context c) {
        mDbHelper = new DBHelper(c);
        mDatabase = mDbHelper.getWritableDatabase();
        Log.i("dbTest","Inside DAO constructor");


    }

    @Override
    public ArrayList<CalendarDto> getCalendar(String calendarType, String year) {

        ArrayList <CalendarDto> data = new ArrayList<>();
        CalendarDto mCalendarDto = new CalendarDto();
        String[] selectionArgs = {year};
        String[] columns = {


                CalendarDataItems.YEAR_EN,
                CalendarDataItems.DAY,
                CalendarDataItems.YEAR_NP,
                CalendarDataItems.MONTH_NP_ID,
                CalendarDataItems.MAHINA,
                CalendarDataItems.MONTH_EN_ID,
                CalendarDataItems.MONTH_EN,
                CalendarDataItems.GATE,
                CalendarDataItems.PAKSHYA,
                CalendarDataItems.DAY_ID,
                CalendarDataItems.TITHI,
                CalendarDataItems.TITHI_END,
                CalendarDataItems.NEWARI_TITHI,
                CalendarDataItems.NAKSHATRA,
                CalendarDataItems.NAKSHATRA_END,
                CalendarDataItems.YOG,
                CalendarDataItems.YOG_END,
                CalendarDataItems.KARAN,
                CalendarDataItems.KARAN_END,
                CalendarDataItems.AANADI_YOGA,
                CalendarDataItems.SUNRISE,
                CalendarDataItems.SUNSET,
                CalendarDataItems.BHADRA,
                CalendarDataItems.IMAGE_URL,
                CalendarDataItems.IS_HOLODAY,
                CalendarDataItems.IS_IMPORTANT,
                CalendarDataItems.DAY_INFO};

        mCursor = mDatabase.query(true, CalendarDataItems.TABLE_NAME, columns, CalendarDataItems.YEAR_NP + " =? ", selectionArgs, null, null, CalendarDataItems.GATE+" ASC, " + CalendarDataItems.MONTH_NP_ID+" ASC, " + CalendarDataItems.YEAR_NP, null);

        while (mCursor.moveToNext()) {

            //get column indices

            int yearEnIndex = mCursor.getColumnIndex(CalendarDataItems.YEAR_EN);
            int monthEnIdIndex = mCursor.getColumnIndex(CalendarDataItems.MONTH_EN_ID);
            int monthEnIndex = mCursor.getColumnIndex(CalendarDataItems.MONTH_EN);
            int dateIndex = mCursor.getColumnIndex(CalendarDataItems.DAY);
            int yearNpIndex = mCursor.getColumnIndex(CalendarDataItems.YEAR_NP);
            int monthNpIdIndex = mCursor.getColumnIndex(CalendarDataItems.MONTH_NP_ID);
            int mahinaIndex = mCursor.getColumnIndex(CalendarDataItems.MAHINA);
            int gateIndex = mCursor.getColumnIndex(CalendarDataItems.GATE);
            int pakshyaIndex = mCursor.getColumnIndex(CalendarDataItems.PAKSHYA);
            int dayIDIndex = mCursor.getColumnIndex(CalendarDataItems.DAY_ID);
            int tithiIndex = mCursor.getColumnIndex(CalendarDataItems.TITHI);
            int tithiEndIndex = mCursor.getColumnIndex(CalendarDataItems.TITHI_END);
            int newariTithiIndex = mCursor.getColumnIndex(CalendarDataItems.NEWARI_TITHI);
            int nakshatraIndex = mCursor.getColumnIndex(CalendarDataItems.NAKSHATRA);
            int nakshatraEndIndex = mCursor.getColumnIndex(CalendarDataItems.NAKSHATRA_END);
            int yogIndex = mCursor.getColumnIndex(CalendarDataItems.YOG);
            int yogEndIndex = mCursor.getColumnIndex(CalendarDataItems.YOG_END);
            int karanIndex = mCursor.getColumnIndex(CalendarDataItems.KARAN);
            int karanEndIndex = mCursor.getColumnIndex(CalendarDataItems.KARAN_END);
            int aanadiYogaIndex = mCursor.getColumnIndex(CalendarDataItems.AANADI_YOGA);
            int sunriseIndex = mCursor.getColumnIndex(CalendarDataItems.SUNRISE);
            int sunsetIndex = mCursor.getColumnIndex(CalendarDataItems.SUNSET);
            int bhadraIndex = mCursor.getColumnIndex(CalendarDataItems.BHADRA);
            int imageUrlIndex = mCursor.getColumnIndex(CalendarDataItems.IMAGE_URL);
            int isHoliDayIndex = mCursor.getColumnIndex(CalendarDataItems.IS_HOLODAY);
            int isImportantIndex = mCursor.getColumnIndex(CalendarDataItems.IS_IMPORTANT);
            int dayInfoIndex = mCursor.getColumnIndex(CalendarDataItems.DAY_INFO);


            // add column

            mCalendarDto=new CalendarDto();


            mCalendarDto.setYearEn(mCursor.getString(yearEnIndex));
            mCalendarDto.setMonthEnId(mCursor.getString(monthEnIdIndex));
            mCalendarDto.setMonthEn(mCursor.getString(monthEnIndex));
            mCalendarDto.setDay(mCursor.getString(dateIndex));
            mCalendarDto.setYearNp(mCursor.getString(yearNpIndex));
            mCalendarDto.setMonthNpId(mCursor.getString(monthNpIdIndex));
            mCalendarDto.setMahina(mCursor.getString(mahinaIndex));
            mCalendarDto.setGate(mCursor.getString(gateIndex));
            mCalendarDto.setPakshya(mCursor.getString(pakshyaIndex));
            mCalendarDto.setDayId(mCursor.getString(dayIDIndex));
            mCalendarDto.setTithi(mCursor.getString(tithiIndex));
            mCalendarDto.setTithiEnd(mCursor.getString(tithiEndIndex));
            mCalendarDto.setNewariTithi(mCursor.getString(newariTithiIndex));
            mCalendarDto.setNakshatra(mCursor.getString(nakshatraIndex));
            mCalendarDto.setNakshatraEnd(mCursor.getString(nakshatraEndIndex));
            mCalendarDto.setYog(mCursor.getString(yogIndex));
            mCalendarDto.setYogEnd(mCursor.getString(yogEndIndex));
            mCalendarDto.setKaran(mCursor.getString(karanIndex));
            mCalendarDto.setKaranEnd(mCursor.getString(karanEndIndex));
            mCalendarDto.setAanandiyoga(mCursor.getString(aanadiYogaIndex));
            mCalendarDto.setSunrise(mCursor.getString(sunriseIndex));
            mCalendarDto.setSunset(mCursor.getString(sunsetIndex));
            mCalendarDto.setBhadra(mCursor.getString(bhadraIndex));
            mCalendarDto.setImageUrl(mCursor.getString(imageUrlIndex));
            mCalendarDto.setIsHoliday(mCursor.getString(isHoliDayIndex));
            mCalendarDto.setIsImportant(mCursor.getString(isImportantIndex));
            mCalendarDto.setDayInfo(mCursor.getString(dayInfoIndex));
            data.add(mCalendarDto);
        }


        return data;


    }

    @Override
    public ArrayList<CalendarDto> getCalendarByMonth(String calendarType, String year, String month) {
        ArrayList <CalendarDto> data = new ArrayList<>();
        CalendarDto mCalendarDto = new CalendarDto();
        String[] selectionArgs = {year,month};
        String[] columns = {

                CalendarDataItems.COLUMN_ID,
                CalendarDataItems.YEAR_EN,
                CalendarDataItems.DAY,
                CalendarDataItems.YEAR_NP,
                CalendarDataItems.MONTH_NP_ID,
                CalendarDataItems.MAHINA,
                CalendarDataItems.MONTH_EN_ID,
                CalendarDataItems.MONTH_EN,
                CalendarDataItems.GATE,
                CalendarDataItems.PAKSHYA,
                CalendarDataItems.DAY_ID,
                CalendarDataItems.TITHI,
                CalendarDataItems.TITHI_END,
                CalendarDataItems.NEWARI_TITHI,
                CalendarDataItems.NAKSHATRA,
                CalendarDataItems.NAKSHATRA_END,
                CalendarDataItems.YOG,
                CalendarDataItems.YOG_END,
                CalendarDataItems.KARAN,
                CalendarDataItems.KARAN_END,
                CalendarDataItems.AANADI_YOGA,
                CalendarDataItems.SUNRISE,
                CalendarDataItems.SUNSET,
                CalendarDataItems.BHADRA,
                CalendarDataItems.IMAGE_URL,
                CalendarDataItems.IS_HOLODAY,
                CalendarDataItems.IS_IMPORTANT,
                CalendarDataItems.DAY_INFO};

        mCursor = mDatabase.query(true, CalendarDataItems.TABLE_NAME, columns, CalendarDataItems.YEAR_NP + " =? AND "+ CalendarDataItems.MONTH_NP_ID+" =?", selectionArgs, null, null, CalendarDataItems.YEAR_NP+" ASC, " + CalendarDataItems.MONTH_NP_ID+" ASC, " + CalendarDataItems.GATE, null);

        while (mCursor.moveToNext()) {

            //get column indices

            int yearEnIndex = mCursor.getColumnIndex(CalendarDataItems.YEAR_EN);
            int monthEnIdIndex = mCursor.getColumnIndex(CalendarDataItems.MONTH_EN_ID);
            int monthEnIndex = mCursor.getColumnIndex(CalendarDataItems.MONTH_EN);
            int dateIndex = mCursor.getColumnIndex(CalendarDataItems.DAY);
            int yearNpIndex = mCursor.getColumnIndex(CalendarDataItems.YEAR_NP);
            int monthNpIdIndex = mCursor.getColumnIndex(CalendarDataItems.MONTH_NP_ID);
            int mahinaIndex = mCursor.getColumnIndex(CalendarDataItems.MAHINA);
            int gateIndex = mCursor.getColumnIndex(CalendarDataItems.GATE);
            int pakshyaIndex = mCursor.getColumnIndex(CalendarDataItems.PAKSHYA);
            int dayIDIndex = mCursor.getColumnIndex(CalendarDataItems.DAY_ID);
            int tithiIndex = mCursor.getColumnIndex(CalendarDataItems.TITHI);
            int tithiEndIndex = mCursor.getColumnIndex(CalendarDataItems.TITHI_END);
            int newariTithiIndex = mCursor.getColumnIndex(CalendarDataItems.NEWARI_TITHI);
            int nakshatraIndex = mCursor.getColumnIndex(CalendarDataItems.NAKSHATRA);
            int nakshatraEndIndex = mCursor.getColumnIndex(CalendarDataItems.NAKSHATRA_END);
            int yogIndex = mCursor.getColumnIndex(CalendarDataItems.YOG);
            int yogEndIndex = mCursor.getColumnIndex(CalendarDataItems.YOG_END);
            int karanIndex = mCursor.getColumnIndex(CalendarDataItems.KARAN);
            int karanEndIndex = mCursor.getColumnIndex(CalendarDataItems.KARAN_END);
            int aanadiYogaIndex = mCursor.getColumnIndex(CalendarDataItems.AANADI_YOGA);
            int sunriseIndex = mCursor.getColumnIndex(CalendarDataItems.SUNRISE);
            int sunsetIndex = mCursor.getColumnIndex(CalendarDataItems.SUNSET);
            int bhadraIndex = mCursor.getColumnIndex(CalendarDataItems.BHADRA);
            int imageUrlIndex = mCursor.getColumnIndex(CalendarDataItems.IMAGE_URL);
            int isHoliDayIndex = mCursor.getColumnIndex(CalendarDataItems.IS_HOLODAY);
            int isImportantIndex = mCursor.getColumnIndex(CalendarDataItems.IS_IMPORTANT);
            int dayInfoIndex = mCursor.getColumnIndex(CalendarDataItems.DAY_INFO);


            // add column


            mCalendarDto.setYearEn(mCursor.getString(yearEnIndex));
            mCalendarDto.setMonthEnId(mCursor.getString(monthEnIdIndex));
            mCalendarDto.setMonthEn(mCursor.getString(monthEnIndex));
            mCalendarDto.setDay(mCursor.getString(dateIndex));
            mCalendarDto.setYearNp(mCursor.getString(yearNpIndex));
            mCalendarDto.setMonthNpId(mCursor.getString(monthNpIdIndex));
            mCalendarDto.setMahina(mCursor.getString(mahinaIndex));
            mCalendarDto.setGate(mCursor.getString(gateIndex));
            mCalendarDto.setPakshya(mCursor.getString(pakshyaIndex));
            mCalendarDto.setDayId(mCursor.getString(dayIDIndex));
            mCalendarDto.setTithi(mCursor.getString(tithiIndex));
            mCalendarDto.setTithiEnd(mCursor.getString(tithiEndIndex));
            mCalendarDto.setNewariTithi(mCursor.getString(newariTithiIndex));
            mCalendarDto.setNakshatra(mCursor.getString(nakshatraIndex));
            mCalendarDto.setNakshatraEnd(mCursor.getString(nakshatraEndIndex));
            mCalendarDto.setYog(mCursor.getString(yogIndex));
            mCalendarDto.setYogEnd(mCursor.getString(yogEndIndex));
            mCalendarDto.setKaran(mCursor.getString(karanIndex));
            mCalendarDto.setKaranEnd(mCursor.getString(karanEndIndex));
            mCalendarDto.setAanandiyoga(mCursor.getString(aanadiYogaIndex));
            mCalendarDto.setSunrise(mCursor.getString(sunriseIndex));
            mCalendarDto.setSunset(mCursor.getString(sunsetIndex));
            mCalendarDto.setBhadra(mCursor.getString(bhadraIndex));
            mCalendarDto.setImageUrl(mCursor.getString(imageUrlIndex));
            mCalendarDto.setIsHoliday(mCursor.getString(isHoliDayIndex));
            mCalendarDto.setIsImportant(mCursor.getString(isImportantIndex));
            mCalendarDto.setDayInfo(mCursor.getString(dayInfoIndex));
            data.add(mCalendarDto);
        }


        return data;
    }

    @Override
    public CalendarDto getCalendarByMonthAndDay(String calendarType, String year, String month, String day) {

        CalendarDto mCalendarDto = new CalendarDto();
        String[] selectionArgs = {year,month,day};
        String[] columns = {

                CalendarDataItems.COLUMN_ID,
                CalendarDataItems.YEAR_EN,
                CalendarDataItems.DAY,
                CalendarDataItems.YEAR_NP,
                CalendarDataItems.MONTH_NP_ID,
                CalendarDataItems.MAHINA,
                CalendarDataItems.MONTH_EN_ID,
                CalendarDataItems.MONTH_EN,
                CalendarDataItems.GATE,
                CalendarDataItems.PAKSHYA,
                CalendarDataItems.DAY_ID,
                CalendarDataItems.TITHI,
                CalendarDataItems.TITHI_END,
                CalendarDataItems.NEWARI_TITHI,
                CalendarDataItems.NAKSHATRA,
                CalendarDataItems.NAKSHATRA_END,
                CalendarDataItems.YOG,
                CalendarDataItems.YOG_END,
                CalendarDataItems.KARAN,
                CalendarDataItems.KARAN_END,
                CalendarDataItems.AANADI_YOGA,
                CalendarDataItems.SUNRISE,
                CalendarDataItems.SUNSET,
                CalendarDataItems.BHADRA,
                CalendarDataItems.IMAGE_URL,
                CalendarDataItems.IS_HOLODAY,
                CalendarDataItems.IS_IMPORTANT,
                CalendarDataItems.DAY_INFO};

        mCursor = mDatabase.query(true, CalendarDataItems.TABLE_NAME, columns, CalendarDataItems.YEAR_NP + " =? AND "+ CalendarDataItems.MONTH_NP_ID+" =? AND "+ CalendarDataItems.GATE, selectionArgs, null, null, CalendarDataItems.YEAR_NP+" ASC, " + CalendarDataItems.MONTH_NP_ID+" ASC, " + CalendarDataItems.GATE, null);

        while (mCursor.moveToNext()) {

            //get column indices

            int yearEnIndex = mCursor.getColumnIndex(CalendarDataItems.YEAR_EN);
            int monthEnIdIndex = mCursor.getColumnIndex(CalendarDataItems.MONTH_EN_ID);
            int monthEnIndex = mCursor.getColumnIndex(CalendarDataItems.MONTH_EN);
            int dateIndex = mCursor.getColumnIndex(CalendarDataItems.DAY);
            int yearNpIndex = mCursor.getColumnIndex(CalendarDataItems.YEAR_NP);
            int monthNpIdIndex = mCursor.getColumnIndex(CalendarDataItems.MONTH_NP_ID);
            int mahinaIndex = mCursor.getColumnIndex(CalendarDataItems.MAHINA);
            int gateIndex = mCursor.getColumnIndex(CalendarDataItems.GATE);
            int pakshyaIndex = mCursor.getColumnIndex(CalendarDataItems.PAKSHYA);
            int dayIDIndex = mCursor.getColumnIndex(CalendarDataItems.DAY_ID);
            int tithiIndex = mCursor.getColumnIndex(CalendarDataItems.TITHI);
            int tithiEndIndex = mCursor.getColumnIndex(CalendarDataItems.TITHI_END);
            int newariTithiIndex = mCursor.getColumnIndex(CalendarDataItems.NEWARI_TITHI);
            int nakshatraIndex = mCursor.getColumnIndex(CalendarDataItems.NAKSHATRA);
            int nakshatraEndIndex = mCursor.getColumnIndex(CalendarDataItems.NAKSHATRA_END);
            int yogIndex = mCursor.getColumnIndex(CalendarDataItems.YOG);
            int yogEndIndex = mCursor.getColumnIndex(CalendarDataItems.YOG_END);
            int karanIndex = mCursor.getColumnIndex(CalendarDataItems.KARAN);
            int karanEndIndex = mCursor.getColumnIndex(CalendarDataItems.KARAN_END);
            int aanadiYogaIndex = mCursor.getColumnIndex(CalendarDataItems.AANADI_YOGA);
            int sunriseIndex = mCursor.getColumnIndex(CalendarDataItems.SUNRISE);
            int sunsetIndex = mCursor.getColumnIndex(CalendarDataItems.SUNSET);
            int bhadraIndex = mCursor.getColumnIndex(CalendarDataItems.BHADRA);
            int imageUrlIndex = mCursor.getColumnIndex(CalendarDataItems.IMAGE_URL);
            int isHoliDayIndex = mCursor.getColumnIndex(CalendarDataItems.IS_HOLODAY);
            int isImportantIndex = mCursor.getColumnIndex(CalendarDataItems.IS_IMPORTANT);
            int dayInfoIndex = mCursor.getColumnIndex(CalendarDataItems.DAY_INFO);


            // add column


            mCalendarDto.setYearEn(mCursor.getString(yearEnIndex));
            mCalendarDto.setMonthEnId(mCursor.getString(monthEnIdIndex));
            mCalendarDto.setMonthEn(mCursor.getString(monthEnIndex));
            mCalendarDto.setDay(mCursor.getString(dateIndex));
            mCalendarDto.setYearNp(mCursor.getString(yearNpIndex));
            mCalendarDto.setMonthNpId(mCursor.getString(monthNpIdIndex));
            mCalendarDto.setMahina(mCursor.getString(mahinaIndex));
            mCalendarDto.setGate(mCursor.getString(gateIndex));
            mCalendarDto.setPakshya(mCursor.getString(pakshyaIndex));
            mCalendarDto.setDayId(mCursor.getString(dayIDIndex));
            mCalendarDto.setTithi(mCursor.getString(tithiIndex));
            mCalendarDto.setTithiEnd(mCursor.getString(tithiEndIndex));
            mCalendarDto.setNewariTithi(mCursor.getString(newariTithiIndex));
            mCalendarDto.setNakshatra(mCursor.getString(nakshatraIndex));
            mCalendarDto.setNakshatraEnd(mCursor.getString(nakshatraEndIndex));
            mCalendarDto.setYog(mCursor.getString(yogIndex));
            mCalendarDto.setYogEnd(mCursor.getString(yogEndIndex));
            mCalendarDto.setKaran(mCursor.getString(karanIndex));
            mCalendarDto.setKaranEnd(mCursor.getString(karanEndIndex));
            mCalendarDto.setAanandiyoga(mCursor.getString(aanadiYogaIndex));
            mCalendarDto.setSunrise(mCursor.getString(sunriseIndex));
            mCalendarDto.setSunset(mCursor.getString(sunsetIndex));
            mCalendarDto.setBhadra(mCursor.getString(bhadraIndex));
            mCalendarDto.setImageUrl(mCursor.getString(imageUrlIndex));
            mCalendarDto.setIsHoliday(mCursor.getString(isHoliDayIndex));
            mCalendarDto.setIsImportant(mCursor.getString(isImportantIndex));
            mCalendarDto.setDayInfo(mCursor.getString(dayInfoIndex));
            break;
        }


        return mCalendarDto;
    }

    @Override
    public long setCalendar(List<CalendarDto> calendarList) {
        mContentValues = new ContentValues();
        CalendarDto calendarTouple;
        long response=0;

        for(int i=0;i<calendarList.size();i++) {
            calendarTouple = new CalendarDto();
            calendarTouple =calendarList.get(i);

            mContentValues.put(CalendarDataItems.YEAR_EN, calendarTouple.getYearEn());
            mContentValues.put(CalendarDataItems.MONTH_EN_ID, calendarTouple.getMonthEnId());
            mContentValues.put(CalendarDataItems.MONTH_EN, calendarTouple.getMonthEn());
            mContentValues.put(CalendarDataItems.DAY, calendarTouple.getDay());
            mContentValues.put(CalendarDataItems.YEAR_NP, calendarTouple.getYearNp());
            mContentValues.put(CalendarDataItems.MONTH_NP_ID, calendarTouple.getMonthNpId());
            mContentValues.put(CalendarDataItems.MAHINA, calendarTouple.getMahina());
            mContentValues.put(CalendarDataItems.GATE, calendarTouple.getGate());
            mContentValues.put(CalendarDataItems.PAKSHYA, calendarTouple.getPakshya());
            mContentValues.put(CalendarDataItems.DAY_ID, calendarTouple.getDayId());
            mContentValues.put(CalendarDataItems.TITHI, calendarTouple.getTithi());
            mContentValues.put(CalendarDataItems.TITHI_END, calendarTouple.getTithiEnd());
            mContentValues.put(CalendarDataItems.NEWARI_TITHI, calendarTouple.getNewariTithi());
            mContentValues.put(CalendarDataItems.NAKSHATRA, calendarTouple.getNakshatra());
            mContentValues.put(CalendarDataItems.NAKSHATRA_END, calendarTouple.getNakshatraEnd());
            mContentValues.put(CalendarDataItems.YOG, calendarTouple.getYog());
            mContentValues.put(CalendarDataItems.YOG_END, calendarTouple.getYogEnd());
            mContentValues.put(CalendarDataItems.KARAN, calendarTouple.getKaran());
            mContentValues.put(CalendarDataItems.KARAN_END, calendarTouple.getKaranEnd());
            mContentValues.put(CalendarDataItems.AANADI_YOGA, calendarTouple.getAanandiyoga());
            mContentValues.put(CalendarDataItems.SUNRISE, calendarTouple.getSunrise());
            mContentValues.put(CalendarDataItems.SUNSET, calendarTouple.getSunset());
            mContentValues.put(CalendarDataItems.BHADRA, calendarTouple.getBhadra());
            mContentValues.put(CalendarDataItems.IMAGE_URL, calendarTouple.getImageUrl());
            mContentValues.put(CalendarDataItems.IS_HOLODAY, calendarTouple.getIsHoliday());
            mContentValues.put(CalendarDataItems.IS_IMPORTANT, calendarTouple.getIsImportant());
            mContentValues.put(CalendarDataItems.DAY_INFO, calendarTouple.getDayInfo());



            response = mDatabase.insert(CalendarDataItems.TABLE_NAME, CalendarDataItems.YEAR_EN, mContentValues);

        }
        return response;
    }

    @Override
    public long updateCalendarByYearMonthAndDay(CalendarDto calendarTouple, String year, String month, String day) {
        mContentValues = new ContentValues();

        String[] whereArgs = {year, month, day};
        String whereClause = CalendarDataItems.YEAR_NP + "  =? AND " + CalendarDataItems.MONTH_NP_ID + " =? AND " + CalendarDataItems.GATE + " =?";


        mContentValues.put(CalendarDataItems.YEAR_EN, calendarTouple.getYearEn());
        mContentValues.put(CalendarDataItems.MONTH_EN_ID, calendarTouple.getMonthEnId());
        mContentValues.put(CalendarDataItems.MONTH_EN, calendarTouple.getMonthEn());
        mContentValues.put(CalendarDataItems.DAY, calendarTouple.getDay());
        mContentValues.put(CalendarDataItems.YEAR_NP, calendarTouple.getYearNp());
        mContentValues.put(CalendarDataItems.MONTH_NP_ID, calendarTouple.getMonthNpId());
        mContentValues.put(CalendarDataItems.MAHINA, calendarTouple.getMahina());
        mContentValues.put(CalendarDataItems.GATE, calendarTouple.getGate());
        mContentValues.put(CalendarDataItems.PAKSHYA, calendarTouple.getPakshya());
        mContentValues.put(CalendarDataItems.DAY_ID, calendarTouple.getDayId());
        mContentValues.put(CalendarDataItems.TITHI, calendarTouple.getTithi());
        mContentValues.put(CalendarDataItems.TITHI_END, calendarTouple.getTithiEnd());
        mContentValues.put(CalendarDataItems.NEWARI_TITHI, calendarTouple.getNewariTithi());
        mContentValues.put(CalendarDataItems.NAKSHATRA, calendarTouple.getNakshatra());
        mContentValues.put(CalendarDataItems.NAKSHATRA_END, calendarTouple.getNakshatraEnd());
        mContentValues.put(CalendarDataItems.YOG, calendarTouple.getYog());
        mContentValues.put(CalendarDataItems.YOG_END, calendarTouple.getYogEnd());
        mContentValues.put(CalendarDataItems.KARAN, calendarTouple.getKaran());
        mContentValues.put(CalendarDataItems.KARAN_END, calendarTouple.getKaranEnd());
        mContentValues.put(CalendarDataItems.AANADI_YOGA, calendarTouple.getAanandiyoga());
        mContentValues.put(CalendarDataItems.SUNRISE, calendarTouple.getSunrise());
        mContentValues.put(CalendarDataItems.SUNSET, calendarTouple.getSunset());
        mContentValues.put(CalendarDataItems.BHADRA, calendarTouple.getBhadra());
        mContentValues.put(CalendarDataItems.IMAGE_URL, calendarTouple.getImageUrl());
        mContentValues.put(CalendarDataItems.IS_HOLODAY, calendarTouple.getIsHoliday());
        mContentValues.put(CalendarDataItems.IS_IMPORTANT, calendarTouple.getIsImportant());
        mContentValues.put(CalendarDataItems.DAY_INFO, calendarTouple.getDayInfo());

        return  mDatabase.update(CalendarDataItems.TABLE_NAME, mContentValues, whereClause, whereArgs);



    }

    @Override
    public long deleteCalendarByday(String year, String month, String day) {
        String[] selArgs = {year, month, day};
        return mDatabase.delete(CalendarDataItems.TABLE_NAME, CalendarDataItems.YEAR_NP + "  =? AND " + CalendarDataItems.YEAR_NP + " =? AND " + CalendarDataItems.GATE + " =?", selArgs);
    }

    @Override
    public long deleteCalendarByMonth(String year, String month) {
        String[] selArgs = {year, month};

        return mDatabase.delete(CalendarDataItems.TABLE_NAME, CalendarDataItems.YEAR_NP + " =? AND " + CalendarDataItems.MONTH_NP_ID + " =?", selArgs);
    }

    @Override
    public long deleteCalendarByYear(String year) {

        String[] selArgs = {year};
        return mDatabase.delete(CalendarDataItems.TABLE_NAME, CalendarDataItems.YEAR_NP + " =?", selArgs);

    }

}