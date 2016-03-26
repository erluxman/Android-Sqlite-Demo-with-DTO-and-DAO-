package com.toyanathpatro.databsetest;

import java.util.ArrayList;

/**
 * Created by adventure on 3/26/16.
 */
public interface IDAO {
    long writeDataToTable(ArrayList<StudentDTO> data);

    ArrayList<StudentDTO> readAllData();

    ArrayList<StudentDTO> readDataWithName(String name);

    ArrayList<StudentDTO> readDataWithRollNO(String rollNO);

    ArrayList<StudentDTO> readDataWithNameAndRollNO(String name, String rollNO);

    long updateData(String name, String rollNO, StudentDTO mDto);

    long deleteStudent(String name, String rollNO);

    long deleteStudent(String rollNO);
}
