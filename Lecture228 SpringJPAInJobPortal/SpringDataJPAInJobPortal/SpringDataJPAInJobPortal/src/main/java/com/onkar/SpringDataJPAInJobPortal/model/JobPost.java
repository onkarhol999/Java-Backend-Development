package com.onkar.SpringDataJPAInJobPortal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class JobPost {
    @Id
    private int jobId;
    private String jobTitle;
    private int jobExperience;
    private String jobDescription;
    private int salary;

    public JobPost(int jobId, String jobTitle, int jobExperience, String jobDescription, int salary) {
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.jobExperience = jobExperience;
        this.jobDescription = jobDescription;
        this.salary = salary;
    }

    public JobPost() {
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getJobExperience() {
        return jobExperience;
    }

    public void setJobExperience(int jobExperience) {
        this.jobExperience = jobExperience;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
