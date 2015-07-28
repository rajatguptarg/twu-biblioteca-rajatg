package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> listOfBooks = new ArrayList<Book>();

    public Library() {
        this.listOfBooks = new ArrayList<Book>();
    }

    public void addBookToLibrary() {
        listOfBooks.add(new Book("r", "r", "1"));
    }

    public List<String> listAllBooks() {
        List<String> books = new ArrayList<String>();

        for(Book book : listOfBooks) {
            books.add((book.getBookName() + "\t" + book.getBookAuthor() + "\t" + book.getYearPublished()));
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
