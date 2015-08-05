package com.twu.biblioteca.model;

public interface LibraryItem {

    boolean hasTitle(String title);

    String toString();

    boolean issueTo(User user);
}
