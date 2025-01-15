package com.onkar.JobPortalPracticeREST.service;


import com.onkar.JobPortalPracticeREST.model.JobPost;
import com.onkar.JobPortalPracticeREST.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public List<JobPost> getAllJobs() {
        return jobRepo.getAllJobs();
    }

    public JobPost getJobById(int postId) {
        return jobRepo.getJobById(postId);
    }

    public void addJob(JobPost jobPost) {
        jobRepo.addJob(jobPost);
    }

    public void updateJob(JobPost jobPost) {
        jobRepo.updateJob(jobPost);
    }

    public void deleteJobById(int postId) {
        jobRepo.deleteJobById(postId);
    }
}
