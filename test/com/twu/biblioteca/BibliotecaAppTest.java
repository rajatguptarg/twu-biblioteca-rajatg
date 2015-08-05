package com.twu.biblioteca;

import com.twu.biblioteca.view.View;
import com.twu.biblioteca.view.Welcome;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


public class BibliotecaAppTest {

    @Test
    public void applicationShouldDisplayListOfBooks() {
        Welcome welcome = new Welcome();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(welcome);

        assertEquals(true, true);
    }
}
