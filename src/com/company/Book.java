package com.company;

import java.util.ArrayList;

public class Book {
    private String name;
    private Author author ;
    private double price = 0;

    public Book() {
    }

    public Book(String name, Author author, double price) {

        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthors() {
        return author;
    }

    public void setAuthors(Author author) {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void setAuthor(Author author) {
        this.author = author;
    }
}
