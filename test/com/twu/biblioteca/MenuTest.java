package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MenuTest {

    @Test
    public void menuShouldReturnTheDisplayMessage() {
        Menu menu = new Menu();
        String expectedWelcomeMessage = "HELLO..!! WELCOME TO BIBLIOTECA..!!\n";

        assertEquals(expectedWelcomeMessage, menu.returnWelcomeMessage());
    }
}
