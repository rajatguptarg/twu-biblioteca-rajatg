package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> availableBooks = new ArrayList<Book>();
    private List<Book> checkedOutBooks = new ArrayList<Book>();

    public Library() {
        this.availableBooks = new ArrayList<Book>();
    }

    public void addBookToLibrary() {
        availableBooks.add(new Book("Great Rajat", "Gatsby", "2015"));
        availableBooks.add(new Book("Incredible Rajat", "Tyrion Lannister", "2010"));
        availableBooks.add(new Book("Have Fun", "Rajat", "2012"));
        availableBooks.add(new Book("I know nothing", "Jon Snow", "2011"));
        availableBooks.add(new Book("valar morghulis", "Khalisi", "2010"));
    }

    public boolean performCheckOutBook(String nameOfBook) {
        Book requiredBook = this.searchBookByName(nameOfBook, availableBooks);
        if (requiredBook == null || (checkedOutBooks.contains(requiredBook))) {
            return false;
        }
        return checkOut(requiredBook);
    }

    public boolean performReturnBook(String nameOfBook) {
        Book requiredBook = this.searchBookByName(nameOfBook, checkedOutBooks);
        if (requiredBook == null || (availableBooks.contains(requiredBook))) {
            return false;
        }
        return checkIn(requiredBook);
    }

    private boolean checkOut(Book book) {
        return (checkedOutBooks.add(book) && availableBooks.remove(book));
    }

    private boolean checkIn(Book book) {
        return (checkedOutBooks.remove(book) && availableBooks.add(book));
    }

    private Book searchBookByName(String nameOfBook, List<Book> booksList) {
        Book searchedBook = null;
        for(Book book : booksList) {
            if (book.getBookName().equals(nameOfBook)) {
                searchedBook = book;
                break;
            }
        }
        return searchedBook;
    }

    public List<String> listAllBooks() {
        List<String> books = new ArrayList<String>();
        for(Book book : availableBooks) {
            String bookRecord = String.format("%-20s %-20s %-6s", book.getBookName(),
                    book.getBookAuthor(), book.getYearPublished());
            books.add(bookRecord);

        }
        return books;
    }
}
