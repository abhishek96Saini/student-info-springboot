package com.abhishek.studentproject.studentinfo.service;

import com.abhishek.studentproject.studentinfo.Student;
import org.springframework.stereotype.Component;


import java.util.HashMap;

@Component
public class AppService {

    HashMap<Integer, Student> studentHashMap = new HashMap<>();
    int id = 1;

    public Student displayById(int studentid) {
        //get the student and return the student instance
        return studentHashMap.get(studentid);
    }

    // return all students' details
    public HashMap<Integer, Student> displayAllStudents() {
        return studentHashMap;
    }

    // add a new student using POST at endpoint "addnew"
    public Student addStudent(Student newStudent) {
        //get input from end point as newstudent
        // set id of object
        newStudent.setStid(id);
        //save the object in hashmap
        studentHashMap.putIfAbsent(id, newStudent);
        id++; //increment id for next insertion
        return studentHashMap.get(id-1); // return instance of inserted object.
    }

    // update details of particular student by studentId
    public Student updateStudent(int studentId, Student studentUpdate) {
        studentUpdate.setStid(studentId);
        studentHashMap.replace(studentId, studentUpdate);
        return studentHashMap.get(studentId);
    }

}
