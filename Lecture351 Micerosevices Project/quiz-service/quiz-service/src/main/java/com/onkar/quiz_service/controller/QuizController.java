package com.onkar.quiz_service.controller;

import com.onkar.quiz_service.model.QuestionWrapper;
import com.onkar.quiz_service.model.Quiz;
import com.onkar.quiz_service.model.QuizDto;
import com.onkar.quiz_service.model.Response;
import com.onkar.quiz_service.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestBody QuizDto quizDto){
        return quizService.createQuiz(quizDto.getCategory(), quizDto.getNumQue(), quizDto.getTitle());
    }

    @GetMapping("/getQuiz/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(@PathVariable int id){
        return quizService.getQuizQuestion(id);
    }
    @PostMapping("/submit/{id}")
    public ResponseEntity<Integer> getScore(@PathVariable int id, @RequestBody List<Response> response){
         return quizService.getScore(id, response);
    }
}
