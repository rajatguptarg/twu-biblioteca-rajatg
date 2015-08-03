package com.twu.biblioteca.controller;

import com.twu.biblioteca.controller.MovieSection;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class MovieSectionTest {

    @Test
    public void shouldReturnListOfMovies() {
        MovieSection movieSection = new MovieSection();

        int totalMovies = movieSection.listAvailableMovies().size();

        assertEquals(true, totalMovies > 0);
    }

    @Test
    public void shouldReturnListOfCheckedOutMovies() {
        MovieSection movieSection = new MovieSection();

        movieSection.performCheckOutMovie("XXX");
        int totalCheckedOutMovies = movieSection.listCheckedOutMovies().size();

        assertEquals(true, totalCheckedOutMovies > 0);

    }

    @Test
    public void shouldNotBeAbleToCheckOutMovieIfMovieIsNotPresent() {
        MovieSection movieSection = new MovieSection();
        String nameOfMovie = "my movie";

        assertEquals(false, movieSection.performCheckOutMovie(nameOfMovie));
    }

    @Test
    public void shouldBeAbleToTakeReturnedMovies() {
        MovieSection movieSection = new MovieSection();

        movieSection.performCheckOutMovie("XXX");

        assertEquals(true, movieSection.performReturnMovie("XXX"));
    }
}
