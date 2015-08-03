package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.model.LibraryItem;

import java.util.List;
import java.util.Scanner;


public class View {
    private Menu menu;
    private Library bookSection;
    private Library movieSection;

    public View(Menu menu, Library bookSection, Library movieSection) {
        this.menu = menu;
        this.bookSection = bookSection;
        this.movieSection = movieSection;
    }

    private String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int chooseOption() {
        System.out.print("Choose Option: ");
        try {
            return Integer.parseInt(getString());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void displayWelcomeMessage() {
        System.out.println(menu.returnWelcomeMessage());
    }

    public void displayAvailableOptionsToUser() {
        System.out.println(menu.toString());
    }

    public void displayErrorMessage() {
        System.out.println("Select a valid option!");
    }

    public void displayListOfAvailableBooks() {
        String header = String.format("%-20s %-20s %-6s", "BOOK", "AUTHOR", "YEAR");
        System.out.println("\n"+header);
        System.out.println("==================================================");
        List<LibraryItem> books;
        books = bookSection.listAvailableItems();
        for (LibraryItem book : books) {
            System.out.println(book.toString());
        }
    }

    public void displayListOfAvailableMovies() {
        String header = String.format("%-20s %-6s %-20s %-5s", "MOVIE", "YEAR", "DIRECTOR", "RATING");
        System.out.println("\n" + header);
        System.out.println("==========================================================");
        List<LibraryItem> movies;
        movies = movieSection.listAvailableItems();
        for (LibraryItem movie : movies) {
            System.out.println(movie.toString());
        }
    }

    public void displayListOfCheckedOutMovies() {
        String header = String.format("%-20s %-6s %-20s %-5s", "MOVIE", "YEAR", "DIRECTOR", "RATING");
        System.out.println("\n" + header);
        System.out.println("==========================================================");
        List<LibraryItem> movies;
        movies = movieSection.listCheckedOutItems();
        for (LibraryItem movie : movies) {
            System.out.println(movie.toString());
        }
    }

    public void displayListOfCheckedOutBooks() {
        String header = String.format("%-20s %-20s %-6s", "BOOK", "AUTHOR", "YEAR");
        System.out.println("\n"+header);
        System.out.println("==================================================");
        List<LibraryItem> books;
        books = bookSection.listCheckedOutItems();
        for (LibraryItem book : books) {
            System.out.println(book.toString());
        }
    }

    public void showStatusOfCheckOutBook() {
        System.out.print("Enter Name of Book: ");
        String nameOfBook = getString();
        if (bookSection.performCheckOut(nameOfBook)) {
            System.out.println("Thank you! Enjoy the book.");
        }
        else {
            System.out.println("That book is not available.");
        }
    }

    public void showStatusOfCheckOutMovie() {
        System.out.print("Enter Name of Movie: ");
        String nameOfMovie = getString();
        if (movieSection.performCheckOut(nameOfMovie)) {
            System.out.println("Thank you! Enjoy the movie.");
        }
        else {
            System.out.println("That movie is not available.");
        }
    }

    public void showReturnBookStatus() {
        System.out.print("Enter Name of Book: ");
        String nameOfBook = getString();
        if (bookSection.performReturn(nameOfBook)) {
            System.out.println("Thank you for returning the book.");
        }
        else {
            System.out.println("That is not a valid book to return.");
        }
    }

    public void showReturnMovieStatus() {
        System.out.print("Enter Name of Movie: ");
        String nameOfMovie = getString();
        if (movieSection.performReturn(nameOfMovie)) {
            System.out.println("Thank you for returning the movie.");
        }
        else {
            System.out.println("That is not valid movie to return.");
        }
    }
}
