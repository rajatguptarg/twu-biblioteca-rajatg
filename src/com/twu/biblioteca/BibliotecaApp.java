package com.twu.biblioteca;


public class BibliotecaApp {
    private View view;

    public BibliotecaApp(View view) {
        this.view = view;
    }

    public void run() {
        view.displayWelcomeMessage();
        while (true) {
            view.displayAvailableOptionsToUser();
            System.out.print("Choose Option: ");
            int option = view.chooseOption();

            switch (option) {
                case 1:
                    view.displayListOfBooks();
                    break;
                case 0:
                    System.exit(0);
                default:
                    view.displayErrorMessage();
                    break;
            }

        }
    }
}
