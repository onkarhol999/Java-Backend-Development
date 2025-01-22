package com.onkar.SprinfSecurityProjectPractice.repo;

import com.onkar.SprinfSecurityProjectPractice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
    User findByUsername(String username);
}
