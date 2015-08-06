package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Dispatcher;
import com.twu.biblioteca.helper.Input;
import com.twu.biblioteca.model.User;


public class Menu {
    private String optionsList;
    private Dispatcher dispatcher;
    private Input input;

    public void initiate(Dispatcher dispatcher, Input input) {
        this.input = input;
        this.dispatcher = dispatcher;

    }

    private String availableOptionsToUser() {
        optionsList = "";
        optionsList += "\n** MAIN MENU **\n";
        optionsList += "================\n";
        optionsList += "0. Log Out\n";
        optionsList += "1. List Books\n";
        optionsList += "2. Check-Out Book\n";
        optionsList += "3. CheckIn Book\n";
        optionsList += "4. List Movies\n";
        optionsList += "5. Check-Out Movie\n";
        optionsList += "6. CheckIn Movie\n";

        return optionsList;
    }

    private String availableOptionsToAdmin() {
        optionsList = "";
        optionsList += availableOptionsToUser();
        optionsList += "7. Display Checked Out Books\n";
        optionsList += "8. Display Checked Out Movies\n";

        return optionsList;
    }

    private void displayUserMenu() {
        System.out.print(availableOptionsToUser());
    }

    private void displayAdminMenu() {
        System.out.print(availableOptionsToAdmin());
    }

    private boolean validate(int userChoice, User user) {
        if (user.isNormalUser()) {
            return (userChoice > -1 && userChoice < 7);
        }
        else {
            return (userChoice > -1 && userChoice < 10);
        }
    }

    public void run(User user) {
        if (user.isAdminUser()) {
            displayAdminMenu();
        }
        else {
            displayUserMenu();
        }
        System.out.print("Enter your choice: \n");
        int userChoice = input.getNumber();
        if (validate(userChoice, user)) {
            dispatcher.start(userChoice, user);
        }
        else {
            System.out.print("Invalid Choice.\n");
            run(user);
        }
    }
}
