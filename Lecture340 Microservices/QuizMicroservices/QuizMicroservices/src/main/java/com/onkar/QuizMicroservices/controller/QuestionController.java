package com.onkar.QuizMicroservices.controller;

import com.onkar.QuizMicroservices.model.Question;
import com.onkar.QuizMicroservices.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService service;

    @GetMapping("/getAllQuestions")
    public ResponseEntity<List<Question>> getAllQuestion(){
       return service.getAllQuestion();
    }

    @GetMapping("/getQuestions/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable("category") String category){
            return service.getQuestionByCategory(category);
    }

    @PostMapping("/addQuestion")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return service.addQuestion(question);
    }
}
