package com.twu.biblioteca;


public class BibliotecaApp {
    private Menu menu;
    private Library library;
    private View view;

    public BibliotecaApp(Menu menu, Library library, View view) {
        this.menu = menu;
        this.library = library;
        this.view = view;
    }

    public void run() {
        view.displayWelcomeMessage();
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
