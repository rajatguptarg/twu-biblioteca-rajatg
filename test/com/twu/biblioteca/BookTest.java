package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;


public class BookTest {

    @Test
    public void shouldReturnTheBookName() {
        Book book = new Book();

        assertEquals("", book.getBookName());
    }

    @Test
    public void shouldReturnTheAuthorOfTheBook() {
        Book book = new Book();

        assertEquals("", book.getBookAuthor());
    }

    @Test
    public void shouldReturnThePushingYearOfTheBook() {
        Book book = new Book();

        assertEquals("", book.getYearPublished());
    }
}