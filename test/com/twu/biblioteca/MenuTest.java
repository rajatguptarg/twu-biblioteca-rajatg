package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;


public class MenuTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    public void shouldDisplayTheWelcomeMessage() {
        Menu menu = new Menu();
        String expectedWelcomeMessage = "HELLO..!! WELCOME TO BIBLIOTECA..!!\n";

        menu.displayWelcomeMessage();

        assertEquals(expectedWelcomeMessage, outContent.toString());
    }
}