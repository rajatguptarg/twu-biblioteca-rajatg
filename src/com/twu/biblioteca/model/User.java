package com.twu.biblioteca.model;


public class User {
    private String libraryNumber;
    private String password;
    private String role;

    public User(String libraryNumber, String password, String role) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public boolean authenticate(String libraryNumber, String password) {
        return this.libraryNumber.equals(libraryNumber) && this.password.equals(password);
    }
}
