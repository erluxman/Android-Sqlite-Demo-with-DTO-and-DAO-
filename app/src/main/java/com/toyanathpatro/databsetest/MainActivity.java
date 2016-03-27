package com.toyanathpatro.databsetest;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.toyanathpatro.databsetest.calendar.DateConverterToEnglish;
import com.toyanathpatro.databsetest.calendar.GetMonthCalendar;
import com.toyanathpatro.databsetest.databse.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    DBHelper mDbHelper;
    SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ICalendarDAO mCalendarDAO = new CalendarDAO(this);
        ArrayList <CalendarDto> data=new GetMonthCalendar().getAmonthData(2072, 8);
        ArrayList <CalendarDto> miniData = new ArrayList<>();
        Log.i("dbtest",CalendarDataItems.SQL_CREATE_CALENDAR_ENTRIES);

        miniData.add(data.get(0));
        Log.i("dbtest", mCalendarDAO.setCalendar(data) + " data are inserted");
        ArrayList <CalendarDto> mdata = mCalendarDAO.getCalendar("np","2072");
        for (int i =0;i< mdata.size();i++){
            CalendarDto  temp = new CalendarDto();
            temp = mdata.get(i);
            Log.i("dbTest",temp.getGate()+"  ,"+temp.getDay()+"  ,"+temp.getMonthEnId()+"   "+temp.getMonthNpId()+"   "+temp.getMahina()+"   "+temp.getMonthEn() + "  "+temp.getYearNp() +"  "+temp.getYearEn()+ "    "+ DateConverterToEnglish.getDayName(temp.getDayId()));
        }
        /*IDAO mDao = new DAO(this);
        ArrayList <StudentDTO > data = new ArrayList<>();
        data.add(new StudentDTO("Laxman","25","11","Kathmandu"));
        data.add(new StudentDTO("Balman","4","12","Surkhet"));
        data.add(new StudentDTO("Raju","34","11","SankhuwaSabha"));

        mDao.writeDataToTable(data);
        ArrayList<StudentDTO> fullData =mDao.readAllData();
        for (int i =0; i <fullData.size();i++){
            Log.i("dbtest",fullData.get(i).getRollNo()+"  "+fullData.get(i).getStdClass()+" "+fullData.get(i).getName());
        }

        mDao.updateData("Balman", "4", new StudentDTO("Rosan","34","12","raswa"));
         fullData =mDao.readAllData();
        for (int i =0; i <fullData.size();i++){
            Log.i("dbtest",fullData.get(i).getRollNo()+"  "+fullData.get(i).getStdClass()+" "+fullData.get(i).getName());
        }

        mDao.deleteStudent("Laxman","25");

        fullData =mDao.readAllData();
        for (int i =0; i <fullData.size();i++){

            Log.i("dbtest",fullData.get(i).getRollNo()+"  "+fullData.get(i).getStdClass()+" "+fullData.get(i).getName());
        }
*/


    }


}
