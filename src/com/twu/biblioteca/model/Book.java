package com.twu.biblioteca.model;


public class Book implements LibraryItem {
    private String bookName;
    private String bookAuthor;
    private String yearPublished;

    public Book(String bookName, String bookAuthor, String yearPublished) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearPublished = yearPublished;
    }

    @Override
    public boolean hasTitle(String title) {
        return bookName.equalsIgnoreCase(title);
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %-6s", bookName, bookAuthor, yearPublished);
    }
}
