package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;


public class BookTest {

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
