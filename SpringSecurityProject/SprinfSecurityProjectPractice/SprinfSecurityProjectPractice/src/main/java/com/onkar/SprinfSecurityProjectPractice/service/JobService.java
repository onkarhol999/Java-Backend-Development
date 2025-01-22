package com.onkar.SprinfSecurityProjectPractice.service;

import com.onkar.SprinfSecurityProjectPractice.model.JobPost;
import com.onkar.SprinfSecurityProjectPractice.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public List<JobPost> getAllJobs() {
        return repo.findAll();
    }

    public JobPost addJob(JobPost jobPost) {
        return repo.save(jobPost);
    }
}
