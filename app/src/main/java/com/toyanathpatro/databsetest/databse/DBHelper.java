package com.toyanathpatro.databsetest.databse;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by adventure on 3/20/16.
 */
public  class DBHelper extends SQLiteOpenHelper {
    Context context;


    public DBHelper(Context context) {
        super(context, CalendarDataItems.DB_NAME, null, CalendarDataItems.DB_VERSION);
        this.context = context;
        Log.i("dbtest", "constructor");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        try {
            db.execSQL(CalendarDataItems.SQL_CREATE_CALENDAR_ENTRIES);
            Log.i("dbtest", "dbCreated");
        } catch (SQLException e) {
            Log.i("dbtest","dbCreate error");

            e.printStackTrace();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        try {
            db.execSQL(CalendarDataItems.SQL_DELETE_ENTRIES);
            onCreate(db);
            Log.i("dbtest", "dbUpdated");
        } catch (SQLException e) {
            Log.i("dbtest","dbupdate Failed");
            e.printStackTrace();
        }
    }
}
