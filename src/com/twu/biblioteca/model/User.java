package com.twu.biblioteca.model;

import com.twu.biblioteca.helper.Constants;


public class User {
    private String libraryNumber;
    private String password;
    private String role;

    public User(String libraryNumber, String password, String role) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.role = role;
    }

    public boolean isAdminUser() {
        return (role.equals(Constants.ADMIN));
    }

    public boolean isNormalUser() {
        return (role.equals(Constants.USER));
    }

    public boolean authenticate(String libraryNumber, String password) {
        return this.libraryNumber.equals(libraryNumber) && this.password.equals(password);
    }
}
