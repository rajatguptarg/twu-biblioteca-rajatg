package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.model.User;

public class ListAll {
    private Library bookSection;
    private Library movieSection;
    private MenuView menuView;

    public void initiate(Library bookSection, Library movieSection, MenuView menuView) {
        this.bookSection = bookSection;
        this.movieSection = movieSection;
        this.menuView = menuView;
    }

    public void availableBooks(User user) {
        if (user.isAdminUser() || user.isNormalUser()) {
            System.out.print(bookSection.listAvailableItems());
        }
        menuView.run(user);
    }

    public void availableMovies(User user) {
        if (user.isAdminUser() || user.isNormalUser()) {
            System.out.print(movieSection.listAvailableItems());
        }
        menuView.run(user);
    }

    public void checkedOutBooks(User user) {
        if (user.isAdminUser()) {
            System.out.print(bookSection.listCheckedOutItems());
        }
        menuView.run(user);
    }

    public void checkedOutMovies(User user) {
        if (user.isAdminUser()) {
            System.out.print(movieSection.listCheckedOutItems());
        }
        menuView.run(user);
    }
}
