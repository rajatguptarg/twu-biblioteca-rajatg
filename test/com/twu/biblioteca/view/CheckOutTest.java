package com.twu.biblioteca.view;

import com.twu.biblioteca.Constants;
import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.model.User;
import org.junit.Test;
import org.mockito.Mockito;

public class CheckOutTest {

    @Test
    public void shouldBeAbleToCheckOutBook() {
        CheckOut checkOut = new CheckOut();
        Input input = Mockito.mock(Input.class);
        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = Mockito.mock(Library.class);
        Menu menu = Mockito.mock(Menu.class);
        User user = new User("123-1234", "12345", Constants.ADMIN);

        Mockito.when(input.getString()).thenReturn("great rajat");
        checkOut.initiate(bookSection, movieSection, menu, input);
        checkOut.performCheckOutBook(user);

        Mockito.verify(bookSection).performCheckOut("great rajat", user);
    }

    @Test
    public void shouldBeAbleToCheckOutMovie() {
        CheckOut checkOut = new CheckOut();
        Input input = Mockito.mock(Input.class);
        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = Mockito.mock(Library.class);
        Menu menu = Mockito.mock(Menu.class);
        User user = new User("123-1234", "12345", Constants.ADMIN);

        Mockito.when(input.getString()).thenReturn("xxx");
        checkOut.initiate(bookSection, movieSection, menu, input);
        checkOut.performCheckOutMovie(user);

        Mockito.verify(movieSection).performCheckOut("xxx", user);
    }

}
