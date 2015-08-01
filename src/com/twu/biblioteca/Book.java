package com.twu.biblioteca;


public class Book {
    private String bookName;
    private String bookAuthor;
    private String yearPublished;

    public Book(String bookName, String bookAuthor, String yearPublished) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearPublished = yearPublished;
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

    public boolean hasTitle(String title) {
        return bookName.equalsIgnoreCase(title);
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %-6s", getBookName(), getBookAuthor(), getYearPublished());
    }
}
