package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;


public class ViewTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;

    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldShowWelcomeMessage() {
        View view = new View();
        view.displayWelcomeMessage();
        assertEquals("HELLO..!! WELCOME TO BIBLIOTECA..!!\n", outContent.toString());
    }

    @Test
    public void userShouldBeAbleToGiveOption() {
        View view = Mockito.mock(View.class);

        Mockito.when(view.chooseOption()).thenReturn(1);

        assertEquals(1, view.chooseOption());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(original);
    }

}
