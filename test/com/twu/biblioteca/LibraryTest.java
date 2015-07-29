package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class LibraryTest {

    @Test
    public void shouldReturnListOfAllBooks() throws Exception {
        Library library = new Library();
        List<String> expectedList = new ArrayList<String>();

        assertEquals(expectedList, library.listAllBooks());
    }

    @Test
    public void libraryShouldAbleToCheckOutBook() {
        Library library = new Library();
        String nameOfBook="my book";

        assertEquals(false, library.performCheckOut(nameOfBook));
    }

    @Test
    public void libraryShouldBeAbleToTellTheBookIsPresent() {
        Library library = new Library();
        library.addBookToLibrary();

        assertNotEquals(null, library.searchBookByName("Great Rajat"));
    }
}