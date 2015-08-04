package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Authenticator;
import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.model.LibraryItem;
import com.twu.biblioteca.model.User;
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

        List<User> registeredUser = new ArrayList<User>();
        Authenticator authenticator = new Authenticator(registeredUser);

        View view = new View(menu, bookSection, movieSection, authenticator);

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

        List<User> registeredUser = new ArrayList<User>();
        Authenticator authenticator = new Authenticator(registeredUser);

        View view = new View(menu, bookSection, movieSection, authenticator);

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

        List<User> registeredUser = new ArrayList<User>();
        Authenticator authenticator = new Authenticator(registeredUser);

        View view = new View(menu, bookSection, movieSection, authenticator);

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

        List<User> registeredUser = new ArrayList<User>();
        Authenticator authenticator = new Authenticator(registeredUser);

        View view = new View(menu, bookSection, movieSection, authenticator);

        view.displayErrorMessage();

        assertEquals("Select a valid option!\n\n", outContent.toString());
    }

    @Test
    public void shouldAskFromMovieSectionToDisplayCheckedOutMovies() {
        Menu menu = new Menu();
        List<LibraryItem> bookList = new ArrayList<LibraryItem>();
        List<LibraryItem> checkedOutBookList = new ArrayList<LibraryItem>();

        Library bookSection = new Library(bookList, checkedOutBookList);
        Library movieSection = Mockito.mock(Library.class);

        List<User> registeredUser = new ArrayList<User>();
        Authenticator authenticator = new Authenticator(registeredUser);

        View view = new View(menu, bookSection, movieSection, authenticator);

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

        List<User> registeredUser = new ArrayList<User>();
        Authenticator authenticator = new Authenticator(registeredUser);

        View view = new View(menu, bookSection, movieSection, authenticator);

        view.displayListOfCheckedOutBooks();

        Mockito.verify(bookSection).listCheckedOutItems();
    }

    @After
    public void cleanUpStreams() {
        System.setOut(original);
    }

}
