package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class BookSectionTest {

    @Test
    public void shouldReturnListOfBooks() {
        BookSection bookSection = new BookSection();

        bookSection.addBookToLibrary();
        int totalBooks = bookSection.listAllBooks().size();

        assertEquals(true, totalBooks > 0);
    }

    @Test
    public void libraryShouldNotBedAbleToCheckOutBookIfBookIsNotPresent() {
        BookSection bookSection = new BookSection();
        String nameOfBook="my book";

        assertEquals(false, bookSection.performCheckOutBook(nameOfBook));
    }

    @Test
    public void libraryShouldBeAbleToTakeReturnedBook() {
        BookSection bookSection = new BookSection();

        bookSection.addBookToLibrary();
        bookSection.performCheckOutBook("Great Rajat");

        assertEquals(true, bookSection.performReturnBook("Great Rajat"));
    }
}