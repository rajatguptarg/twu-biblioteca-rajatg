package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Dispatcher;
import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.helper.Constants;
import com.twu.biblioteca.helper.Input;
import com.twu.biblioteca.model.User;


public class CheckOut {
    private Library bookSection;
    private Library movieSection;
    private Dispatcher dispatcher;
    private Input input;

    public CheckOut(Library bookSection, Library movieSection, Dispatcher dispatcher, Input input) {
        this.bookSection = bookSection;
        this.movieSection = movieSection;
        this.input = input;
        this.dispatcher = dispatcher;
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
        dispatcher.start(Constants.MENU_RUN, user);
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
        dispatcher.start(Constants.MENU_RUN, user);
    }
}
