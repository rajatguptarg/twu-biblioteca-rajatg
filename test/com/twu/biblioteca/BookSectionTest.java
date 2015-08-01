package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;


public class BookSectionTest {

    @Test
    public void shouldReturnListOfAllBooks() {
        BookSection bookSection = new BookSection();
        List<String> expectedList = new ArrayList<String>();

        assertEquals(expectedList, bookSection.listAllBooks());
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

    @Test
    public void shouldReturnListOfMovies() {
        BookSection bookSection = new BookSection();

        bookSection.addMovieToLibrary();
        int totalMovies = bookSection.listAllMovies().size();

        assertEquals(true, totalMovies > 0);
    }
}
