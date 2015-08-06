package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.model.User;


public class ListAll {
    private Library bookSection;
    private Library movieSection;
    private Menu menu;

    public void initiate(Library bookSection, Library movieSection, Menu menu) {
        this.bookSection = bookSection;
        this.movieSection = movieSection;
        this.menu = menu;
    }

    public void availableBooks(User user) {
        if (user.isAdminUser() || user.isNormalUser()) {
            String header = String.format("%-20s %-20s %-6s", "BOOK", "AUTHOR", "YEAR");
            System.out.println("\n"+header);
            System.out.println("==================================================");
            String result = bookSection.listAvailableItems();
            System.out.print(result);
        }
        menu.run(user);
    }

    public void availableMovies(User user) {
        String header = String.format("%-20s %-6s %-20s %-5s", "MOVIE", "YEAR", "DIRECTOR", "RATING");
        System.out.println("\n" + header);
        System.out.println("==========================================================");
        if (user.isAdminUser() || user.isNormalUser()) {
            System.out.print(movieSection.listAvailableItems());
        }
        menu.run(user);
    }

    public void checkedOutBooks(User user) {
        if (user.isAdminUser()) {
            String header = String.format("%-20s %-20s %-6s", "BOOK", "AUTHOR", "YEAR");
            System.out.println("\n"+header);
            System.out.println("==================================================");
            System.out.print(bookSection.listCheckedOutItems());
        }
        menu.run(user);
    }

    public void checkedOutMovies(User user) {
        if (user.isAdminUser()) {
            String header = String.format("%-20s %-6s %-20s %-5s", "MOVIE", "YEAR", "DIRECTOR", "RATING");
            System.out.println("\n" + header);
            System.out.println("==========================================================");
            System.out.print(movieSection.listCheckedOutItems());
        }
        menu.run(user);
    }
}
