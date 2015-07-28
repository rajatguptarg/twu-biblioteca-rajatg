package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;


public class MenuTest {

    @Test
    public void shouldDisplayTheMainMenu() {
        Menu menu = new Menu();
        String expectedWelcomeMessage = "HELLO..!! WELCOME TO BIBLIOTECA..!!";

        assertEquals(expectedWelcomeMessage, menu.displayWelcomeMessage());
    }
}