package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class AuthenticatorTest {

    @Test
    public void shouldBeAbleToAuthenticateLoginInformation() {
        User user = new User("123-1234", "12345", "admin");
        List<User> registeredUser = new ArrayList<User>();

        registeredUser.add(user);
        Authenticator authenticator = new Authenticator(registeredUser);

        assertNotEquals(null, authenticator.loginUser("123-1234", "12345"));
    }
}
