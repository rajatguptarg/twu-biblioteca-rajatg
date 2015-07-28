package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;


public class LibraryTest {

    @Test
    public void libraryShouldReturnListOfAllBooks() {
        Library library = Mockito.mock(Library.class);

        library.listAllBooks();

        Mockito.verify(library).listAllBooks();
    }

    @Test
    public void shouldReturnListOfAllBooks() throws Exception {
        Library library = new Library();
        List<String> expectedList = new ArrayList<String>();

        assertEquals(expectedList, library.listAllBooks());

    }
}