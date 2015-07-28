package com.twu.biblioteca;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(menu);
        bibliotecaApp.run();
    }
}
