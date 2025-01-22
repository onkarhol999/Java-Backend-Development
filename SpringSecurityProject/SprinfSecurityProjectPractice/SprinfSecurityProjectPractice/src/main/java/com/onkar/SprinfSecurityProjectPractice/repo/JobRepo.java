package com.onkar.SprinfSecurityProjectPractice.repo;

import com.onkar.SprinfSecurityProjectPractice.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {
}
