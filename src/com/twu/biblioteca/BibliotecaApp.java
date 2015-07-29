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
            executeOperation(option);
        }
    }

    void executeOperation(int option) {
        switch (option) {
            case 1:
                view.displayListOfBooks();
                break;
            case 2:
                System.out.print("Enter Name of Book: ");
                view.showStatusOfCheckOut();
                break;
            case 3:
                System.out.print("Enter Name of Book: ");
                view.showReturnBookStatus();
                break;
            case 0:
                System.exit(0);
            default:
                view.displayErrorMessage();
                break;
        }
    }
}
