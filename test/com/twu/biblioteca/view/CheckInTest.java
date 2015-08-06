package com.twu.biblioteca.view;

import com.twu.biblioteca.helper.Constants;
import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.helper.Input;
import com.twu.biblioteca.model.User;
import org.junit.Test;
import org.mockito.Mockito;


public class CheckInTest {

    @Test
    public void shouldBeAbleToPerformReturnOfBook() {
        CheckIn checkIn = new CheckIn();
        Input input = Mockito.mock(Input.class);
        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = Mockito.mock(Library.class);
        Menu menu = Mockito.mock(Menu.class);

        checkIn.initiate(bookSection, movieSection, menu, input);
        User user = new User("123-1234", "12345", Constants.ADMIN);

        Mockito.when(input.getString()).thenReturn("great rajat");
        checkIn.performCheckInBook(user);

        Mockito.verify(bookSection).performReturn("great rajat", user);
    }

    @Test
    public void shouldBeAbleToPerformReturnOfMovie() {
        CheckIn checkIn = new CheckIn();
        Input input = Mockito.mock(Input.class);
        Library bookSection = Mockito.mock(Library.class);
        Library movieSection = Mockito.mock(Library.class);
        Menu menu = Mockito.mock(Menu.class);

        checkIn.initiate(bookSection, movieSection, menu, input);
        User user = new User("123-1234", "12345", Constants.ADMIN);

        Mockito.when(input.getString()).thenReturn("xxx");
        checkIn.performCheckInMovie(user);

        Mockito.verify(movieSection).performReturn("xxx", user);
    }
}
