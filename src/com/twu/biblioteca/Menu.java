package com.twu.biblioteca;


public class Menu {
    private String optionsList;

    public Menu() {
        this.optionsList = "";
    }

    public String returnWelcomeMessage() {
        return "HELLO..!! WELCOME TO BIBLIOTECA..!!";
    }

    public String returnTheOptionAvailableToUser() {
        optionsList += "1. List Books\n";
        optionsList += "2. Quit\n";
        return optionsList;
    }
}
