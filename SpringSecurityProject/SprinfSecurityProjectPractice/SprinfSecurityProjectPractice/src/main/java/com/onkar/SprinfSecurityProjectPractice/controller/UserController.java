package com.onkar.SprinfSecurityProjectPractice.controller;

import com.onkar.SprinfSecurityProjectPractice.model.User;
import com.onkar.SprinfSecurityProjectPractice.repo.UserRepo;
import com.onkar.SprinfSecurityProjectPractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;
    @PostMapping("/register")
    public User register(@RequestBody User user){
        service.saveUser(user);
        return user;
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }
}
