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
        return Integer.parseInt(scanner.nextLine());
    }

    public void displayErrorMessage() {
        System.out.println("Invalid Option!");
    }
}
