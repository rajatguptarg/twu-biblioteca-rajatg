package com.twu.biblioteca;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        BookSection bookSection = new BookSection();
        MovieSection movieSection = new MovieSection();
        View view = new View(menu, bookSection, movieSection);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view);

        bibliotecaApp.run();
    }
}
