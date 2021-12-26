package com.example.lesson4.model;

import java.io.Serializable;

public class BookModel implements Serializable {
    private String name;
    private String description;
    private  String title;


    public BookModel(String name, String description, String title) {
        this.name = name;
        this.description = description;
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
