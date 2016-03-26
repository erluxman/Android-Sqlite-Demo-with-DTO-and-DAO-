package com.toyanathpatro.databsetest;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by adventure on 3/26/16.
 */
public class DBHelper extends SQLiteOpenHelper {

    //constants for database


    //other variables

    Context context;


    public DBHelper(Context context) {
        super(context, DataItems.DATABASE_NAME, null, DataItems.DATABASE_VERSION);
        this.context = context;
        Log.i("dbtest","constructor");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        try {
            db.execSQL(DataItems.CREATE_TABLE_QUERY);
            Log.i("dbtest","dbCreated");
        } catch (SQLException e) {
            Log.i("dbtest","dbCreate error");

            e.printStackTrace();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        try {
            db.execSQL(DataItems.DROP_TABLE);
            onCreate(db);
            Log.i("dbtest", "dbUpdated");
        } catch (SQLException e) {
            Log.i("dbtest","dbupdate Failed");
            e.printStackTrace();
        }
    }
}
