package com.twu.biblioteca;


public class Main {
    public static void main(String[] args) {
        BookSection bookSection = new BookSection();
        MovieSection movieSection = new MovieSection();
        View view = new View(bookSection, movieSection);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view);

        bibliotecaApp.run();
    }
}
