package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Session;
import com.twu.biblioteca.model.User;
import java.io.Console;
import java.util.Scanner;


public class Login {
    private Session session;
    private User user;
    private MenuView menu;
    private Welcome welcome;

    public void initiate(Session session, MenuView menu, Welcome welcome) {
        this.session = session;
        this.menu = menu;
        this.welcome = welcome;
        this.user = null;
    }

    private String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private String readPassword() {
        Console console = System.console();
        if (console == null) {
            System.out.println("Couldn't get Console instance");
            System.exit(0);
        }
        char passwordArray[] = console.readPassword("Enter your Password: ");
        return new String(passwordArray);
    }

    private boolean loginStatus() {
        if (user != null)
            return (user.isAdminUser() || user.isNormalUser());
        return false;
    }

    private boolean initiateLogin() {
        System.out.print("\nEnter Library Number: \n");
        String libraryNumber = getString();
        String password = readPassword();
        user = session.login(libraryNumber, password);
        return loginStatus();
    }

    public void run() {
        if (initiateLogin()) {
            menu.run(user);
        }
        else {
            System.out.print("Invalid Login Credentials.");
            welcome.run();
        }
    }
}
