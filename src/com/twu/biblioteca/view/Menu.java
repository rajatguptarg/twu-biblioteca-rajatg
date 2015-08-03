package com.twu.biblioteca.view;


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

    @Override
    public String toString() {
        optionsList = "";
        optionsList += "\n** MAIN MENU **\n";
        optionsList += "================\n";
        optionsList += "1. List Books\n";
        optionsList += "2. Check-Out Book\n";
        optionsList += "3. Return Book\n";
        optionsList += "4. List Movies\n";
        optionsList += "5. Check-Out Movie\n";
        optionsList += "6. Return Movie\n";
        optionsList += "7. Display Checked Out Books\n";
        optionsList += "8. Display Checked Out Movies\n";
        optionsList += "0. Quit\n";

        return optionsList;
    }
}
