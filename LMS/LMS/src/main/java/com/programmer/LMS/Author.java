package com.programmer.LMS;

public class Author {
    private int age;
    private String name;
    private String gender;
    private double rating;

    public Author() {
    }

    public Author(int age, String name, String gender, double rating) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.rating = rating;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
