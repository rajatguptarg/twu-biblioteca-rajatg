package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MovieTest {

    @Test
    public void shouldBeAbleToMatchItsNameWithCaseSensitivity() {
        Movie movie = new Movie("Kill Bill", "2010", "John", "4.5");

        assertEquals(true, movie.hasTitle("Kill Bill"));
    }

    @Test
    public void shouldBeAbleToMatchItsNameWithOutCaseSensitivity() {
        Movie movie = new Movie("Kill Bill", "2010", "John", "4.5");

        assertEquals(true, movie.hasTitle("kill bill"));
    }
}
