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
        IDAO mDao = new DAO(this);
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



       /* mDbHelper = new DBHelper(this);
        database = mDbHelper.getWritableDatabase();
        *//*Log.i("dbtest", "TOtal data inserted" + insertStudent("nai", "1", null));
        Log.i("dbtest", "TOtal data inserted" + insertStudent("rihhahna", null, null));
        Log.i("dbtest", "TOtal data inserted" + insertStudent("vupal", "1", "2"));
*//*
        StudentDTO mDto = new StudentDTO();
        mDto.setRollNo("1");
        mDto.setName("Laxman");
        mDto.setRollNo("12");
        updateAStudentData("nai","12",mDto);
        ArrayList<StudentDTO> dto = new ArrayList<>();
        StudentDTO temp;
       // dto = readAStudentData("vupal", "23");
        dto = readAllStudentData();
        for(int i =0; i< dto.size();i++){

            temp = new StudentDTO();
            temp = dto.get(i);
            Log.i("dbtest",temp.getName()+"  "+temp.getRollNo()+ "  "+temp.getStdClass());
        }*/



    }

    public long insertStudent(String name, String cls, String rollNO) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(DataItems.STUDENT_NAME, name);
        contentValues.put(DataItems.STUDENT_CLASS, cls);
        contentValues.put(DataItems.STUDENT_ROLL_NO, rollNO);
        long response = database.insert(DataItems.TABLE_NAME, DataItems.STUDENT_NAME, contentValues);



        return response;
    }

    public ArrayList<StudentDTO> readAllStudentData() {
        ArrayList<StudentDTO> dto = new ArrayList<>();
        StudentDTO temp;

        String[] colum = {DataItems.STUDENT_NAME, DataItems.STUDENT_CLASS, DataItems.STUDENT_ROLL_NO};

        Cursor mCursor = database.query(true, DataItems.TABLE_NAME, colum, null, null, null, null, null, null);

        while (mCursor.moveToNext()) {
            temp = new StudentDTO();
            int nameIndex = mCursor.getColumnIndex(DataItems.STUDENT_NAME);
            int classIndex = mCursor.getColumnIndex(DataItems.STUDENT_CLASS);
            int rollIndex = mCursor.getColumnIndex(DataItems.STUDENT_ROLL_NO);

            temp.setName(mCursor.getString(nameIndex));
            temp.setRollNo(mCursor.getString(rollIndex));
            temp.setStdClass(mCursor.getString(classIndex));

            dto.add(temp);
        }


        return dto;
    }


    public ArrayList<StudentDTO> readAStudentData(String name,String rollNo) {
        ArrayList<StudentDTO> dto = new ArrayList<>();
        StudentDTO temp;
        String [] slectionArgs= { rollNo,name};

        String[] colum = {DataItems.STUDENT_NAME, DataItems.STUDENT_CLASS, DataItems.STUDENT_ROLL_NO};

        Cursor mCursor = database.query(true,DataItems.TABLE_NAME, colum, DataItems.STUDENT_ROLL_NO+" =? OR "+DataItems.STUDENT_NAME+" =?", slectionArgs, null, null, null, null);


        while (mCursor.moveToNext()) {
            temp = new StudentDTO();
            int nameIndex = mCursor.getColumnIndex(DataItems.STUDENT_NAME);
            int classIndex = mCursor.getColumnIndex(DataItems.STUDENT_CLASS);
            int rollIndex = mCursor.getColumnIndex(DataItems.STUDENT_ROLL_NO);

            temp.setName(mCursor.getString(nameIndex));
            temp.setRollNo(mCursor.getString(rollIndex));
            temp.setStdClass(mCursor.getString(classIndex));

            dto.add(temp);
        }


        return dto;
    }


    public long updateAStudentData(String name,String rollNo,StudentDTO singleStudent) {
        ArrayList<StudentDTO> dto = new ArrayList<>();
        StudentDTO temp;
        String [] selArgs= { rollNo,name};
        ContentValues cv = new ContentValues();
        cv.put(DataItems.STUDENT_NAME,singleStudent.getName());
        cv.put(DataItems.STUDENT_ROLL_NO,singleStudent.getRollNo());
        cv.put(DataItems.STUDENT_CLASS,singleStudent.getStdClass());

        return         database.update(DataItems.TABLE_NAME,cv,DataItems.STUDENT_ROLL_NO+" =? AND "+DataItems.STUDENT_NAME+" =?",selArgs);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
