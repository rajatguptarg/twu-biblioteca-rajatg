package com.twu.biblioteca;


public class BibliotecaApp {
    private Menu menu;
    private Library library;

    public BibliotecaApp(Menu menu, Library library) {
        this.menu = menu;
        this.library = library;
    }

    public boolean run() {
        menu.displayWelcomeMessage();
        library.listAllBooks();
        return true;
    }

}
