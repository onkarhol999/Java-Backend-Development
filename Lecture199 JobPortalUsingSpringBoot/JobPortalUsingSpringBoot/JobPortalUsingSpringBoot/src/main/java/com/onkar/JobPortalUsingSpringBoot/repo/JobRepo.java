package com.onkar.JobPortalUsingSpringBoot.repo;

import com.onkar.JobPortalUsingSpringBoot.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    private final List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Must use Java", 2, Arrays.asList("Java", "Python")),
            new JobPost(2, "Frontend Developer", "Experience with ReactJS", 1, Arrays.asList("JavaScript", "React")),
            new JobPost(3, "Backend Developer", "Proficient in Node.js", 3, Arrays.asList("Node.js", "Express")),
            new JobPost(4, "Full Stack Developer", "Experience in MERN stack", 4, Arrays.asList("MongoDB", "Express", "React", "Node.js")),
            new JobPost(5, "Data Scientist", "Strong Python skills and data analysis", 2, Arrays.asList("Python", "SQL", "Pandas")),
            new JobPost(6, "Android Developer", "Kotlin and Android Studio expertise", 3, Arrays.asList("Kotlin", "Java")),
            new JobPost(7, "DevOps Engineer", "CI/CD tools experience", 3, Arrays.asList("Docker", "Kubernetes", "Jenkins")),
            new JobPost(8, "Machine Learning Engineer", "ML algorithms knowledge", 4, Arrays.asList("Python", "TensorFlow", "Scikit-learn")),
            new JobPost(9, "UI/UX Designer", "Proficiency in design tools", 1, Arrays.asList("Figma", "Adobe XD")),
            new JobPost(10, "Cybersecurity Specialist", "Network security and ethical hacking", 5, Arrays.asList("Cybersecurity", "Networking", "Penetration Testing"))
    ));

    public void addJob(JobPost job) {
        jobs.add(job);
    }

    public List<JobPost> getAllJobs() {
        return jobs;
    }
}
