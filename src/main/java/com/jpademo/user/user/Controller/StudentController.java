package com.jpademo.user.user.Controller;

import com.jpademo.user.user.Models.Student;
import com.jpademo.user.user.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")

public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/save")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return " Student got successfully saved in database";

    }
}
