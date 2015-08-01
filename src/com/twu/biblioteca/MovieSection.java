package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class MovieSection {
    private List<Movie> availableMovies;

    public MovieSection() {
        availableMovies = new ArrayList<Movie>();
    }

    public void addMovieToLibrary() {
        availableMovies.add(new Movie("XXX", "2010", "John Doe", "7.2"));
        availableMovies.add(new Movie("XXX 2", "2010", "John Doe", "4.2"));
        availableMovies.add(new Movie("X-Men", "2012", "John Doe", "8.2"));
        availableMovies.add(new Movie("Shawshank Redemption", "1994", "John Doe", "9.2"));
        availableMovies.add(new Movie("Hulk", "2007", "John Doe", "7.0"));
    }


    public List<Movie> listAllMovies() {
        List<Movie> movies = new ArrayList<Movie>();
        for (Movie movie : availableMovies) {
            movies.add(movie);
        }
        return movies;
    }
}
