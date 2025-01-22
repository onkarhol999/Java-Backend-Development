package com.onkar.SprinfSecurityProjectPractice.service;



import com.onkar.SprinfSecurityProjectPractice.model.User;
import com.onkar.SprinfSecurityProjectPractice.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User saveUser(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
        return repo.save(user);
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
