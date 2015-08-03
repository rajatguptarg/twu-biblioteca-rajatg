package com.twu.biblioteca;

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
        MovieSection movieSection = new MovieSection();
        BookSection bookSection = new BookSection();
        View view = new View(bookSection, movieSection);

        view.displayWelcomeMessage();

        assertEquals("HELLO..!! WELCOME TO BIBLIOTECA..!!\n", outContent.toString());
    }

    @Test
    public void shouldBeAbleToDisplayErrorMessage() {
        MovieSection movieSection = new MovieSection();
        BookSection bookSection = new BookSection();
        View view = new View(bookSection, movieSection);

        view.displayErrorMessage();

        assertEquals("Select a valid option!\n", outContent.toString());
    }

    @Test
    public void shouldAskFromMovieSectionToDisplayCheckedOutMovies() {
        MovieSection movieSection = Mockito.mock(MovieSection.class);
        BookSection bookSection = new BookSection();
        View view = new View(bookSection, movieSection);

        view.displayListOfCheckedOutMovies();

        Mockito.verify(movieSection).listCheckedOutMovies();
    }

    @Test
    public void shouldAskFromBookSectionToDisplayCheckedOutBooks() {
        MovieSection movieSection = new MovieSection();
        BookSection bookSection = Mockito.mock(BookSection.class);
        View view = new View(bookSection, movieSection);

        view.displayListOfCheckedOutBooks();

        Mockito.verify(bookSection).listCheckedOutBooks();
    }

    @After
    public void cleanUpStreams() {
        System.setOut(original);
    }

}
