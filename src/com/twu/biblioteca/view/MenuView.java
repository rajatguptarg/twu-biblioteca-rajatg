package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.Dispatcher;
import com.twu.biblioteca.model.User;

import java.util.Scanner;

public class MenuView{
    private String optionsList;
    private Dispatcher dispatcher;

    public void initiate(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;

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
            return (userChoice > -1 && userChoice < 8);
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
        System.out.print("\nEnter your choice: ");
        int userChoice = chooseOption();
        if (validate(userChoice, user)) {
            dispatcher.start(userChoice, user);
        }
        else {
            System.out.print("\nInvalid Choice.");
            run(user);
        }
    }
}
