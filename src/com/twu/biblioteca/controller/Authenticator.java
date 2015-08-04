package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.User;

import java.util.List;

public class Authenticator {
    private List<User> registeredUser;

    public Authenticator(List<User> registeredUser) {
        this.registeredUser = registeredUser;
    }

    public User loginUser(String libraryNumber, String password) {
        for (User user : registeredUser) {
            if (user.authenticate(libraryNumber, password)) {
                return user;
            }
        }
        return null;
    }
}
