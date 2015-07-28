package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;


public class BookTest {

    @Test
    public void shouldReturnTheBookName() {
        Book book = new Book("Book 1", "rajat", "2010");

        assertEquals("Book 1", book.getBookName());
    }

    @Test
    public void shouldReturnTheAuthorOfTheBook() {
        Book book = new Book("Book 1", "rajat", "2010");

        assertEquals("rajat", book.getBookAuthor());
    }

    @Test
    public void shouldReturnThePushingYearOfTheBook() {
        Book book = new Book("Book 1", "rajat", "2010");

        assertEquals("2010", book.getYearPublished());
    }
}