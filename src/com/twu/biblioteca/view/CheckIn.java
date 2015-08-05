package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.model.User;

import java.util.Scanner;

public class CheckIn {
    private Library bookSection;
    private Library movieSection;
    private MenuView menuView;

    public void initiate(Library bookSection, Library movieSection, MenuView menuView) {
        this.bookSection = bookSection;
        this.movieSection = movieSection;
        this.menuView = menuView;
    }

    private String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void performCheckInBook(User user) {
        System.out.print("Enter Name of Book: \n");
        String nameOfBook = getString();
        if (bookSection.performReturn(nameOfBook, user)) {
            System.out.println("Thank you for returning the execute.\n");
        }
        else {
            System.out.println("That is not a valid execute to return.\n");
        }
        menuView.run(user);
    }

    public void performCheckInMovie(User user) {
        System.out.print("Enter Name of Movie: \n");
        String nameOfMovie = getString();
        if (movieSection.performReturn(nameOfMovie, user)) {
            System.out.println("Thank you for returning the movie.\n");
        }
        else {
            System.out.println("That is not valid movie to return.\n");
        }
        menuView.run(user);
    }
}
