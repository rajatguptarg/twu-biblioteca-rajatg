package com.twu.biblioteca.view;


import com.twu.biblioteca.controller.Dispatcher;
import com.twu.biblioteca.helper.Constants;
import com.twu.biblioteca.helper.Input;


public class Welcome {
    private String welcomeTitle;
    private String availableOptions;
    private Login login;
    private Input input;
    private Dispatcher dispatcher;

    public Welcome(Login login, Input input, Dispatcher dispatcher) {
        this.welcomeTitle = "HELLO..!! WELCOME TO BIBLIOTECA..!!\n\n";
        this.availableOptions = "";
        this.login = login;
        this.input = input;
        this.dispatcher = dispatcher;
    }

    private String availableChoices() {
        availableOptions = "";
        availableOptions += "1. Login\n";
        availableOptions += "2. Quit\n";
        return availableOptions;
    }

    private void execute(int option) {
        System.out.println(option);
        switch (option) {
            case 1:
                login.performLogin();
                break;
            case 2:
                System.exit(0);
            default:
                System.out.print("Invalid Choice.\n");
                dispatcher.start(Constants.WELCOME_RUN, null);

        }
    }

    public void run() {
        System.out.print(welcomeTitle);
        System.out.print(availableChoices());
        boolean bool = true;
        System.out.print("\nEnter Choice: \n");
        int option = input.getNumber();
        execute(option);
    }
}
