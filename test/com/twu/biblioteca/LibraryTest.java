package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class LibraryTest {

    @Test
    public void shouldDisplayTheListOfBooks() {
        Book book = new Book("My Book", "Rajat", "2010");
        Library library = new Library(new Book[]{book});

        assertArrayEquals(new Book[]{book}, library.getBooks());
    }
}
