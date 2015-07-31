package com.twu.biblioteca;

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
    public void shouldReturnTheCheckOutStatusOfTheBook() {
        Book book = new Book("My Book", "Rajat", "2015");

        assertEquals(false, book.isBookCheckedOuted());
    }

    @Test
    public void shouldBeAbleToCheckOutBook() {
        Book book = new Book("My Book", "Rajat", "2010");

        book.checkOut();

        assertEquals(true, book.isBookCheckedOuted());
    }

    @Test
    public void shouldBeAbleToCheckInBook() {
        Book book = new Book("My Book", "Rajat", "2010");

        book.checkOut();
        book.checkIn();

        assertEquals(false, book.isBookCheckedOuted());
    }
}
