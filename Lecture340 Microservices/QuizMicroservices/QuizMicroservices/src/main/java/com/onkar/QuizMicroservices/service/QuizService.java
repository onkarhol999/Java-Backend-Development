package com.onkar.QuizMicroservices.service;

import com.onkar.QuizMicroservices.model.Question;
import com.onkar.QuizMicroservices.model.QuestionWrapper;
import com.onkar.QuizMicroservices.model.Quiz;
import com.onkar.QuizMicroservices.model.Response;
import com.onkar.QuizMicroservices.repo.QuestionRepo;
import com.onkar.QuizMicroservices.repo.QuizRepository;
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
    private QuestionRepo questionRepo;


    public ResponseEntity<String> createQuiz(String category, int noQ, String title) {

        List<Question> questions = questionRepo.findRandomQuestionByCategory(category, noQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizRepo.save(quiz);
        return new ResponseEntity<>("Succes", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(int id) {
        Optional<Quiz> quiz = quizRepo.findById(id);
        List<Question> questionFromDB = quiz.get().getQuestions();
        List<QuestionWrapper> questionsFromUser = new ArrayList<>();

        for(Question q : questionFromDB){
            QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getQuestion(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
            questionsFromUser.add(qw);
        }
        return new ResponseEntity<>(questionsFromUser, HttpStatus.OK);
    }

    public ResponseEntity<Integer> getScore(int id, List<Response> responses) {
       Quiz quiz = quizRepo.findById(id).get();
       List<Question> questions = quiz.getQuestions();
       int count = 0;
       int i = 0;
       for(Response response :  responses){
           if(response.getResponse().equals(questions.get(i).getRightAnswer())){
               count++;
           }
           i++;
       }
       return new ResponseEntity<>(count, HttpStatus.OK);
    }
}
