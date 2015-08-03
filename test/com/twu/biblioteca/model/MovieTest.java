package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MovieTest {

    @Test
    public void shouldReturnTheNameOfMovie() {
        Movie movie = new Movie("Kill Bill", "2010", "John", "Unrated");

        assertEquals("Kill Bill", movie.getMovieName());
    }

    @Test
    public void shouldReturnTheReleasingYearOfTeMovie() {
        Movie movie = new Movie("Kill Bill", "2010", "John", "Unrated");

        assertEquals("2010", movie.getYearReleased());
    }

    @Test
    public void shouldReturnTheDirectorNameOfTheMovie() {
        Movie movie = new Movie("Kill Bill", "2010", "John", "Unrated");

        assertEquals("John", movie.getDirectorName());
    }

    @Test
    public void shouldReturnTheRatingOfMovieAsUnrated() {
        Movie movie = new Movie("Kill Bill", "2010", "John", "Unrated");

        assertEquals("Unrated", movie.getMovieRating());
    }

    @Test
    public void shouldReturnTheRatingOfMovie() {
        Movie movie = new Movie("Kill Bill", "2010", "John", "9.2");

        assertEquals("9.2", movie.getMovieRating());
    }

    @Test
    public void shouldBeAbleToMatchItsNameWithCaseSensitivity() {
        Movie movie = new Movie("Kill Bill", "2010", "John", "4.5");

        assertEquals(true, movie.hasName("Kill Bill"));
    }

    @Test
    public void shouldBeAbleToMatchItsNameWithOutCaseSensitivity() {
        Movie movie = new Movie("Kill Bill", "2010", "John", "4.5");

        assertEquals(true, movie.hasName("kill bill"));
    }
}