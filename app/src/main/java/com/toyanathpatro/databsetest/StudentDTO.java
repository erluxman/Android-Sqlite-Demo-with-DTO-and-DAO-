package com.toyanathpatro.databsetest;

/**
 * Created by adventure on 3/26/16.
 */
public class StudentDTO {
    private  String name , stdClass,rollNo,address;


    public StudentDTO(){

    }

    public StudentDTO (String name ,String rollNo,String classNO,String address){
        this.name = name;
        this.rollNo = rollNo;
        this.stdClass =classNO;
        this.address = address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void setRollNo(String rollNo) {

        this.rollNo = rollNo;
    }

    public void setStdClass(String stdClass) {

        this.stdClass = stdClass;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAddress() {

        return address;
    }

    public String getRollNo() {

        return rollNo;
    }

    public String getStdClass() {

        return stdClass;
    }

    public String getName() {

        return name;
    }
}
