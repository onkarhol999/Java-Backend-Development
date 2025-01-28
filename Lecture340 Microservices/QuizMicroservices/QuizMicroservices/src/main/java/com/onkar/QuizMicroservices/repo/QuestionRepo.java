package com.onkar.QuizMicroservices.repo;

import com.onkar.QuizMicroservices.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {
    List<Question> findByCategory(String category);

    @Query(value = "SELECT * FROM questions q WHERE q.category = :category ORDER BY RANDOM() LIMIT :noQ", nativeQuery = true)
    List<Question> findRandomQuestionByCategory(String category, int noQ);
}
