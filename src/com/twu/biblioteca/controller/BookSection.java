package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;
import java.util.List;


public class BookSection implements Library {
    private List<Book> availableBooks;
    private List<Book> checkedOutBooks;

    public BookSection() {
        this.availableBooks = new ArrayList<Book>();
        this.checkedOutBooks = new ArrayList<Book>();
        addBookToLibrary();
    }

    private void addBookToLibrary() {
        availableBooks.add(new Book("Great Rajat", "Gatsby", "2015"));
        availableBooks.add(new Book("Incredible Rajat", "Tyrion Lannister", "2010"));
        availableBooks.add(new Book("Have Fun", "Rajat", "2012"));
        availableBooks.add(new Book("I know nothing", "Jon Snow", "2011"));
        availableBooks.add(new Book("valar morghulis", "Khalisi", "2010"));
    }

    @Override
    public boolean performCheckOut(String nameOfBook) {
        Book requiredBook = this.searchBookByName(nameOfBook, availableBooks);
        if (requiredBook == null || (checkedOutBooks.contains(requiredBook))) {
            return false;
        }
        return checkOutBook(requiredBook);
    }

    @Override
    public boolean performReturn(String nameOfBook) {
        Book requiredBook = this.searchBookByName(nameOfBook, checkedOutBooks);
        if (requiredBook == null || (availableBooks.contains(requiredBook))) {
            return false;
        }
        return checkInBook(requiredBook);
    }

    private boolean checkOutBook(Book book) {
        return (checkedOutBooks.add(book) && availableBooks.remove(book));
    }

    private boolean checkInBook(Book book) {
        return (checkedOutBooks.remove(book) && availableBooks.add(book));
    }

    private Book searchBookByName(String nameOfBook, List<Book> booksList) {
        Book searchedBook = null;
        for(Book book : booksList) {
            if (book.hasTitle(nameOfBook)) {
                searchedBook = book;
                break;
            }
        }
        return searchedBook;
    }

    public List<Book> listAvailableBooks() {
        return availableBooks;
    }

    public List<Book> listCheckedOutBooks() {
        return checkedOutBooks;
    }
}