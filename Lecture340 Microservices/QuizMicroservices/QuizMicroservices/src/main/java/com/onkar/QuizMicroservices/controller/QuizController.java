package com.onkar.QuizMicroservices.controller;

import com.onkar.QuizMicroservices.model.Question;
import com.onkar.QuizMicroservices.model.QuestionWrapper;
import com.onkar.QuizMicroservices.model.Response;
import com.onkar.QuizMicroservices.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int noQ, @RequestParam String title){
        return quizService.createQuiz(category, noQ, title);
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
