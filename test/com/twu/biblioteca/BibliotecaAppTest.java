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
    public void applicationShouldBeAbleToPerformCheckout() {
        View view = Mockito.mock(View.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view);

        bibliotecaApp.executeOperation(2);

        Mockito.verify(view).showStatusOfCheckOut();
    }

    @Test
    public void applicationShouldBeAbleToPerformReturn() {
        View view = Mockito.mock(View.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view);

        bibliotecaApp.executeOperation(3);

        Mockito.verify(view).showReturnBookStatus();
    }

    @Test
    public void applicationShouldBeAbleToDisplayErrorMessage() {
        View view = Mockito.mock(View.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view);

        bibliotecaApp.executeOperation(9999);

        Mockito.verify(view).displayErrorMessage();
    }
}
