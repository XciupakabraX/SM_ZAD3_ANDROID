package com.example.myapplication;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public Task(){
        id = UUID.randomUUID();
        date = new Date();
    }

    public void setName(String name) {

        this.name = name;
    }

    public Date getDate() {

        return date;
    }

    public boolean isDone() {

        return done;
    }

    public void setDone(boolean isChecked) {

        done = isChecked;
    }

    public UUID getId() {

        return id;
    }

    public String getName() {

        return name;
    }
}