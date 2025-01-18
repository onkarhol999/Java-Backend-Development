package com.onkar.SpringJPAPractice.service;

import com.onkar.SpringJPAPractice.model.JobPostService;
import com.onkar.SpringJPAPractice.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public List<JobPostService> getAllJobs() {
        return jobRepo.findAll();
    }

    public void loadData(){
        List<JobPostService> jobs = new ArrayList<>(Arrays.asList(
                new JobPostService(1, "Software Engineer", 2, "Develop and maintain software applications.", 70000),
                new JobPostService(2, "Data Analyst", 1, "Analyze data and create reports.", 60000),
                new JobPostService(3, "Project Manager", 5, "Manage projects and ensure timely delivery.", 90000),
                new JobPostService(4, "UI/UX Designer", 3, "Design user-friendly interfaces and experiences.", 75000),
                new JobPostService(5, "DevOps Engineer", 4, "Ensure smooth deployment and CI/CD pipelines.", 85000)
        ));
        jobRepo.saveAll(jobs);
    }
}
