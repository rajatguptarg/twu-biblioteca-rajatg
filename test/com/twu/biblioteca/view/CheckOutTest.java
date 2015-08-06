package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Dispatcher;
import com.twu.biblioteca.helper.Constants;
import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.helper.Input;
import com.twu.biblioteca.model.User;
import org.junit.Test;
import org.mockito.Mockito;


public class CheckOutTest {

    @Test
    public void shouldBeAbleToCheckOutBook() {
        Input input = Mockito.mock(Input.class);
        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = Mockito.mock(Library.class);
        Dispatcher dispatcher = Mockito.mock(Dispatcher.class);
        User user = new User("123-1234", "12345", Constants.ADMIN);
        CheckOut checkOut = new CheckOut(bookSection, movieSection, dispatcher, input);


        Mockito.when(input.getString()).thenReturn("great rajat");
        checkOut.performCheckOutBook(user);

        Mockito.verify(bookSection).performCheckOut("great rajat", user);
    }

    @Test
    public void shouldBeAbleToCheckOutMovie() {
        Input input = Mockito.mock(Input.class);
        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = Mockito.mock(Library.class);
        Dispatcher dispatcher = Mockito.mock(Dispatcher.class);
        User user = new User("123-1234", "12345", Constants.ADMIN);
        CheckOut checkOut = new CheckOut(bookSection, movieSection, dispatcher, input);

        Mockito.when(input.getString()).thenReturn("xxx");
        checkOut.performCheckOutMovie(user);

        Mockito.verify(movieSection).performCheckOut("xxx", user);
    }

}
