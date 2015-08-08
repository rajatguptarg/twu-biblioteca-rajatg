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
        this.currentHolder = null;
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
    public void issueTo(User user) {
        this.currentHolder = user;
    }

    @Override
    public User getCurrentHolder() {
        return currentHolder;
    }

    @Override
    public boolean resetOwnership(User user) {
        if (currentHolder.equals(user)) {
            currentHolder = null;
            return true;
        }
        return false;
    }
}
