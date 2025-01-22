package com.onkar.SprinfSecurityProjectPractice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class JobPost {
    @Id
    private int id;
    private String titel;
    private String description;
    private int salery;

    public JobPost(int id, String titel, String description, int salery) {
        this.id = id;
        this.titel = titel;
        this.description = description;
        this.salery = salery;
    }
    public JobPost(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSalery() {
        return salery;
    }

    public void setSalery(int salery) {
        this.salery = salery;
    }
}
