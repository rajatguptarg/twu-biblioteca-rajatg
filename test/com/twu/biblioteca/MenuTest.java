package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MenuTest {

    @Test
    public void menuShouldReturnTheDisplayMessage() {
        Menu menu = new Menu();
        String expectedWelcomeMessage = "HELLO..!! WELCOME TO BIBLIOTECA..!!";

        assertEquals(expectedWelcomeMessage, menu.returnWelcomeMessage());
    }

    @Test
    public void menuShouldReturnListOfOperations() {
        Menu menu = new Menu();
        String expectedOptions =
                "\n** MAIN MENU **\n" +
                "================\n" +
                "1. List Books\n" +
                "2. Check-Out Book\n" +
                "3. Return Book\n" +
                "4. List Movies\n" +
                "5. Check-Out Movie\n" +
                "6. Return Movie\n" +
                "7. Display Checked Out Books\n" +
                "8. Display Checked Out Movies\n" +
                "0. Quit\n";

        assertEquals(expectedOptions, menu.toString());
    }
}
