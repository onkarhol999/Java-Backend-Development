package com.onkar.spring_security_project.controller;


import com.onkar.spring_security_project.model.User;
import com.onkar.spring_security_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;
    @PostMapping("/register")
    public User register(@RequestBody User user){
        service.saveUser(user);
        return user;
    }
}
