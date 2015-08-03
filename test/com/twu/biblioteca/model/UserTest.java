package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class UserTest {

    @Test
    public void shouldBeAbleToTellLibraryNumber() {
        User user = new User("123-1234", "12345", "user");

        assertEquals("123-1234", user.getLibraryNumber());
    }

    @Test
    public void shouldBeAbleToTellPassword() {
        User user = new User("123-1234", "12345", "user");

        assertEquals("12345", user.getPassword());
    }

    @Test
    public void shouldBeAbleToTellItsRoleIfItIsNormalUser() {
        User user = new User("123-1234", "12345", "user");

        assertEquals("user", user.getRole());
    }

    @Test
    public void shouldBeAbleToTellItsRoleIfItIsAdmin() {
        User user = new User("123-1234", "12345", "admin");

        assertEquals("admin", user.getRole());
    }
}
