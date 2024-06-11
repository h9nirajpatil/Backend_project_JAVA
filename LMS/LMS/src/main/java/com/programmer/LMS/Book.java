package com.programmer.LMS;

public class Book extends Author{
    private int pages;

    public Book(){}

    public Book(int pages) {
        this.pages = pages;
    }

    public Book(int age, String name, String gender, double rating, int pages) {
        super(age, name, gender, rating);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
