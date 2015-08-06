package com.twu.biblioteca.model;


public class Movie implements LibraryItem {
    private String movieName;
    private String yearReleased;
    private String directorName;
    private String movieRating;
    private User currentHolder;

    public Movie(String movieName, String yearReleased, String directorName, String movieRating) {
        this.movieName = movieName;
        this.yearReleased = yearReleased;
        this.directorName = directorName;
        this.movieRating = movieRating;
        currentHolder = null;
    }

    @Override
    public boolean hasTitle(String title) {
        return movieName.equalsIgnoreCase(title);
    }

    @Override
    public String toString() {
        return String.format("%-20s %-6s %-20s %-5s\n", movieName, yearReleased, directorName, movieRating);
    }

    @Override
    public boolean issueTo(User user) {
        this.currentHolder = user;
        return currentHolder != null;
    }
}
