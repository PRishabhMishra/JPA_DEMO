package com.jpademo.user.user.Service;

import com.jpademo.user.user.Models.Student;
import com.jpademo.user.user.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService {
    @Autowired
    StudentRepository studentRepository;


    public void addStudent(Student s){
        studentRepository.save(s);

    }
}
