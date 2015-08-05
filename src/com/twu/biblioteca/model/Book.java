package com.twu.biblioteca.model;


public class Book implements LibraryItem {
    private String bookName;
    private String bookAuthor;
    private String yearPublished;
    private User currentHolder;

    public Book(String bookName, String bookAuthor, String yearPublished) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearPublished = yearPublished;
        this.currentHolder =  null;
    }

    @Override
    public boolean hasTitle(String title) {
        return bookName.equalsIgnoreCase(title);
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %-6s\n", bookName, bookAuthor, yearPublished);
    }

    @Override
    public boolean issueTo(User user) {
        this.currentHolder = user;
        return currentHolder != null;
    }
}
