package com.twu.biblioteca.view;

import java.util.Scanner;


public class Welcome {
    private String welcomeTitle;
    private String availableOptions;
    private Login login;

    public void initiate(Login login) {
        this.welcomeTitle = "HELLO..!! WELCOME TO BIBLIOTECA..!!\n\n";
        this.availableOptions = "";
        this.login = login;
    }

    private String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int chooseOption() {
        System.out.print("Choose Option: \n");
        try {
            return Integer.parseInt(getString());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    private String availableChoices() {
        availableOptions = "";
        availableOptions += "1. Login\n";
        availableOptions += "2. Quit\n";
        return availableOptions;
    }

    private void execute(int option) {
        switch (option) {
            case 1:
                login.run();
                break;
            case 2:
                System.exit(0);
        }
    }

    public void run() {
        System.out.print(welcomeTitle);
        System.out.print(availableChoices());
        System.out.print("\nEnter Choice: \n");
        int option = chooseOption();
        execute(option);
    }
}
