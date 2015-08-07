package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Dispatcher;
import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.helper.Constants;
import com.twu.biblioteca.helper.Input;
import com.twu.biblioteca.model.User;


public class CheckIn {
    private Library bookSection;
    private Library movieSection;
    private Dispatcher dispatcher;
    private Input input;

    public CheckIn(Library bookSection, Library movieSection, Dispatcher dispatcher, Input input) {
        this.bookSection = bookSection;
        this.movieSection = movieSection;
        this.dispatcher = dispatcher;
        this.input = input;
    }

    public void performCheckInBook(User user) {
        System.out.print("Enter Name of Book: \n");
        String nameOfBook = input.getString();
        if (bookSection.performReturn(nameOfBook, user)) {
            System.out.println("Thank you for returning the book.\n");
        }
        else {
            System.out.println("That is not a valid book to return.\n");
        }
        dispatcher.start(Constants.MENU_RUN, user);
    }

    public void performCheckInMovie(User user) {
        System.out.print("Enter Name of Movie: \n");
        String nameOfMovie = input.getString();
        if (movieSection.performReturn(nameOfMovie, user)) {
            System.out.println("Thank you for returning the movie.\n");
        }
        else {
            System.out.println("That is not valid movie to return.\n");
        }
        dispatcher.start(Constants.MENU_RUN, user);
    }
}
