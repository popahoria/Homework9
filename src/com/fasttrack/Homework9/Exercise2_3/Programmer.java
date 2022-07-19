package com.fasttrack.Homework9.Exercise2_3;


public class Programmer extends Employee {

    private String language;


    public Programmer(String firstName, String lastName) {
        super(firstName, lastName);
    }


    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }


    public String getPosition() {
        return " Programmer " + getLanguage();

    }
}
