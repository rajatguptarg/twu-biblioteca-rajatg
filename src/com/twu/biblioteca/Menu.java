package com.twu.biblioteca;


public class Menu {
    private String optionsList;
    private String welcomeMessage;

    public Menu() {
        this.optionsList = "";
        this.welcomeMessage = "HELLO..!! WELCOME TO BIBLIOTECA..!!";
    }

    public String returnWelcomeMessage() {
        return welcomeMessage;
    }

    public String returnTheOptionAvailableToUser() {
        optionsList = "";
        optionsList += "\n** MAIN MENU **\n";
        optionsList += "================\n";
        optionsList += "1. List Books\n";
        optionsList += "2. Check-Out Book\n";
        optionsList += "3. Return Book\n";
        optionsList += "0. Quit\n";

        return optionsList;
    }
}
