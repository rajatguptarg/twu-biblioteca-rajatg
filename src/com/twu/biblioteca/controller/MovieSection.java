package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Movie;

import java.util.ArrayList;
import java.util.List;


public class MovieSection implements Library{
    private List<Movie> availableMovies;
    private List<Movie> checkedOutMovies;

    public MovieSection() {
        availableMovies = new ArrayList<Movie>();
        checkedOutMovies = new ArrayList<Movie>();
        addMovieToLibrary();
    }

    public void addMovieToLibrary() {
        availableMovies.add(new Movie("XXX", "2010", "John Doe", "7.2"));
        availableMovies.add(new Movie("XXX 2", "2010", "John Doe", "4.2"));
        availableMovies.add(new Movie("X-Men", "2012", "John Doe", "8.2"));
        availableMovies.add(new Movie("Shawshank Redemption", "1994", "John Doe", "9.2"));
        availableMovies.add(new Movie("Hulk", "2007", "John Doe", "7.0"));
    }


    public List<Movie> listAvailableMovies() {
        return availableMovies;
    }

    public List<Movie> listCheckedOutMovies() {
        return checkedOutMovies;
    }

    @Override
    public boolean performCheckOut(String nameOfMovie) {
        Movie requiredMovie = this.searchMovieByName(nameOfMovie, availableMovies);
        if (requiredMovie == null || (checkedOutMovies.contains(requiredMovie))) {
            return false;
        }
        return checkOutMovie(requiredMovie);
    }

    @Override
    public boolean performReturn(String nameOfMovie) {
        Movie requiredMovie = this.searchMovieByName(nameOfMovie, checkedOutMovies);
        if (requiredMovie == null || (availableMovies.contains(requiredMovie))) {
            return false;
        }
        return CheckInMovie(requiredMovie);
    }

    private boolean CheckInMovie(Movie requiredMovie) {
        return (checkedOutMovies.remove(requiredMovie) && availableMovies.add(requiredMovie));
    }

    private boolean checkOutMovie(Movie movie) {
        return (checkedOutMovies.add(movie) && availableMovies.remove(movie));
    }

    private Movie searchMovieByName(String nameOfMovie, List<Movie> moviesList) {
        Movie searchedMovie = null;
        for (Movie movie : moviesList) {
            if (movie.hasName(nameOfMovie)) {
                searchedMovie = movie;
                break;
            }
        }
        return searchedMovie;
    }
}
