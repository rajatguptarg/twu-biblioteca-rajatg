package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BibliotecaAppTest {

    @Test
    public void bibliotecaAppShouldAbleToRun() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        assertEquals(true, bibliotecaApp.run());
    }

}