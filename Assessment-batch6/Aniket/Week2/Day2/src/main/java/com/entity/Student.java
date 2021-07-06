package com.entity;

public class Student {
    String id;
    String fname;
    String lname;
    String dob;
    String area;
    String mobile;

    public Student(String id, String fname, String lname, String dob, String area, String mobile) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.area = area;
        this.mobile = mobile;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    Student getStudent() {
        return new Student();
    }
}
