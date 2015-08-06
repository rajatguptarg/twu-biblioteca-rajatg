package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Session;
import com.twu.biblioteca.helper.Input;
import com.twu.biblioteca.model.User;


public class Login {
    private Session session;
    private User user;
    private Menu menu;
    private Welcome welcome;
    private Input input;

    public void initiate(Session session, Menu menu, Welcome welcome, Input input) {
        this.session = session;
        this.menu = menu;
        this.welcome = welcome;
        this.input = input;
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
            menu.run(user);
        }
        else {
            System.out.print("Invalid Login Credentials.");
            welcome.run();
        }
    }
}
