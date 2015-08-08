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
        return String.format("%-20s %-20s %-20s %-12s", libraryNumber, name, email, mobile);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (mobile != null ? !mobile.equals(user.mobile) : user.mobile != null) return false;
        if (libraryNumber != null ? !libraryNumber.equals(user.libraryNumber) : user.libraryNumber != null)
            return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        return !(role != null ? !role.equals(user.role) : user.role != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (libraryNumber != null ? libraryNumber.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
