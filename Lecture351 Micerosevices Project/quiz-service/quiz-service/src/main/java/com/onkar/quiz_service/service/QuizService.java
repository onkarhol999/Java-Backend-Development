package com.onkar.quiz_service.service;


import com.onkar.quiz_service.feign.Quizinterface;
import com.onkar.quiz_service.model.QuestionWrapper;
import com.onkar.quiz_service.model.Quiz;
import com.onkar.quiz_service.model.Response;
import com.onkar.quiz_service.repo.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepo;

    @Autowired
    Quizinterface quizinterface;


    public ResponseEntity<String> createQuiz(String category, int noQ, String title) {

        List<Integer> questions = quizinterface.getQuestionsForQuiz(category, noQ).getBody();

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizRepo.save(quiz);

        return new ResponseEntity<>("Succes", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(int id) {
        Quiz quiz = quizRepo.findById(id).get();
        List<Integer> questionIds = quiz.getQuestions();
       ResponseEntity<List<QuestionWrapper>> qustions = quizinterface.getQuestionsFromId(questionIds);

        return qustions;
    }

    public ResponseEntity<Integer> getScore(int id, List<Response> responses) {
      ResponseEntity<Integer> count = quizinterface.getScore(responses);
       return count;
    }
}
