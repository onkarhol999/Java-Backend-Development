package com.onkar.EmailSender;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailSenderApplication implements CommandLineRunner {

	private final EmailSender emailSender;

	public EmailSenderApplication(EmailSender emailSender) {
		this.emailSender = emailSender;
	}

	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		emailSender.sendEmail("onkarhol555@gmail.com", "Test Subject", "Hello! This is a test email.");
	}
}
