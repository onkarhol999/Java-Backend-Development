package com.onkar.SpringBootExternalJDBC;

import com.onkar.SpringBootExternalJDBC.model.Student;
import com.onkar.SpringBootExternalJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootExternalJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootExternalJdbcApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollno(114);
		s.setName("Ramdev");
		s.setMarks(81);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> list = service.getStudents();
		System.out.println(list);

	}
}
