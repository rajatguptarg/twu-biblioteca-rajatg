package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.BookSection;
import com.twu.biblioteca.controller.MovieSection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
        MovieSection movieSection = new MovieSection();
        BookSection bookSection = new BookSection();
        View view = new View(menu, bookSection, movieSection);

        view.displayWelcomeMessage();

        assertEquals("HELLO..!! WELCOME TO BIBLIOTECA..!!\n", outContent.toString());
    }

    @Test
    public void shouldBeAbleToDisplayAvailableBooks() {
        Menu menu = new Menu();
        BookSection bookSection = Mockito.mock(BookSection.class);
        MovieSection movieSection = new MovieSection();
        View view = new View(menu, bookSection, movieSection);

        view.displayListOfAvailableBooks();

        Mockito.verify(bookSection).listAvailableBooks();
    }

    @Test
    public void shouldBeAbleToDisplayAvailableMovies() {
        Menu menu = new Menu();
        BookSection bookSection = new BookSection();
        MovieSection movieSection = Mockito.mock(MovieSection.class);
        View view = new View(menu, bookSection, movieSection);

        view.displayListOfAvailableMovies();

        Mockito.verify(movieSection).listAvailableMovies();
    }

    @Test
    public void shouldBeAbleToDisplayErrorMessage() {
        Menu menu = new Menu();
        MovieSection movieSection = new MovieSection();
        BookSection bookSection = new BookSection();
        View view = new View(menu, bookSection, movieSection);

        view.displayErrorMessage();

        assertEquals("Select a valid option!\n", outContent.toString());
    }

    @Test
    public void shouldAskFromMovieSectionToDisplayCheckedOutMovies() {
        Menu menu = new Menu();
        MovieSection movieSection = Mockito.mock(MovieSection.class);
        BookSection bookSection = new BookSection();
        View view = new View(menu, bookSection, movieSection);

        view.displayListOfCheckedOutMovies();

        Mockito.verify(movieSection).listCheckedOutMovies();
    }

    @Test
    public void shouldAskFromBookSectionToDisplayCheckedOutBooks() {
        Menu menu = new Menu();
        MovieSection movieSection = new MovieSection();
        BookSection bookSection = Mockito.mock(BookSection.class);
        View view = new View(menu, bookSection, movieSection);

        view.displayListOfCheckedOutBooks();

        Mockito.verify(bookSection).listCheckedOutBooks();
    }

    @After
    public void cleanUpStreams() {
        System.setOut(original);
    }

}
