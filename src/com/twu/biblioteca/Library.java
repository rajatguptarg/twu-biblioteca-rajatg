package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> listOfBooks = new ArrayList<Book>();

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

    public List<String> listAllBooks() {
        List<String> books = new ArrayList<String>();

        for(Book book : listOfBooks) {
            books.add(("| "+book.getBookName() + " | " + book.getBookAuthor() + " | " + book.getYearPublished()+" |"));
        }

        return books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Library library = (Library) o;

        return !(listOfBooks != null ? !listOfBooks.equals(library.listOfBooks) : library.listOfBooks != null);

    }

    @Override
    public int hashCode() {
        return listOfBooks != null ? listOfBooks.hashCode() : 0;
    }
}
