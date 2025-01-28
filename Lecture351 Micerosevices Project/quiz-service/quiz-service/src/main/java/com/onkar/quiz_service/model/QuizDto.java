package com.onkar.quiz_service.model;

public class QuizDto {
    String category;
    Integer numQue;
    String title;

    public QuizDto(String category, Integer numQue, String title) {
        this.category = category;
        this.numQue = numQue;
        this.title = title;
    }
    public QuizDto(){

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getNumQue() {
        return numQue;
    }

    public void setNumQue(Integer numQue) {
        this.numQue = numQue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

