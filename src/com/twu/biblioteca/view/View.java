package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Authenticator;
import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.model.LibraryItem;
import com.twu.biblioteca.model.User;

import java.io.Console;
import java.util.List;
import java.util.Scanner;


public class View {
    private Menu menu;
    private Library bookSection;
    private Library movieSection;
    private User user;
    private Authenticator authenticator;

    public View(Menu menu, Library bookSection, Library movieSection, Authenticator authenticator) {
        this.menu = menu;
        this.bookSection = bookSection;
        this.movieSection = movieSection;
        this.authenticator = authenticator;
        this.user = null;
    }

    public void displayAvailableMenuToUser() {
        if (user.getRole().equals("admin")) {
            System.out.println(menu.availableOptionsToAdmin());
        }
        else {
            System.out.println(menu.availableOptionsToUser());
        }
    }

    private String readPassword() {
        Console console = System.console();
        if (console == null) {
            System.out.println("Couldn't get Console instance");
            System.exit(0);
        }
        char passwordArray[] = console.readPassword("Enter your Password: ");
        return new String(passwordArray);
    }

    public boolean initiateLogin() {
        System.out.print("\nEnter Library Number: \n");
        String libraryNumber = getString();
        String password = readPassword();
        user = authenticator.loginUser(libraryNumber, password);
        return loginStatus();
    }

    private boolean loginStatus() {
        if (user != null)
            return (user.getRole().equals("admin") || user.getRole().equals("user"));
        return false;
    }

    public String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int chooseOption() {
        System.out.print("Choose Option: \n");
        try {
            return Integer.parseInt(getString());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void displayWelcomeMessage() {
        System.out.println(menu.returnWelcomeMessage());
    }

    public void displayErrorMessage() {
        System.out.println("Select a valid option!\n");
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
        System.out.print("Enter Name of Book: \n");
        String nameOfBook = getString();
        if (bookSection.performCheckOut(nameOfBook, user)) {
            System.out.println("Thank you! Enjoy the book.\n");
        }
        else {
            System.out.println("That book is not available.\n");
        }
    }

    public void showStatusOfCheckOutMovie() {
        System.out.print("Enter Name of Movie: \n");
        String nameOfMovie = getString();
        if (movieSection.performCheckOut(nameOfMovie, user)) {
            System.out.println("Thank you! Enjoy the movie.\n");
        }
        else {
            System.out.println("That movie is not available.\n");
        }
    }

    public void showReturnBookStatus() {
        System.out.print("Enter Name of Book: \n");
        String nameOfBook = getString();
        if (bookSection.performReturn(nameOfBook, user)) {
            System.out.println("Thank you for returning the book.\n");
        }
        else {
            System.out.println("That is not a valid book to return.\n");
        }
    }

    public void showReturnMovieStatus() {
        System.out.print("Enter Name of Movie: \n");
        String nameOfMovie = getString();
        if (movieSection.performReturn(nameOfMovie, user)) {
            System.out.println("Thank you for returning the movie.\n");
        }
        else {
            System.out.println("That is not valid movie to return.\n");
        }
    }
}
