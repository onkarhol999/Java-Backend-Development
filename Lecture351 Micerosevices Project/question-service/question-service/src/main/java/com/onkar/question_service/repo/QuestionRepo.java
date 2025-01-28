package com.onkar.question_service.repo;

import com.onkar.question_service.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {
    List<Question> findByCategory(String category);

    @Query(value = "SELECT q.id FROM questions q WHERE q.category = :category ORDER BY RANDOM() LIMIT :numQue", nativeQuery = true)
    List<Integer> findRandomQuestionByCategory(String category, int numQue);
}
