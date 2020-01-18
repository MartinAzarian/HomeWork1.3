package com.company;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        Author author = new Author("firstName", "lastName");
        book.setName("Java. Эффективное программирование");
        book.setPrice(550);
        book.setAuthors(author);
        Library library = new Library();
        library.addBookInBooks(book);

    }
}
