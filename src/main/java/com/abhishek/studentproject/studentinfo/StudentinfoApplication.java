package com.abhishek.studentproject.studentinfo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StudentinfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentinfoApplication.class, args);


    }


	/*public Student getAll(int stid) {
		Student tempStudent = new Student();
		tempStudent.stid = stid;
		tempStudent.addressOfResidence = this.addressOfResidence;
		tempStudent.dateOfBirth = this.dateOfBirth;
		tempStudent.fname = this.fname;
		tempStudent.mname = this.mname;
		tempStudent.lname = this.lname;
		tempStudent.semester = this.semester;
		tempStudent.course = this.course;


		return tempStudent;

	}// end of getall()*/


}

/*
 {"stid":"1",
 "addressOfResidence":"Bhogal",
 "dateOfBirth":"31st dec 1996",
 "fname":"Abhishek",
 "mname":"-",
 "lname":"Saini",
 "semester":"1",
 "course":"computer science"
}
* */