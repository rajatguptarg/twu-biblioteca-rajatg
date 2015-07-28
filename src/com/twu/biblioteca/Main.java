package com.twu.biblioteca;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Library library = new Library();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(menu, library);

        bibliotecaApp.run();
    }
}
