package com.toyanathpatro.databsetest;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by adventure on 3/26/16.
 */
public class DAO implements IDAO {

    DBHelper mDbHelper;
    SQLiteDatabase mSqLiteDatabase;

    public DAO (Context c){
        mDbHelper= new DBHelper(c);
        mSqLiteDatabase = mDbHelper.getWritableDatabase();
    }
    @Override
    public long writeDataToTable(ArrayList<StudentDTO> data) {

        StudentDTO mDto ;
        ContentValues contentValues;
        long response=0;
        for(int i =0;i<data.size();i++){
            mDto = data.get(i);
            contentValues = new ContentValues();
            contentValues.put(DataItems.STUDENT_NAME, mDto.getName());
            contentValues.put(DataItems.STUDENT_CLASS, mDto.getStdClass());
            contentValues.put(DataItems.STUDENT_ROLL_NO, mDto.getRollNo());
            response = mSqLiteDatabase.insert(DataItems.TABLE_NAME, DataItems.STUDENT_NAME, contentValues);

        }


        return response;
    }

    @Override
    public ArrayList<StudentDTO> readAllData() {
        ArrayList<StudentDTO> dto = new ArrayList<>();
        StudentDTO temp;

        String[] colum = {DataItems.STUDENT_NAME, DataItems.STUDENT_CLASS, DataItems.STUDENT_ROLL_NO};

        Cursor mCursor = mSqLiteDatabase.query(true, DataItems.TABLE_NAME, colum, null, null, null, null, null, null);

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


        return dto;    }

    @Override
    public ArrayList<StudentDTO> readDataWithName(String name) {
        ArrayList<StudentDTO> dto = new ArrayList<>();
        StudentDTO temp;
        String [] slectionArgs= {name};

        String[] colum = {DataItems.STUDENT_NAME, DataItems.STUDENT_CLASS, DataItems.STUDENT_ROLL_NO};

        Cursor mCursor = mSqLiteDatabase.query(true,DataItems.TABLE_NAME, colum, DataItems.STUDENT_NAME+" =?", slectionArgs, null, null, null, null);


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

    @Override
    public ArrayList<StudentDTO> readDataWithRollNO(String rollNO) {
        ArrayList<StudentDTO> dto = new ArrayList<>();
        StudentDTO temp;
        String [] slectionArgs= { rollNO};

        String[] colum = {DataItems.STUDENT_NAME, DataItems.STUDENT_CLASS, DataItems.STUDENT_ROLL_NO};

        Cursor mCursor = mSqLiteDatabase.query(true,DataItems.TABLE_NAME, colum, DataItems.STUDENT_ROLL_NO+" =?", slectionArgs, null, null, null, null);


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

    @Override
    public ArrayList<StudentDTO> readDataWithNameAndRollNO(String name, String rollNO) {

        ArrayList<StudentDTO> dto = new ArrayList<>();
        StudentDTO temp;
        String [] slectionArgs= { rollNO,name};

        String[] colum = {DataItems.STUDENT_NAME, DataItems.STUDENT_CLASS, DataItems.STUDENT_ROLL_NO};

        Cursor mCursor = mSqLiteDatabase.query(true,DataItems.TABLE_NAME, colum, DataItems.STUDENT_ROLL_NO+" =? OR "+DataItems.STUDENT_NAME+" =?", slectionArgs, null, null, null, null);


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

    @Override
    public long updateData(String name, String rollNO, StudentDTO mDto) {
        ArrayList<StudentDTO> dto = new ArrayList<>();
        StudentDTO temp;
        String [] selArgs= { rollNO,name};
        ContentValues cv = new ContentValues();
        cv.put(DataItems.STUDENT_NAME,mDto.getName());
        cv.put(DataItems.STUDENT_ROLL_NO,mDto.getRollNo());
        cv.put(DataItems.STUDENT_CLASS,mDto.getStdClass());

        return  mSqLiteDatabase.update(DataItems.TABLE_NAME,cv,DataItems.STUDENT_ROLL_NO+" =? AND "+DataItems.STUDENT_NAME+" =?",selArgs);

    }

    @Override
    public long deleteStudent(String name, String rollNO) {

        String [] selArgs= { rollNO,name};
        return mSqLiteDatabase.delete(DataItems.TABLE_NAME,DataItems.STUDENT_ROLL_NO+" =? AND "+DataItems.STUDENT_NAME+" =?",selArgs);
    }

    @Override
    public long deleteStudent(String rollNO) {
        String [] selArgs= { rollNO};
        return mSqLiteDatabase.delete(DataItems.TABLE_NAME,DataItems.STUDENT_ROLL_NO+" =?",selArgs);

    }


}
