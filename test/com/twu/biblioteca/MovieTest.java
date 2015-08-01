package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void shouldReturnTheNameOfMovie() {
        Movie movie = new Movie("Kill Bill", "2010", "John", "Unrated");

        assertEquals("Kill Bill", movie.getMovieName());
    }
}
