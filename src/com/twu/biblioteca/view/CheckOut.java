package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.helper.Input;
import com.twu.biblioteca.model.User;


public class CheckOut {
    private Library bookSection;
    private Library movieSection;
    private Menu menu;
    private Input input;

    public void initiate(Library bookSection, Library movieSection, Menu menu, Input input) {
        this.bookSection = bookSection;
        this.movieSection = movieSection;
        this.menu = menu;
        this.input = input;
    }

    public void performCheckOutBook(User user) {
        System.out.print("Enter Name of Book: \n");
        String nameOfBook = input.getString();
        if (bookSection.performCheckOut(nameOfBook, user)) {
            System.out.println("Thank you! Enjoy the execute.\n");
        }
        else {
            System.out.println("That book is not available.\n");
        }
        menu.run(user);
    }

    public void performCheckOutMovie(User user) {
        System.out.print("Enter Name of Movie: \n");
        String nameOfMovie = input.getString();
        if (movieSection.performCheckOut(nameOfMovie, user)) {
            System.out.println("Thank you! Enjoy the movie.\n");
        }
        else {
            System.out.println("That movie is not available.\n");
        }
        menu.run(user);
    }
}
