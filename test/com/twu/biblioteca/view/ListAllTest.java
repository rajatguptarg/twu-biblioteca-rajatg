package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Dispatcher;
import com.twu.biblioteca.helper.Constants;
import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.model.User;
import org.junit.Test;
import org.mockito.Mockito;


public class ListAllTest {

    @Test
    public void shouldBeAbleToDisplayListOfAvailableBooks() {
        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = Mockito.mock(Library.class);
        Dispatcher dispatcher = Mockito.mock(Dispatcher.class);
        ListAll listAll = new ListAll(bookSection, movieSection, dispatcher);
        User user = new User("123-1234", "12345", Constants.ADMIN);

        listAll.availableBooks(user);

        Mockito.verify(bookSection).listAvailableItems();
    }

    @Test
    public void shouldBeAbleToDisplayListOfAvailableMovies() {
        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = Mockito.mock(Library.class);
        Dispatcher dispatcher = Mockito.mock(Dispatcher.class);
        ListAll listAll = new ListAll(bookSection, movieSection, dispatcher);
        User user = new User("123-1234", "12345", Constants.ADMIN);

        listAll.availableMovies(user);

        Mockito.verify(movieSection).listAvailableItems();
    }

    @Test
    public void shouldBeAbleToDisplayListOfCheckedOutBooks() {
        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = Mockito.mock(Library.class);
        Dispatcher dispatcher = Mockito.mock(Dispatcher.class);
        ListAll listAll = new ListAll(bookSection, movieSection, dispatcher);
        User user = new User("123-1234", "12345", Constants.ADMIN);

        listAll.checkedOutBooks(user);

        Mockito.verify(bookSection).listCheckedOutItems();
    }

    @Test
    public void shouldBeAbleToDisplayListOfCheckedOutMovies() {
        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = Mockito.mock(Library.class);
        Dispatcher dispatcher = Mockito.mock(Dispatcher.class);
        ListAll listAll = new ListAll(bookSection, movieSection, dispatcher);
        User user = new User("123-1234", "12345", Constants.ADMIN);

        listAll.checkedOutMovies(user);

        Mockito.verify(movieSection).listCheckedOutItems();
    }
}
