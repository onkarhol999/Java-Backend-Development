package com.onkar.JobPosrtalBackend.service;

import com.onkar.JobPosrtalBackend.model.JobPost;
import com.onkar.JobPosrtalBackend.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }

    public JobPost getJobPost(int postId) {
        return repo.getJobPost(postId);
    }

    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);
    }

    public void updateJob(JobPost jobPost) {
       repo.updateJob(jobPost);
    }

    public void deleteJobPost(int postId) {
        repo.deleteJobPost(postId);
    }
}
