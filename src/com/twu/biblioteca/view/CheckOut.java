package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.model.User;

import java.util.Scanner;

public class CheckOut {
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

    public void performCheckOutBook(User user) {
        System.out.print("Enter Name of Book: \n");
        String nameOfBook = getString();
        if (bookSection.performCheckOut(nameOfBook, user)) {
            System.out.println("Thank you! Enjoy the execute.\n");
        }
        else {
            System.out.println("That execute is not available.\n");
        }
        menuView.run(user);
    }

    public void performCheckOutMovie(User user) {
        System.out.print("Enter Name of Movie: \n");
        String nameOfMovie = getString();
        if (movieSection.performCheckOut(nameOfMovie, user)) {
            System.out.println("Thank you! Enjoy the movie.\n");
        }
        else {
            System.out.println("That movie is not available.\n");
        }
        menuView.run(user);
    }
}
