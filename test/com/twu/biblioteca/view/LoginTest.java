package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Dispatcher;
import com.twu.biblioteca.helper.Constants;
import com.twu.biblioteca.controller.Session;
import com.twu.biblioteca.helper.Input;
import com.twu.biblioteca.model.User;
import org.junit.Test;
import org.mockito.Mockito;


public class LoginTest {

    @Test
    public void shouldBeAbleToLogin() {
        Session session = Mockito.mock(Session.class);
        Input input = Mockito.mock(Input.class);
        Dispatcher dispatcher = Mockito.mock(Dispatcher.class);
        User user = new User("123-1234", "12345", Constants.ADMIN);
        Login login = new Login(session, input, dispatcher);

        Mockito.when(session.login("123-1234", "12345")).thenReturn(user);
        Mockito.when(input.getString()).thenReturn("123-1234");
        Mockito.when(input.getPassword()).thenReturn("12345");

        login.performLogin();

        Mockito.verify(dispatcher).start(Constants.MENU_RUN, user);
    }
}
