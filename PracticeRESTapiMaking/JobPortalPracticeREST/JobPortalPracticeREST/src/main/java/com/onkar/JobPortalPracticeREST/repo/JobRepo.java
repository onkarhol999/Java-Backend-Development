package com.onkar.JobPortalPracticeREST.repo;

import com.onkar.JobPortalPracticeREST.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Software Engineer", 2, "Develop and maintain software applications.", 70000),
            new JobPost(2, "Data Analyst", 1, "Analyze data and create reports.", 60000),
            new JobPost(3, "Project Manager", 5, "Manage projects and ensure timely delivery.", 90000),
            new JobPost(4, "UI/UX Designer", 3, "Design user-friendly interfaces and experiences.", 75000),
            new JobPost(5, "DevOps Engineer", 4, "Ensure smooth deployment and CI/CD pipelines.", 85000)
    ));

    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public JobPost getJobById(int postId) {
        for(JobPost job : jobs){
            if(job.getJobId() == postId){
                return job;
            }
        }
        return null;
    }

    public void addJob(JobPost jobPost) {
        jobs.add(jobPost);
    }

    public void updateJob(JobPost jobPost) {
        for(JobPost job : jobs){
            if(job.getJobId() == jobPost.getJobId()){
                job.setJobId(jobPost.getJobId());
                job.setJobDescription(jobPost.getJobDescription());
                job.setJobExperience(jobPost.getJobExperience());
                job.setJobTitle(jobPost.getJobTitle());
                job.setSalary(jobPost.getSalary());
            }
        }
    }

    public void deleteJobById(int postId) {
        jobs.removeIf(job -> job.getJobId() == postId);
    }
}
