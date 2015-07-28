package com.twu.biblioteca;


public class Main {
    public static void main(String[] args) {
        View view = new View();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view);

        bibliotecaApp.run();
    }
}
