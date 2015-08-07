package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.User;
import java.util.List;


public class Session {
    private List<User> registeredUser;

    public Session(List<User> registeredUser) {
        this.registeredUser = registeredUser;
    }

    public User login(String libraryNumber, String password) {
        for (User user : registeredUser) {
            if (user.authenticate(libraryNumber, password)) {
                return user;
            }
        }
        return null;
    }
}
