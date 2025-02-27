package com.visansi.CRUD.model;

import java.util.Date;

public class Activity {

    //Declaración de variables
    private int id;
    private String name;
    private String description;
    private Date startDate;
    private Date finishDate;
    private String state;
    private User responsible;

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public User getResponsible() {
        return responsible;
    }
}
