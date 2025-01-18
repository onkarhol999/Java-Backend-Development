package com.onkar.SpringDataJPAInJobPortal.repo;

import com.onkar.SpringDataJPAInJobPortal.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

}
