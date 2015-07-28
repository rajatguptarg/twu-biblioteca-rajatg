package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;


public class Library {
    List<Book> listOfBooks;

    public Library() {
        this.listOfBooks = new ArrayList<Book>();
    }

    public void listAllBooks() {
        System.out.println("LIST OF BOOKS:");
        for(Book book : listOfBooks) {
            System.out.println(book.getBookName()+" "+book.getBookAuthor()+" "+book.getYearPublished());
        }
    }
}
