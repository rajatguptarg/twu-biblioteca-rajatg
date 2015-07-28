package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;


public class MenuTest {

    @Test
    public void menuShouldDisplayTheWelcomeMessage() {
        Menu menu = Mockito.mock(Menu.class);

        menu.displayWelcomeMessage();

        Mockito.verify(menu).displayWelcomeMessage();

    }
}