package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Dispatcher;
import com.twu.biblioteca.controller.Session;
import com.twu.biblioteca.helper.Constants;
import com.twu.biblioteca.helper.Input;
import com.twu.biblioteca.model.User;


public class Login {
    private Session session;
    private User user;
    private Input input;
    private Dispatcher dispatcher;

    public Login(Session session, Input input, Dispatcher dispatcher) {
        this.session = session;
        this.input = input;
        this.dispatcher = dispatcher;
        this.user = null;
    }

    private boolean loginStatus() {
        if (user != null)
            return (user.isAdminUser() || user.isNormalUser());
        return false;
    }

    private boolean initiateLogin() {
        System.out.print("\nEnter Library Number: \n");
        String libraryNumber = input.getString();
        String password = input.getPassword();
        user = session.login(libraryNumber, password);
        return loginStatus();
    }

    public void performLogin() {
        if (initiateLogin()) {
            dispatcher.start(Constants.MENU_RUN, user);
        }
        else {
            System.out.print("Invalid Login Credentials.");
            dispatcher.start(Constants.WELCOME_RUN, user);
        }
    }
}
