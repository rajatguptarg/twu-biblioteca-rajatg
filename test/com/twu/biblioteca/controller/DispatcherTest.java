package com.twu.biblioteca.controller;

import com.twu.biblioteca.view.*;
import org.junit.Test;
import org.mockito.Mockito;


public class DispatcherTest {

    @Test
    public void shouldBeAbleToReturnBackToHome() {
        Menu menu = Mockito.mock(Menu.class);
        ListAll listAll = Mockito.mock(ListAll.class);
        CheckOut checkOut = Mockito.mock(CheckOut.class);
        CheckIn checkIn = Mockito.mock(CheckIn.class);
        Welcome welcome = Mockito.mock(Welcome.class);

        Dispatcher dispatcher = new Dispatcher();
        dispatcher.initiate(listAll, menu, checkOut, checkIn, welcome);

        dispatcher.dispatch(0);

        Mockito.verify(welcome).run();
    }
}
