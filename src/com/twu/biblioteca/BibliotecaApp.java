package com.twu.biblioteca;

import com.twu.biblioteca.view.Welcome;


public class BibliotecaApp {
    private Welcome welcome;

    public BibliotecaApp(Welcome welcome) {
        this.welcome = welcome;
    }

    public void run() {
        welcome.run();
    }
}
