package com.twu.biblioteca.model;

public class Movie {
    private String movieName;
    private String yearReleased;
    private String directorName;
    private String movieRating;

    public Movie(String movieName, String yearReleased, String directorName, String movieRating) {
        this.movieName = movieName;
        this.yearReleased = yearReleased;
        this.directorName = directorName;
        this.movieRating = movieRating;
    }

    public String getMovieName() {
        return movieName;
    }
    
    public String getYearReleased() {
        return yearReleased;
    }

    public String getDirectorName() {
        return directorName;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public boolean hasName(String name) {
        return movieName.equalsIgnoreCase(name);
    }

    @Override
    public String toString() {
        return String.format("%-20s %-6s %-20s %-5s", getMovieName(), getYearReleased(), getDirectorName(), getMovieRating());
    }
}