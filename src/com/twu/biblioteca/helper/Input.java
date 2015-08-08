package com.twu.biblioteca.helper;

import java.io.Console;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public int getNumber() {
        try {
            return Integer.parseInt(getString());
        } catch (NumberFormatException e) {
            return 9999;
        }
    }

    public String getPassword() {
        Console console = System.console();
        if (console == null) {
            System.out.println("Couldn't get Console instance");
            System.exit(0);
        }
        char passwordArray[] = console.readPassword("Enter your Password: ");
        return new String(passwordArray);
    }
}
