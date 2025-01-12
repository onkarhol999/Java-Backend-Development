package com.Onkar.SpringBootLecture161.Repository;

import com.Onkar.SpringBootLecture161.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public  void save(Laptop lap){
        System.out.println("Saved in Database.....");
    }
}
