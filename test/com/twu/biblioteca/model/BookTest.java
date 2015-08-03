package com.twu.biblioteca.model;

import org.junit.Test;
import static org.junit.Assert.*;


public class BookTest {

    @Test
    public void shouldReturnNameOfTheBook() {
        Book book = new Book("My Book", "Rajat", "2015");

        assertEquals("My Book", book.getBookName());
    }

    @Test
    public void shouldReturnTheAuthorOfTheBook() {
        Book book = new Book("My Book", "Rajat", "2015");

        assertEquals("Rajat", book.getBookAuthor());
    }

    @Test
    public void shouldReturnThePublishedYearOfTheBook() {
        Book book = new Book("My Book", "Rajat", "2015");

        assertEquals("2015", book.getYearPublished());
    }

    @Test
    public void shouldReturnTrueIfTitleIsMatched() {
        Book book = new Book("My Book", "Rajat", "2015");

        assertEquals(true, book.hasTitle("My Book"));
    }
}