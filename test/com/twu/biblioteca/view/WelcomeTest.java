package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Dispatcher;
import com.twu.biblioteca.helper.Input;
import org.junit.Test;
import org.mockito.Mockito;


public class WelcomeTest {

    @Test
    public void shouldBeAbleToGoToLoginView() {
        Input input = Mockito.mock(Input.class);
        Login login = Mockito.mock(Login.class);
        Dispatcher dispatcher = Mockito.mock(Dispatcher.class);
        Welcome welcome = new Welcome(login, input, dispatcher);

        Mockito.when(input.getNumber()).thenReturn(1);

        welcome.run();

        Mockito.verify(login).performLogin();
    }
}
