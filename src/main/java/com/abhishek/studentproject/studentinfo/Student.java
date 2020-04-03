package com.abhishek.studentproject.studentinfo;


//import java.time.LocalDate;

public class Student {

    int stid;
    String addressOfResidence;
    String dateOfBirth;
    String fname, mname, lname;
    int semester;
    String course;

    // constructor
    Student(String addressOfResidence,
            String dateOfBirth, String fname, String mname, String lname,
            int semester, String course) {
        this.addressOfResidence = addressOfResidence;
        this.dateOfBirth = dateOfBirth;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.semester = semester;
        this.course = course;
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


};

// Use of Hashset for creating different instances of student in the server session.
