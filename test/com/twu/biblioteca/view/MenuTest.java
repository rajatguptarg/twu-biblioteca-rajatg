package com.twu.biblioteca.view;

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
    public void menuShouldReturnListOfOperationsToUser() {
        Menu menu = new Menu();
        String expectedOptions =
                "\n** MAIN MENU **\n" +
                "================\n" +
                "0. Quit\n" +
                "1. List Books\n" +
                "2. Check-Out Book\n" +
                "3. CheckIn Book\n" +
                "4. List Movies\n" +
                "5. Check-Out Movie\n" +
                "6. CheckIn Movie\n";

        assertEquals(expectedOptions, menu.availableOptionsToUser());
    }

    @Test
    public void menuShouldReturnListOfOperationsToAdmin() {
        Menu menu = new Menu();
        String expectedOptions =
                "\n** MAIN MENU **\n" +
                "================\n" +
                "0. Quit\n" +
                "1. List Books\n" +
                "2. Check-Out Book\n" +
                "3. CheckIn Book\n" +
                "4. List Movies\n" +
                "5. Check-Out Movie\n" +
                "6. CheckIn Movie\n" +
                "7. Display Checked Out Books\n" +
                "8. Display Checked Out Movies\n";

        assertEquals(expectedOptions, menu.availableOptionsToAdmin());
    }
}
