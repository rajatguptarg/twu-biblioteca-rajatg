package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;


public class LibraryTest {

    @Test
    public void shouldReturnListOfAllBooks() throws Exception {
        Library library = new Library();
        List<String> expectedList = new ArrayList<String>();

        assertEquals(expectedList, library.listAllBooks());
    }

    @Test
    public void libraryShouldNotBedAbleToCheckOutBookIfBookIsNotPresent() {
        Library library = new Library();
        String nameOfBook="my book";

        assertEquals(false, library.performCheckOutBook(nameOfBook));
    }

    @Test
    public void libraryShouldBeAbleToTakeReturnedBook() {
        Library library = new Library();

        library.addBookToLibrary();
        library.performCheckOutBook("Great Rajat");

        assertEquals(true, library.performReturnBook("Great Rajat"));
    }
}
