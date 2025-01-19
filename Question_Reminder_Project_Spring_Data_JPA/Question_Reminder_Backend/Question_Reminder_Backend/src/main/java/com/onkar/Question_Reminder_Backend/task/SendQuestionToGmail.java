package com.onkar.Question_Reminder_Backend.task;

import com.onkar.Question_Reminder_Backend.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SendQuestionToGmail {

    @Autowired
    private JavaMailSender mailSender;

    public void sendQuestionToGmailId(Question question, String recipientEmail) {
        try {
            // Create an email message
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("holonkar2003@gmail.com"); // Sender's email
            message.setTo(recipientEmail);            // Recipient's email
            message.setSubject("Question of the Day");
            message.setText("Question: " + question.getQuestion() + "\nAnswer: " + question.getAnswer());

            // Send the email
            mailSender.send(message);

            System.out.println("Email sent successfully to " + recipientEmail);
        } catch (Exception e) {
            System.err.println("Failed to send email: " + e.getMessage());
        }
    }
}
