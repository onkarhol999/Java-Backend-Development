package com.onkar.Question_Reminder_Backend.task;

import com.onkar.Question_Reminder_Backend.model.Question;
import com.onkar.Question_Reminder_Backend.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class QuestionScheduler {

    @Autowired
    private QuestionService questionService;

    // Scheduled to run every day at midnight
    @Scheduled(cron = "0 39 17 * * ?")
    public void printQuestionOfTheDay() {
        Question question = questionService.getQuestionOfTheDay();
        if (question != null) {
            System.out.println("Question of the day: " + question.getQuestion());
            System.out.println("Answer: " + question.getAnswer());
        } else {
            System.out.println("No questions available.");
        }
    }
}
