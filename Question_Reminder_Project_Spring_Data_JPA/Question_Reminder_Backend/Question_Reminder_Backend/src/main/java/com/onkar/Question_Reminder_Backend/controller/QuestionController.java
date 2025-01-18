package com.onkar.Question_Reminder_Backend.controller;

import com.onkar.Question_Reminder_Backend.model.Question;
import com.onkar.Question_Reminder_Backend.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QuestionController {

    @Autowired
    private QuestionService service;

    @GetMapping("/getAllQuestions")
    public List<Question> getAllQuestions(){
        return service.getAllQuestions();
    }

    @PostMapping("/addQuestion")
    public String addQuestion(@RequestBody Question question){
        service.addQuestion(question);
        return "Added..";
    }

    @DeleteMapping("/deleteQuestion/{id}")
    public String deleteQuestion(@PathVariable int id){
        service.deleteQuestion(id);
        return "Deleted..";
    }

    @GetMapping("/getQuestionById/{id}")
    public Question getQuestionById(@PathVariable int id){
        return service.getQuestionById(id);
    }

    @PostMapping("/uploadQuestions")
    public String uploadQuestions(@RequestParam("file") MultipartFile file) {
        try {
            service.saveQuestionsFromExcel(file);
            return "File uploaded and data saved successfully!";
        } catch (Exception e) {
            return "Error while processing the file: " + e.getMessage();
        }
    }
}
