package com.example.ahmed.dummyapp;

/**
 * Created by Ahmed on 8/10/2017.
 */

public class Contact {
    private String name;
    private String email;
    private String number;
    private int imageResourceId;

    public Contact(String name, String email, String number, int imageResourceId){
        this.name = name;
        this.email = name;
        this.number = number;
        this.imageResourceId = imageResourceId;
    }
    public Contact(){
        name = "xxx";

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public int getImageId() {
        return imageResourceId;
    }
}
