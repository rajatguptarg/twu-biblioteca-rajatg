package com.twu.biblioteca.view;

import com.twu.biblioteca.Constants;
import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.model.User;
import org.junit.Test;
import org.mockito.Mockito;

public class ListAllTest {

    @Test
    public void shouldBeAbleToDisplayListOfAvailableBooks() {
        ListAll listAll = new ListAll();
        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = Mockito.mock(Library.class);
        Menu menu = Mockito.mock(Menu.class);
        User user = new User("123-1234", "12345", Constants.ADMIN);

        listAll.initiate(bookSection, movieSection, menu);
        listAll.availableBooks(user);

        Mockito.verify(bookSection).listAvailableItems();
    }

    @Test
    public void shouldBeAbleToDisplayListOfAvailableMovies() {
        ListAll listAll = new ListAll();
        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = Mockito.mock(Library.class);
        Menu menu = Mockito.mock(Menu.class);
        User user = new User("123-1234", "12345", Constants.ADMIN);

        listAll.initiate(bookSection, movieSection, menu);
        listAll.availableMovies(user);

        Mockito.verify(movieSection).listAvailableItems();
    }

    @Test
    public void shouldBeAbleToDisplayListOfCheckedOutBooks() {
        ListAll listAll = new ListAll();
        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = Mockito.mock(Library.class);
        Menu menu = Mockito.mock(Menu.class);
        User user = new User("123-1234", "12345", Constants.ADMIN);

        listAll.initiate(bookSection, movieSection, menu);
        listAll.checkedOutBooks(user);

        Mockito.verify(bookSection).listCheckedOutItems();
    }

    @Test
    public void shouldBeAbleToDisplayListOfCheckedOutMovies() {
        ListAll listAll = new ListAll();
        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = Mockito.mock(Library.class);
        Menu menu = Mockito.mock(Menu.class);
        User user = new User("123-1234", "12345", Constants.ADMIN);

        listAll.initiate(bookSection, movieSection, menu);
        listAll.checkedOutMovies(user);

        Mockito.verify(movieSection).listCheckedOutItems();
    }
}
