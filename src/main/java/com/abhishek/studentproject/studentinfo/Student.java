package com.abhishek.studentproject.studentinfo;


//import java.time.LocalDate;

import java.util.HashMap;

public class Student {

    int stid;
    String addressOfResidence;
    String dateOfBirth;
    String fname, mname, lname;
    int semester;
    String course;
    HashMap<String,Float> subjects;

    // constructor
    Student(String addressOfResidence,
            String dateOfBirth, String fname, String mname, String lname,
            int semester, String course, HashMap<String,Float> subjects) {
        this.addressOfResidence = addressOfResidence;
        this.dateOfBirth = dateOfBirth;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.semester = semester;
        this.course = course;
        this.subjects = subjects;
    }


    //getter and setter methods

    //getter methods
    public int getStid() {
        return stid;
    }

    public String getFname() {
        return fname;
    }

    public String getMname() {
        return mname;
    }

    public String getLname() {
        return lname;
    }

    public int getSemester() {
        return semester;
    }

    public String getAddressOfResidence() {
        return addressOfResidence;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {

        return fname + " " +  mname +" "+ lname;
    }

    public HashMap<String, Float> getSubjects() {
        return subjects;
    }

    public String getCourse() {
        return course;
    }

    // setter methods
    public void setStid(int stid) {
        this.stid = stid;
    }

    public void setAddressOfResidence(String addressOfResidence) {
        this.addressOfResidence = addressOfResidence;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public void setSubjects(HashMap<String, Float> subjects) {
        this.subjects = subjects;
    }
};

// Use of Hashmap for creating different instances of student in the server session.
