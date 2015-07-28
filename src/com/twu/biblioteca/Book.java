package com.twu.biblioteca;


public class Book {
    private String bookName;
    private String bookAuthor;
    private String yearPublished;

    public Book() {
        this.bookName = "";
        this.bookAuthor = "";
        this.yearPublished = "";
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getYearPublished() {
        return yearPublished;
    }
}
