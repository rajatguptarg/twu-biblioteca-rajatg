package com.twu.biblioteca.controller;

import com.twu.biblioteca.view.*;
import org.junit.Test;
import org.mockito.Mockito;


class SetUpBase {
    MenuView menuView = Mockito.mock(MenuView.class);
    ListAll listAll = Mockito.mock(ListAll.class);
    CheckOut checkOut = Mockito.mock(CheckOut.class);
    CheckIn checkIn = Mockito.mock(CheckIn.class);
    Welcome welcome = Mockito.mock(Welcome.class);
}

public class DispatcherTest extends SetUpBase{

    @Test
    public void shouldBeAbleToReturnBackToHome() {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.dispatch(0);

        Mockito.verify(welcome).run();
    }
}
