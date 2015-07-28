package com.twu.biblioteca;


public class BibliotecaApp {
    private Menu menu;

    public BibliotecaApp(Menu menu) {
        this.menu = menu;
    }

    public boolean run() {
        menu.displayWelcomeMessage();
        return true;
    }

}
