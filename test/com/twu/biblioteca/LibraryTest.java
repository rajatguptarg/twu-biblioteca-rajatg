package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;


public class LibraryTest {

    @Test
    public void libraryShouldPrintAllBooks() {
        Library library = Mockito.mock(Library.class);

        library.listAllBooks();

        Mockito.verify(library).listAllBooks();
    }
}