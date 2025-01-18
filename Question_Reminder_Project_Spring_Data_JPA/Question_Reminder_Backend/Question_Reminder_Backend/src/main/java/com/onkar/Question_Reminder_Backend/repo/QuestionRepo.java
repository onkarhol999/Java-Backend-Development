package com.onkar.Question_Reminder_Backend.repo;

import com.onkar.Question_Reminder_Backend.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
