package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
//    @Bean
//    public Alien alien(@Qualifier("desktop") Computer com){
//        Alien obj = new Alien();
//        obj.setAge(29);
////        obj.setCom(desktop());
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean
//    public Desktop desktop(){
//        return new Desktop();
//    };
//
//    @Bean
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
