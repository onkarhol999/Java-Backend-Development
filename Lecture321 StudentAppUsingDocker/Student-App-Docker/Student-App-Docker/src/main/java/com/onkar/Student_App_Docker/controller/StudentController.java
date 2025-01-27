package com.onkar.Student_App_Docker.controller;


import com.onkar.Student_App_Docker.StudentRepo;
import com.onkar.Student_App_Docker.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo repo;

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudent(){
        return repo.findAll();
    }
}
