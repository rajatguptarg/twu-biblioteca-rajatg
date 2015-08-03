package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.LibraryItem;
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

        assertEquals(1, library.listAvailableItems().size());
    }

    @Test
    public void shouldReturnListOfCheckedOutItems() {
        List<LibraryItem> availableItems = new ArrayList<LibraryItem>();
        List<LibraryItem> checkedOutItem = new ArrayList<LibraryItem>();
        availableItems.add(new Book("My Book", "Rajat", "2012"));
        Library library = new Library(availableItems, checkedOutItem);

        library.performCheckOut("my book");

        assertEquals(1, library.listCheckedOutItems().size());
    }

    @Test
    public void shouldBeAbleToPerformCheckOut() {
        List<LibraryItem> availableItems = new ArrayList<LibraryItem>();
        List<LibraryItem> checkedOutItem = new ArrayList<LibraryItem>();
        availableItems.add(new Book("My Book", "Rajat", "2012"));
        Library library = new Library(availableItems, checkedOutItem);

        assertEquals(true, library.performCheckOut("my book"));
    }

    @Test
    public  void shouldBeAbleToReturnBook() {
        List<LibraryItem> availableItems = new ArrayList<LibraryItem>();
        List<LibraryItem> checkedOutItem = new ArrayList<LibraryItem>();
        availableItems.add(new Book("My Book", "Rajat", "2012"));
        Library library = new Library(availableItems, checkedOutItem);

        library.performCheckOut("my book");

        assertEquals(true, library.performReturn("my book"));
    }

    @Test
    public  void shouldBeAbleToNotReturnBookIfNotCheckedOut() {
        List<LibraryItem> availableItems = new ArrayList<LibraryItem>();
        List<LibraryItem> checkedOutItem = new ArrayList<LibraryItem>();
        availableItems.add(new Book("My Book", "Rajat", "2012"));
        Library library = new Library(availableItems, checkedOutItem);

        assertEquals(false, library.performReturn("my book"));
    }
}
