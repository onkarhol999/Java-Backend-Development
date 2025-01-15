package com.onkar.JobPortalPracticeREST;

import com.onkar.JobPortalPracticeREST.model.JobPost;
import com.onkar.JobPortalPracticeREST.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("/getAllJobs")
    public List<JobPost> getAllJob(){
        return service.getAllJobs();
    }

    @GetMapping("/getJobById/{postId}")
    public JobPost getJobById(@PathVariable("postId") int postId){
        return service.getJobById(postId);
    }

    @PostMapping("/addJob")
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return jobPost;
    }

    @PutMapping("/updateJob")
    public String updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return "Updated..";
    }
    
    @DeleteMapping("/deleteJobById/{postId}")
    public String deleteJobById(@PathVariable("postId") int postId){
        service.deleteJobById(postId);
        return "Job Deleted ....... ";
    }

}
