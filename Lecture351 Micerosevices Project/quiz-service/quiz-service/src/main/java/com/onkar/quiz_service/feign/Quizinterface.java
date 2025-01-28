package com.onkar.quiz_service.feign;

import com.onkar.quiz_service.model.QuestionWrapper;
import com.onkar.quiz_service.model.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("QUESTION-SERVICE")
public interface Quizinterface {
    @GetMapping("/questions/createQuiz")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String catagory, @RequestParam int numQue);

    @PostMapping("/questions/getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionId);

    @PostMapping("/questions/getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses);
}
