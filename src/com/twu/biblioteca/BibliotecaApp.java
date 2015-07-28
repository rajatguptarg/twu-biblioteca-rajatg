package com.twu.biblioteca;


public class BibliotecaApp {
    private View view;

    public BibliotecaApp(View view) {
        this.view = view;
    }

    public void run() {
        view.displayWelcomeMessage();
        view.displayAvailableOptionsToUser();

        while (true) {
            int option = view.chooseOption();
            switch (option) {
                case 1:
                    view.displayListOfBooks();
                    break;
                case 2:
                    System.exit(0);
                default:
                    view.displayErrorMessage();
            }
        }
    }
}
