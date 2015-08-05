package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class SessionTest {

    @Test
    public void shouldBeAbleToAuthenticateLoginInformation() {
        User user = new User("123-1234", "12345", "admin");
        List<User> registeredUser = new ArrayList<User>();

        registeredUser.add(user);
        Session session = new Session(registeredUser);

        assertNotEquals(null, session.login("123-1234", "12345"));
    }
}
