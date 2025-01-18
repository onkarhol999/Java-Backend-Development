package com.onkar.SpringJPAPractice;
import com.onkar.SpringJPAPractice.model.JobPostService;
import com.onkar.SpringJPAPractice.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class JobController {

    @Autowired
    private JobService jobPost;

    @GetMapping("/getAllJobs")
    public List<JobPostService> getAllJob(){
        return jobPost.getAllJobs();
    }

    @GetMapping("/loadData")
    public String loadData(){
        jobPost.loadData();
        return "Success.......";
    }
}
