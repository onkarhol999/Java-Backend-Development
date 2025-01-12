package org.example;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public Desktop(){
        System.out.println("Desktop object created.");
    }
    @Override
    public void Compile(){
        System.out.println("Compling using Desktop...");
    }
}
