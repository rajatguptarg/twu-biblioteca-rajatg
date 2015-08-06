package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Dispatcher;
import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.helper.Constants;
import com.twu.biblioteca.model.User;


public class ListAll {
    private Library bookSection;
    private Library movieSection;
    private Dispatcher dispatcher;

    public ListAll(Library bookSection, Library movieSection, Dispatcher dispatcher) {
        this.bookSection = bookSection;
        this.movieSection = movieSection;
        this.dispatcher = dispatcher;
    }

    public void availableBooks(User user) {
        if (user.isAdminUser() || user.isNormalUser()) {
            String header = String.format("%-20s %-20s %-6s", "BOOK", "AUTHOR", "YEAR");
            System.out.println("\n"+header);
            System.out.println("==================================================");
            String result = bookSection.listAvailableItems();
            System.out.print(result);
        }
        dispatcher.start(Constants.MENU_RUN, user);
    }

    public void availableMovies(User user) {
        String header = String.format("%-20s %-6s %-20s %-5s", "MOVIE", "YEAR", "DIRECTOR", "RATING");
        System.out.println("\n" + header);
        System.out.println("==========================================================");
        if (user.isAdminUser() || user.isNormalUser()) {
            System.out.print(movieSection.listAvailableItems());
        }
        dispatcher.start(Constants.MENU_RUN, user);
    }

    public void checkedOutBooks(User user) {
        if (user.isAdminUser()) {
            String header = String.format("%-20s %-20s %-6s", "BOOK", "AUTHOR", "YEAR");
            System.out.println("\n"+header);
            System.out.println("==================================================");
            System.out.print(bookSection.listCheckedOutItems());
        }
        dispatcher.start(Constants.MENU_RUN, user);
    }

    public void checkedOutMovies(User user) {
        if (user.isAdminUser()) {
            String header = String.format("%-20s %-6s %-20s %-5s", "MOVIE", "YEAR", "DIRECTOR", "RATING");
            System.out.println("\n" + header);
            System.out.println("==========================================================");
            System.out.print(movieSection.listCheckedOutItems());
        }
        dispatcher.start(Constants.MENU_RUN, user);
    }
}
