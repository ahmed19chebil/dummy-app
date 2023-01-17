package com.example.ahmed.dummyapp;

/**
 * Created by Ahmed on 8/5/2017.
 */

public class Note {
    private String title;
    private String context;

    public Note(String title) {
        this.title = title;
    }

    public Note(String title, String context) {
        this.title = title;
        this.context = context;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
