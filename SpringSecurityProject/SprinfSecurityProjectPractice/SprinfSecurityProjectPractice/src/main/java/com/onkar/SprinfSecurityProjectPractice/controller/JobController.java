package com.onkar.SprinfSecurityProjectPractice.controller;

import com.onkar.SprinfSecurityProjectPractice.model.JobPost;
import com.onkar.SprinfSecurityProjectPractice.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("/getAllJobs")
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @PostMapping("/addJob")
    public JobPost addJob(@RequestBody JobPost jobPost){
        return service.addJob(jobPost);
    }

}
