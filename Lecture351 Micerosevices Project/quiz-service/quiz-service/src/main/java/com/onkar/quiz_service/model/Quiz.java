package com.onkar.quiz_service.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @ElementCollection
    private List<Integer> questionsId;

    public Quiz(Integer id, String title, List<Integer> questionsId) {
        this.id = id;
        this.title = title;
        this.questionsId = questionsId;
    }

    public Quiz() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Integer> getQuestions() {
        return questionsId;
    }

    public void setQuestions(List<Integer> questions) {
        this.questionsId = questions;
    }

}