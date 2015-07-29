package com.twu.biblioteca;


public class Book {
    String bookName;
    String bookAuthor;
    String yearPublished;
    private boolean checkoutStatus;

    public Book(String bookName, String bookAuthor, String yearPublished) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearPublished = yearPublished;
        this.checkoutStatus = false;
    }

    public boolean isBookCheckedOuted() {
        return checkoutStatus;
    }

    public void checkOut() {
        checkoutStatus = true;
    }
}
