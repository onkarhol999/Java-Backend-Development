package com.onkar.spring_security_project.repo;

import com.onkar.spring_security_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
