package com.twu.biblioteca.view;

import com.twu.biblioteca.Constants;
import com.twu.biblioteca.controller.Session;
import com.twu.biblioteca.model.User;
import org.junit.Test;
import org.mockito.Mockito;

public class LoginTest {

    @Test
    public void shouldBeAbleToLogin() {
        Login login = new Login();
        Session session = Mockito.mock(Session.class);
        Menu menu = Mockito.mock(Menu.class);
        Welcome welcome = Mockito.mock(Welcome.class);
        Input input = Mockito.mock(Input.class);
        User user = new User("123-1234", "12345", Constants.ADMIN);

        login.initiate(session, menu, welcome, input);
        Mockito.when(session.login("123-1234", "12345")).thenReturn(user);
        Mockito.when(input.getString()).thenReturn("123-1234");
        Mockito.when(input.getPassword()).thenReturn("12345");

        login.performLogin();

        Mockito.verify(menu).run(user);
    }
}
