package com.company;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();


    public Library() {

    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    void addBookInBooks(Book book)
    {
        books.add(book);
    }
}
