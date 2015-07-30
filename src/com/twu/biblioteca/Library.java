package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> listOfBooks = new ArrayList<Book>();
    private List<Book> checkedOutBooks = new ArrayList<Book>();

    public Library() {
        this.listOfBooks = new ArrayList<Book>();
    }

    public void addBookToLibrary() {
        listOfBooks.add(new Book("Great Rajat", "Gatsby", "2015"));
        listOfBooks.add(new Book("Incredible Rajat", "Tyrion Lannister", "2010"));
        listOfBooks.add(new Book("Have Fun", "Rajat", "2012"));
        listOfBooks.add(new Book("I know nothing", "Jon Snow", "2011"));
        listOfBooks.add(new Book("valar morghulis", "Khalisi", "2010"));
    }

    public boolean performCheckOut(String nameOfBook) {
        Book requiredBook = this.searchBookByName(nameOfBook);
        if (requiredBook == null || requiredBook.isBookCheckedOuted()) {
            return false;
        }
        else {
            requiredBook.checkOut();
            return checkedOutBooks.add(requiredBook);
        }
    }

    public boolean performReturnBook(String nameOfBook) {
        Book requiredBook = this.searchBookByName(nameOfBook);
        if (requiredBook == null || (!checkedOutBooks.contains(requiredBook))) {
            return false;
        }
        else {
            requiredBook.checkIn();
            return checkedOutBooks.remove(requiredBook);
        }
    }

    public Book searchBookByName(String nameOfBook) {
        Book searchedBook = null;
        for(Book book : listOfBooks) {
            if (book.bookName.equals(nameOfBook)) {
                searchedBook = book;
                break;
            }
        }
        return searchedBook;
    }

    public List<String> listAllBooks() {
        List<String> books = new ArrayList<String>();

        for(Book book : listOfBooks) {
            if (!book.isBookCheckedOuted()) {
                String bookRecord = String.format("%-20s %-20s %-6s", book.bookName,
                        book.bookAuthor, book.yearPublished);
                books.add(bookRecord);
            }
        }
        return books;
    }
}
