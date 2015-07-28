package com.twu.biblioteca;


public class Library {
    private Book[] listOfBooks;

    public Library(Book[] listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public Book[] getBooks() {
        return listOfBooks;
    }
}
