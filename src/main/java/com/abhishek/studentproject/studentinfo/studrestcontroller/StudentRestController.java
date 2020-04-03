package com.abhishek.studentproject.studentinfo.studrestcontroller;

import com.abhishek.studentproject.studentinfo.Student;
import com.abhishek.studentproject.studentinfo.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.HashMap;

@RestController
@EnableSwagger2
@RequestMapping("/student")  // mapping this class at "/student"
public class StudentRestController {

    private AppService appService;

    //  inject Student service object
    // Constructor injection auto-wiring
    @Autowired
    StudentRestController(AppService initialappService){
        appService = initialappService;
    }

    // expose endpoints for functionality
    @GetMapping("/student/{studentid}")
    public Student displayById(@PathVariable("studentid") int studentid){
        return appService.displayById(studentid);
    }

    @GetMapping("/student/showall")
    public HashMap<Integer, Student> displayAll(){
        return appService.displayAllStudents();
    }

    // add a new student using POST at endpoint "addnew"
    @PostMapping(value = "/student/addnew")
    public Student addStudent(@RequestBody Student newStudent) {
        System.out.println("Insert student.\n");
        return appService.addStudent(newStudent);
    }

    // update details of particular student by studentId
    @PutMapping("/student/{studentId}")
    public Student updateStudent(@PathVariable("studentId") int studentId,@RequestBody Student studentUpdate) {
        return appService.updateStudent(studentId, studentUpdate);
    }

}
