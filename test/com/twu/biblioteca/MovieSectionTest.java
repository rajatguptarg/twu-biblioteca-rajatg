package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class MovieSectionTest {

    @Test
    public void shouldReturnListOfMovies() {
        MovieSection movieSection = new MovieSection();

        movieSection.addMovieToLibrary();
        int totalMovies = movieSection.listAllMovies().size();

        assertEquals(true, totalMovies > 0);
    }

    @Test
    public void shouldBeAbleToCheckOutMovie() {
        MovieSection movieSection = new MovieSection();
        String nameOfMovie = "my movie";

        assertEquals(false, movieSection.performCheckOutMovie(nameOfMovie));
    }
}
