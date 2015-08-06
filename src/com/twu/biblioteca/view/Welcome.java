package com.twu.biblioteca.view;


import com.twu.biblioteca.helper.Input;

public class Welcome {
    private String welcomeTitle;
    private String availableOptions;
    private Login login;
    private Input input;

    public void initiate(Login login, Input input) {
        this.welcomeTitle = "HELLO..!! WELCOME TO BIBLIOTECA..!!\n\n";
        this.availableOptions = "";
        this.login = login;
        this.input = input;
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
                login.performLogin();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.print("Invalid Choice.\n");
                run();
        }
    }

    public void run() {
        System.out.print(welcomeTitle);
        System.out.print(availableChoices());
        System.out.print("\nEnter Choice: \n");
        int option = input.getNumber();
        execute(option);
    }
}
