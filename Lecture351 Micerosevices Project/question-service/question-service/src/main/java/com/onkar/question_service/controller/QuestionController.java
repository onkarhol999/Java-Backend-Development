package com.onkar.question_service.controller;

import com.onkar.question_service.model.Question;
import com.onkar.question_service.model.QuestionWrapper;
import com.onkar.question_service.service.QuestionService;
import com.onkar.question_service.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

//    Generate a quiz

    @GetMapping("/createQuiz")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String catagory, @RequestParam int numQue){
        return service.getQuestionForQuiz(catagory, numQue);
    }

    @PostMapping("/getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionId){
        return service.getQuestionById(questionId);
    }

    @PostMapping("/getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses){
        return service.getScore(responses);
    }

//    get Question based on question id;
//    get score


}
