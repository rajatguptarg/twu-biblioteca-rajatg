package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class View {
    private Menu menu;
    private Library library;

    public View() {
        this.menu = new Menu();
        this.library = new Library();
        library.addBookToLibrary();
    }

    public void displayListOfBooks() {
        String header = String.format("%-20s %-20s %-6s", "BOOK", "AUTHOR", "YEAR");
        System.out.println("\n"+header);
        System.out.println("==================================================");
        List<String> books;
        books = library.listAllBooks();
        for(String book : books) {
            System.out.println(book);
        }
    }

    public void displayWelcomeMessage() {
        System.out.println(menu.returnWelcomeMessage());
    }

    public void displayAvailableOptionsToUser() {
        System.out.println(menu.returnTheOptionAvailableToUser());
    }

    public int chooseOption() {
        Scanner scanner = new Scanner(System.in);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void displayErrorMessage() {
        System.out.println("Select a valid option!");
    }

    public void showStatusOfCheckOut() {
        String nameOfBook = getString();
        if (library.performCheckOut(nameOfBook)) {
            System.out.println("Thank you! Enjoy the book.");
        }
        else {
            System.out.println("That book is not available.");
        }
    }

    private String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void showReturnBookStatus() {
        String nameOfBook = getString();
        if (library.performReturnBook(nameOfBook)) {
            System.out.println("Thank you for returning the book.");
        }
        else {
            System.out.println("That is not a valid book to return.");
        }
    }
}
