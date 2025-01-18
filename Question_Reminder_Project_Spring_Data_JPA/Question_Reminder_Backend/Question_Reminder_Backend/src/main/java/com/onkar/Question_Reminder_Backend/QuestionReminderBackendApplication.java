package com.onkar.Question_Reminder_Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class QuestionReminderBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionReminderBackendApplication.class, args);
	}

}
