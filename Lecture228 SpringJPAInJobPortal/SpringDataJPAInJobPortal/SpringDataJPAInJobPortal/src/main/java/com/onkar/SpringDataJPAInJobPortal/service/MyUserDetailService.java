package com.onkar.SpringDataJPAInJobPortal.service;


import com.onkar.SpringDataJPAInJobPortal.model.User;
import com.onkar.SpringDataJPAInJobPortal.model.UserDetailsmplementation;
import com.onkar.SpringDataJPAInJobPortal.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username);
        if(user == null){
            System.out.println("User 404");
            throw new UsernameNotFoundException("User 404");
        }
        return new UserDetailsmplementation(user);
    }
}
