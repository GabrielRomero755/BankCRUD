package com.visansi.CRUD.model;

import java.util.Date;
import java.util.List;

public class Proyect {

    //Declaración de variables
    private int id;
    private String name;
    private Date startDate;
    private Date finishDate;
    private String state;
    private List<Activity> activities;
    private List<Service> services;


    //Getters and Settesrs
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public List<Service> getServices() {
        return services;
    }

}
