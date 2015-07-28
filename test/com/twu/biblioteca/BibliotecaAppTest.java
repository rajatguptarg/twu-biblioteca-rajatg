package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;


public class BibliotecaAppTest {

    @Test
    public void bibliotecaAppShouldAbleToRun() {
        Menu menu = new Menu();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(menu);

        assertEquals(true, bibliotecaApp.run());
    }
}