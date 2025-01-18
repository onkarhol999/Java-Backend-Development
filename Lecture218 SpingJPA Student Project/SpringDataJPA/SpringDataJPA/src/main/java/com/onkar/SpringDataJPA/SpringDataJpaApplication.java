package com.onkar.SpringDataJPA;

import com.onkar.SpringDataJPA.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setRollno(101);
//		s1.setName("Onkar");
//		s1.setMarks(94);
//
//		s2.setRollno(102);
//		s2.setName("Rutika");
//		s2.setMarks(74);
//
		s3.setRollno(103);
		s3.setName("Pravin");
		s3.setMarks(84);
//
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

//		Optional<Student> s  = repo.findById(104);
//		System.out.println(s.orElse(new Student()));
//		System.out.println(repo.findById(102));


//		repo.save(s3);

		repo.delete(s3);
//		System.out.println(repo.findByName("Onkar"));
	}

}
