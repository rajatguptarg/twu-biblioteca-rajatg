package com.twu.biblioteca.model;

import com.twu.biblioteca.helper.Constants;


public class User {
    private String name;
    private String email;
    private String mobile;
    private String libraryNumber;
    private String password;
    private String role;

    public User(String name, String email, String mobile,String libraryNumber, String password, String role) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.role = role;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
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

    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20s %-12s\n", libraryNumber, name, email, mobile);
    }
}
