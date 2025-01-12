package com.Onkar.SpringBootLecture161;

import com.Onkar.SpringBootLecture161.model.Alien;
import com.Onkar.SpringBootLecture161.model.Laptop;
import com.Onkar.SpringBootLecture161.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootLecture161Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootLecture161Application.class, args);

		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
		
//		Alien obj = context.getBean(Alien.class);
//		obj.code();
	}

}
