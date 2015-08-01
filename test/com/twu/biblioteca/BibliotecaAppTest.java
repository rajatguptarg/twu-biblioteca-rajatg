package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;


public class BibliotecaAppTest {

    @Test
    public void applicationShouldDisplayListOfBooks() {
        View view = Mockito.mock(View.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view);

        bibliotecaApp.executeOperation(1);

        Mockito.verify(view).displayListOfBooks();
    }

    @Test
    public void applicationShouldBeAbleToPerformCheckoutBook() {
        View view = Mockito.mock(View.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view);

        bibliotecaApp.executeOperation(2);

        Mockito.verify(view).showStatusOfCheckOutBook();
    }

    @Test
    public void applicationShouldBeAbleToPerformReturnBook() {
        View view = Mockito.mock(View.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view);

        bibliotecaApp.executeOperation(3);

        Mockito.verify(view).showReturnBookStatus();
    }

    @Test
    public void applicationShouldBeAbleToListAllMovies() {
        View view = Mockito.mock(View.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view);

        bibliotecaApp.executeOperation(4);

        Mockito.verify(view).displayListOfMovies();
    }

    @Test
    public void applicationShouldBeAbleToPerformCheckoutMovies() {
        View view = Mockito.mock(View.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view);

        bibliotecaApp.executeOperation(5);

        Mockito.verify(view).showStatusOfCheckOutMovie();
    }

    @Test
    public void applicationShouldBeAbleToDisplayErrorMessage() {
        View view = Mockito.mock(View.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view);

        bibliotecaApp.executeOperation(9999);

        Mockito.verify(view).displayErrorMessage();
    }
}
