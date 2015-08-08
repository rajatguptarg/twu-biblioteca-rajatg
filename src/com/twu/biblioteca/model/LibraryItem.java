package com.twu.biblioteca.model;


public interface LibraryItem {

    boolean hasTitle(String title);

    String toString();

    void issueTo(User user);

    User getCurrentHolder();

    boolean resetOwnership(User user);
}
