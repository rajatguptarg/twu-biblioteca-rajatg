package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.model.LibraryItem;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class ViewTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;

    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldShowWelcomeMessage() {
        Menu menu = new Menu();
        List<LibraryItem> movieList = new ArrayList<LibraryItem>();
        List<LibraryItem> movieListCheckedOut = new ArrayList<LibraryItem>();
        List<LibraryItem> bookList = new ArrayList<LibraryItem>();
        List<LibraryItem> checkedOutBookList = new ArrayList<LibraryItem>();

        Library bookSection = new Library(bookList, checkedOutBookList);
        Library movieSection = new Library(movieList, movieListCheckedOut);

        View view = new View(menu, bookSection, movieSection);

        view.displayWelcomeMessage();

        assertEquals("HELLO..!! WELCOME TO BIBLIOTECA..!!\n", outContent.toString());
    }

    @Test
    public void shouldBeAbleToDisplayAvailableBooks() {
        Menu menu = new Menu();
        List<LibraryItem> movieList = new ArrayList<LibraryItem>();
        List<LibraryItem> movieListCheckedOut = new ArrayList<LibraryItem>();

        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = new Library(movieList, movieListCheckedOut);

        View view = new View(menu, bookSection, movieSection);

        view.displayListOfAvailableBooks();

        Mockito.verify(bookSection).listAvailableItems();
    }

    @Test
    public void shouldBeAbleToDisplayAvailableMovies() {
        Menu menu = new Menu();
        List<LibraryItem> bookList = new ArrayList<LibraryItem>();
        List<LibraryItem> checkedOutBookList = new ArrayList<LibraryItem>();

        Library bookSection = new Library(bookList, checkedOutBookList);
        Library movieSection = Mockito.mock(Library.class);

        View view = new View(menu, bookSection, movieSection);

        view.displayListOfAvailableMovies();

        Mockito.verify(movieSection).listAvailableItems();
    }

    @Test
    public void shouldBeAbleToDisplayErrorMessage() {
        Menu menu = new Menu();
        List<LibraryItem> movieList = new ArrayList<LibraryItem>();
        List<LibraryItem> movieListCheckedOut = new ArrayList<LibraryItem>();
        List<LibraryItem> bookList = new ArrayList<LibraryItem>();
        List<LibraryItem> checkedOutBookList = new ArrayList<LibraryItem>();

        Library bookSection = new Library(bookList, checkedOutBookList);
        Library movieSection = new Library(movieList, movieListCheckedOut);

        View view = new View(menu, bookSection, movieSection);

        view.displayErrorMessage();

        assertEquals("Select a valid option!\n", outContent.toString());
    }

    @Test
    public void shouldAskFromMovieSectionToDisplayCheckedOutMovies() {
        Menu menu = new Menu();
        List<LibraryItem> bookList = new ArrayList<LibraryItem>();
        List<LibraryItem> checkedOutBookList = new ArrayList<LibraryItem>();

        Library bookSection = new Library(bookList, checkedOutBookList);
        Library movieSection = Mockito.mock(Library.class);

        View view = new View(menu, bookSection, movieSection);

        view.displayListOfCheckedOutMovies();

        Mockito.verify(movieSection).listCheckedOutItems();
    }

    @Test
    public void shouldAskFromBookSectionToDisplayCheckedOutBooks() {
        Menu menu = new Menu();
        List<LibraryItem> movieList = new ArrayList<LibraryItem>();
        List<LibraryItem> movieListCheckedOut = new ArrayList<LibraryItem>();

        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = new Library(movieList, movieListCheckedOut);

        View view = new View(menu, bookSection, movieSection);

        view.displayListOfCheckedOutBooks();

        Mockito.verify(bookSection).listCheckedOutItems();
    }

    @After
    public void cleanUpStreams() {
        System.setOut(original);
    }

}
