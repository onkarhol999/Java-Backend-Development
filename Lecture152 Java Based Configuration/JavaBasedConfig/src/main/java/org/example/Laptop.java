package org.example;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    public Laptop(){
        System.out.println("Laptop Object Created...");
    }
    public void Compile(){
        System.out.println("Compileing using Laptop...");
    }
}
