package com.onkar.spring_security_project.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String greating(HttpServletRequest request){
        return "Hello......";
    }

    @GetMapping("/about")
    public String about(HttpServletRequest request){
        return "Onkar Hol......" ;
    }
}
