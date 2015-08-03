package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class UserTest {

    @Test
    public void shouldBeAbleToTellItsLibraryNumber() {
        User user = new User("123-1234", "12345");

        assertEquals("123-1234", user.getLibraryNumber());
    }
}
