package com.onkar.JobPortalUsingSpringBoot;

import com.onkar.JobPortalUsingSpringBoot.model.JobPost;
import com.onkar.JobPortalUsingSpringBoot.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("/jobPosts")
    public List<JobPost> getAllJobs() {
        return service.getAllJob();
    }
}
