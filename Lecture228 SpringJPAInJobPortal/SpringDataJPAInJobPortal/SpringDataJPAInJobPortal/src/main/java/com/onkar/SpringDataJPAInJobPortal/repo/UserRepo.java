package com.onkar.SpringDataJPAInJobPortal.repo;


import com.onkar.SpringDataJPAInJobPortal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
