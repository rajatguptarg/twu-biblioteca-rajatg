package com.twu.biblioteca;


public class Menu {
    private String optionsList;

    public Menu() {
        this.optionsList = "";
    }

    public String returnWelcomeMessage() {
        return "HELLO..!! WELCOME TO BIBLIOTECA..!!\n";
    }

    public String returnTheOptionAvailableToUser() {
        optionsList = "";
        optionsList += "** MAIN MENU **\n";
        optionsList += "================\n";
        optionsList += "1. List Books\n";
        optionsList += "0. Quit\n";

        return optionsList;
    }
}
