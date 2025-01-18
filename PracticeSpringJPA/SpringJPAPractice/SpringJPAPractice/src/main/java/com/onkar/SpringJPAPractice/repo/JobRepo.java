package com.onkar.SpringJPAPractice.repo;

import com.onkar.SpringJPAPractice.model.JobPostService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPostService, Integer>{

}
