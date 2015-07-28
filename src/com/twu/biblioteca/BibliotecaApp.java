package com.twu.biblioteca;


public class BibliotecaApp {
    private Menu menu;
    private Library library;

    public BibliotecaApp(Menu menu, Library library) {
        this.menu = menu;
        this.library = library;
    }

    public void run() {
        menu.displayWelcomeMessage();
        menu.displayOptions();
        while (true) {
            int option = menu.chooseOption();
            switch (option) {
                case 1:
                    library.listAllBooks();
                    break;
                case 2:
                    System.exit(0);
                default:
                    menu.displayErrorMessage();
            }
        }
    }
}
