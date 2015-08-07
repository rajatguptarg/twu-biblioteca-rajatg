package com.twu.biblioteca.view;

import com.twu.biblioteca.helper.Constants;
import com.twu.biblioteca.controller.Dispatcher;
import com.twu.biblioteca.helper.Input;
import com.twu.biblioteca.model.User;
import org.junit.Test;
import org.mockito.Mockito;


public class MenuTest {

    @Test
    public void shouldBeAbleToDispatchUserChoice() {
        Dispatcher dispatcher  = Mockito.mock(Dispatcher.class);
        Input input = Mockito.mock(Input.class);
        Menu menu = new Menu(dispatcher, input);
        User user = new User("Name", "email", "12-12", "123-1234", "12345", Constants.ADMIN);

        Mockito.when(input.getNumber()).thenReturn(1);

        menu.run(user);

        Mockito.verify(dispatcher).start(1, user);

    }
}
