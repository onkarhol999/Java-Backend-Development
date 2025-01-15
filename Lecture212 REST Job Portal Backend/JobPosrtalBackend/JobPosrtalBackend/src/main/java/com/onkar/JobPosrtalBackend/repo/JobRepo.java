package com.onkar.JobPosrtalBackend.repo;

import com.onkar.JobPosrtalBackend.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Software Developer", "Develop and maintain software applications.", "Remote", 80000),
            new JobPost(2, "Data Analyst", "Analyze and interpret complex data.", "New York", 70000),
            new JobPost(3, "Product Manager", "Lead product development teams.", "San Francisco", 120000),
            new JobPost(4, "UI/UX Designer", "Design user-friendly interfaces.", "Remote", 65000),
            new JobPost(5, "DevOps Engineer", "Ensure efficient CI/CD pipelines.", "Austin", 90000)
    ));

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println("Job added Successfully");
    }

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public JobPost getJobPost(int postId) {

        for(JobPost job : jobs){
            if(job.getId() == postId){
                return job;
            }
        }
        return null;
    }

    public void updateJob(JobPost jobPost) {
        for (JobPost job : jobs){
            if(jobPost.getId() == job.getId()){
                job.setId(jobPost.getId());
                job.setDescription(jobPost.getDescription());
                job.setLocation(jobPost.getLocation());
                job.setSalary(jobPost.getSalary());
                job.setTitle(jobPost.getTitle());
            }
        }
    }

    public void deleteJobPost(int postId) {
        for(JobPost job : jobs){
            if(job.getId() == postId){
                jobs.remove(job);
            }
        }
    }
}
