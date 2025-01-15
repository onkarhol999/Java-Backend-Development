package com.onkar.JobPosrtalBackend;

import com.onkar.JobPosrtalBackend.model.JobPost;
import com.onkar.JobPosrtalBackend.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("/jobPosts")
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("/jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return service.getJobPost(postId);
    }

    @PostMapping("/jobPost")
    public void addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
    }

    @PutMapping("/jobPost")
    public void updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
    }


    @DeleteMapping("/jobPost/{postId}")
    public void deleteJob(@PathVariable("postId") int postId){
        service.deleteJobPost(postId);
    }
}
