package com.onkar.SpringAWSapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String getHello(){
        return "Welcome in Tech World.....";
    }


    @GetMapping("/info")
    public String aboutMachine(){
        String os = System.getProperty("os.name");
        String version = System.getProperty("os.version");
        String architecture = System.getProperty("os.arch");
        String javaVersion = System.getProperty("java.version");
        String user = System.getProperty("user.name");

        return "OS:" +os+", Version: "+version+", Architecture: "+architecture+", Java Version: "+ javaVersion+"User : "+ user;
    }
}
