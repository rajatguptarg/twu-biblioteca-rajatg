package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class UserTest {

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

    @Test
    public void shouldBeAbleToAuthenticate() {
        User user = new User("123-1234", "12345", "admin");

        assertEquals(true, user.authenticate("123-1234", "12345"));
    }

    @Test
    public void shouldBeAbleToRejectFalseLoginAttempt() {
        User user = new User("123-1234", "12345", "admin");

        assertEquals(false, user.authenticate("123-1234", "1245"));
    }
}
