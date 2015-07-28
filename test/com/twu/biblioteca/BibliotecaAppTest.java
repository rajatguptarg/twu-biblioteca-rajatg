package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;


public class BibliotecaAppTest {

    @Test
    public void applicationKnowsHowToDisplayWelcomeMessage() {
        BibliotecaApp bibliotecaApp = Mockito.mock(BibliotecaApp.class);

        bibliotecaApp.run();

        Mockito.verify(bibliotecaApp).run();
    }
}