package com.twu.biblioteca;

import com.twu.biblioteca.view.Welcome;
import org.junit.Test;
import org.mockito.Mockito;


public class BibliotecaAppTest {

    @Test
    public void applicationShouldDisplayListOfBooks() {
        Welcome welcome = Mockito.mock(Welcome.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(welcome);

        bibliotecaApp.run();

        Mockito.verify(welcome).run();
    }
}
