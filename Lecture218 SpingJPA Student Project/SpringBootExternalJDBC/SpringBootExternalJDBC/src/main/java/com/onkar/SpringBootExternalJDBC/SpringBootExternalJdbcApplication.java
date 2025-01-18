package com.onkar.SpringBootExternalJDBC;

import com.onkar.SpringBootExternalJDBC.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootExternalJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(SpringBootExternalJdbcApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		s1.setRollno(101);
		s1.setName("Onkar");
		s1.setMarks(94);

		s2.setRollno(102);
		s2.setName("Rutika");
		s2.setMarks(74);

		s3.setRollno(101);
		s3.setName("Navin");
		s3.setMarks(34);

		repo.saveAll(s1);
	}

}
