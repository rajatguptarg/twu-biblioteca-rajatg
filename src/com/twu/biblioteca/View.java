package com.twu.biblioteca;

public class View {
    private Menu menu;

    public View() {
        this.menu = new Menu();
    }

    public void displayWelcomeMessage() {
        System.out.println(menu.returnWelcomeMessage());
    }
}
