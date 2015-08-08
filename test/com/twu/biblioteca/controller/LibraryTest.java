package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.LibraryItem;
import com.twu.biblioteca.model.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class LibraryTest {

    @Test
    public void shouldReturnListOfAvailableItems() {
        List<LibraryItem> availableItems = new ArrayList<LibraryItem>();
        List<LibraryItem> checkedOutItem = new ArrayList<LibraryItem>();
        availableItems.add(new Book("My Book", "Rajat", "2012"));
        Library library = new Library(availableItems, checkedOutItem);

        assertEquals(true, library.listAvailableItems().length() > 0);
    }

    @Test
    public void shouldReturnListOfCheckedOutItems() {
        List<LibraryItem> availableItems = new ArrayList<LibraryItem>();
        List<LibraryItem> checkedOutItem = new ArrayList<LibraryItem>();
        availableItems.add(new Book("My Book", "Rajat", "2012"));
        Library library = new Library(availableItems, checkedOutItem);
        User user = new User("Name1", "email1", "12-12", "123-1234", "12345", "user");

        library.performCheckOut("my book", user);

        assertEquals(true, library.listCheckedOutItems().length() > 0);
    }

    @Test
    public void shouldBeAbleToPerformCheckOut() {
        List<LibraryItem> availableItems = new ArrayList<LibraryItem>();
        List<LibraryItem> checkedOutItem = new ArrayList<LibraryItem>();
        availableItems.add(new Book("My Book", "Rajat", "2012"));
        Library library = new Library(availableItems, checkedOutItem);
        User user = new User("Name1", "email1", "12-12", "123-1234", "12345", "user");

        assertEquals(true, library.performCheckOut("my book", user));
    }

    @Test
    public  void shouldBeAbleToReturnBook() {
        List<LibraryItem> availableItems = new ArrayList<LibraryItem>();
        List<LibraryItem> checkedOutItem = new ArrayList<LibraryItem>();
        availableItems.add(new Book("My Book", "Rajat", "2012"));
        Library library = new Library(availableItems, checkedOutItem);
        User user = new User("Name1", "email1", "12-12", "123-1234", "12345", "user");

        library.performCheckOut("my book", user);

        assertEquals(true, library.performReturn("my book", user));
    }

    @Test
    public  void shouldBeAbleToNotReturnBookIfNotCheckedOut() {
        List<LibraryItem> availableItems = new ArrayList<LibraryItem>();
        List<LibraryItem> checkedOutItem = new ArrayList<LibraryItem>();
        availableItems.add(new Book("My Book", "Rajat", "2012"));
        Library library = new Library(availableItems, checkedOutItem);
        User user = new User("Name1", "email1", "12-12", "123-1234", "12345", "user");

        assertEquals(false, library.performReturn("my book", user));
    }

    @Test
    public void shouldBeAbleToReturnListOfUserHavingItems(){
        List<LibraryItem> availableItems = new ArrayList<LibraryItem>();
        List<LibraryItem> checkedOutItem = new ArrayList<LibraryItem>();
        availableItems.add(new Book("My Book", "Rajat", "2012"));
        checkedOutItem.add(new Book("Your Book", "John Doe", "2010"));
        Library library = new Library(availableItems, checkedOutItem);
        User user = new User("Name1", "email1", "12-12", "123-1234", "12345", "user");

        assertEquals(true, library.returnUsersHavingBooks().length() > 0);
    }
}
