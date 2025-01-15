package com.onkar.JobPortalUsingSpringBoot.service;

import com.onkar.JobPortalUsingSpringBoot.model.JobPost;
import com.onkar.JobPortalUsingSpringBoot.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private final JobRepo repo;

    @Autowired
    public JobService(JobRepo repo) {
        this.repo = repo;
    }

    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);
    }

    public List<JobPost> getAllJob() {
        return repo.getAllJobs();
    }
}
