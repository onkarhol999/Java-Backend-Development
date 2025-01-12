package com.Onkar.SpringBootLecture161.service;

import com.Onkar.SpringBootLecture161.Repository.LaptopRepository;
import com.Onkar.SpringBootLecture161.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap){
        repo.save(lap);
    }

    public boolean isGoodProg(){
        return true;
    }
}
