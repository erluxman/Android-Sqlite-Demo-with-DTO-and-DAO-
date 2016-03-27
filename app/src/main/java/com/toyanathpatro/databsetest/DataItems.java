package com.toyanathpatro.databsetest;

/**
 * Created by adventure on 3/26/16.
 */
public class DataItems {
    public static final String TABLE_NAME = "studnet";
    public static final String DATABASE_NAME = "school";
    public static final String UID = "_id";
    public static final int DATABASE_VERSION = 7;


    public static final String STUDENT_NAME = "student_name";
    public static final String STUDENT_CLASS = "student_class";
    //public static final String STUDENT_ADDRESS = "student_address";


    public static final String STUDENT_ROLL_NO = "student_roll";


    public static final String CREATE_TABLE_QUERY =
            "CREATE TABLE "+TABLE_NAME + " ( "+UID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+STUDENT_NAME+" VARCHAR(25), "+
                    STUDENT_CLASS+" VARCHAR(25), "+STUDENT_ROLL_NO+" VARCHAR(25)); " ;


    public static final String DROP_TABLE = "DROP TABLE IF EXISTS "+TABLE_NAME;
}
