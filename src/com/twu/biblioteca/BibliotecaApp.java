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
                view.displayListOfAvailableBooks();
                break;
            case 2:
                view.showStatusOfCheckOutBook();
                break;
            case 3:
                view.showReturnBookStatus();
                break;
            case 4:
                view.displayListOfAvailableMovies();
                break;
            case 5:
                view.showStatusOfCheckOutMovie();
                break;
            case 6:
                view.showReturnMovieStatus();
                break;
            case 7:
                view.displayListOfCheckedOutBooks();
                break;
            case 8:
                view.displayListOfCheckedOutMovies();
                break;
            case 0:
                System.exit(0);
            default:
                view.displayErrorMessage();
                break;
        }
    }
}
