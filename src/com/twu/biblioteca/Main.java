package com.twu.biblioteca;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Library library = new Library();
        View view = new View();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(menu, library, view);

        bibliotecaApp.run();
    }
}
