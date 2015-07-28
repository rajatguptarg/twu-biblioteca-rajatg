package com.twu.biblioteca;

import java.util.Scanner;


public class Menu {
    private int option;

    public Menu() {
        this.option = 0;
    }

    public String returnWelcomeMessage() {
        return "HELLO..!! WELCOME TO BIBLIOTECA..!!";
    }

    public void displayOptions() {
        System.out.println("1. List Books");
        System.out.println("2. Quit");
    }

    public int chooseOption() {
        Scanner scanner = new Scanner(System.in);
        option = Integer.parseInt(scanner.nextLine());
        return option;
    }

    public void displayErrorMessage() {
        System.out.println("Invalid Option!");
    }
}
