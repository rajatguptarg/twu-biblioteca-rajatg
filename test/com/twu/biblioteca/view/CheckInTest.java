package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Dispatcher;
import com.twu.biblioteca.helper.Constants;
import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.helper.Input;
import com.twu.biblioteca.model.User;
import org.junit.Test;
import org.mockito.Mockito;


public class CheckInTest {

    @Test
    public void shouldBeAbleToPerformReturnOfBook() {
        Dispatcher dispatcher = Mockito.mock(Dispatcher.class);
        Input input = Mockito.mock(Input.class);
        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = Mockito.mock(Library.class);
        Menu menu = Mockito.mock(Menu.class);
        CheckIn checkIn = new CheckIn(bookSection, movieSection, dispatcher, input);
        User user = new User("Name1", "email1", "12-12", "123-1234", "12345", Constants.ADMIN);

        Mockito.when(input.getString()).thenReturn("great rajat");
        checkIn.performCheckInBook(user);

        Mockito.verify(bookSection).performReturn("great rajat", user);
    }

    @Test
    public void shouldBeAbleToPerformReturnOfMovie() {
        Dispatcher dispatcher = Mockito.mock(Dispatcher.class);
        Input input = Mockito.mock(Input.class);
        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = Mockito.mock(Library.class);
        CheckIn checkIn = new CheckIn(bookSection, movieSection, dispatcher, input);
        User user = new User("Name1", "email1", "12-12", "123-1234", "12345", Constants.ADMIN);

        Mockito.when(input.getString()).thenReturn("xxx");
        checkIn.performCheckInMovie(user);

        Mockito.verify(movieSection).performReturn("xxx", user);
    }
}
