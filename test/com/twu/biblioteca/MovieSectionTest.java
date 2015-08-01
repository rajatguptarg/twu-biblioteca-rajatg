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
}