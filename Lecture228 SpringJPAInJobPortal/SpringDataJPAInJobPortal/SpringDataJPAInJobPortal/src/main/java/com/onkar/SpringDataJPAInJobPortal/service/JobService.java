package com.onkar.SpringDataJPAInJobPortal.service;

import com.onkar.SpringDataJPAInJobPortal.model.JobPost;
import com.onkar.SpringDataJPAInJobPortal.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo jobRepo;

    public List<JobPost> getAllJobs() {
        return jobRepo.findAll();
    }

    public JobPost getJobById(int postId) {
        return jobRepo.findById(postId).orElse(null);
    }

    public void addJob(JobPost jobPost) {
        jobRepo.save(jobPost);
    }

    public void updateJob(JobPost jobPost) {
        jobRepo.save(jobPost);
    }

    public void deleteJobById(int postId) {
        jobRepo.deleteById(postId);
    }

    public void loadData() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1, "Software Engineer", 2, "Develop and maintain software applications.", 70000),
                new JobPost(2, "Data Analyst", 1, "Analyze data and create reports.", 60000),
                new JobPost(3, "Project Manager", 5, "Manage projects and ensure timely delivery.", 90000),
                new JobPost(4, "UI/UX Designer", 3, "Design user-friendly interfaces and experiences.", 75000),
                new JobPost(5, "DevOps Engineer", 4, "Ensure smooth deployment and CI/CD pipelines.", 85000)
        ));

        jobRepo.saveAll(jobs);
    }
}
