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
            int option = view.chooseOption();
            executeOperation(option);
        }
    }

    void executeOperation(int option) {
        switch (option) {
            case 1:
                view.displayListOfBooks();
                break;
            case 2:
                view.showStatusOfCheckOut();
                break;
            case 3:
                view.showReturnBookStatus();
                break;
            case 4:
                view.displayListOfMovies();
                break;
            case 0:
                System.exit(0);
            default:
                view.displayErrorMessage();
                break;
        }
    }
}
