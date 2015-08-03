package com.twu.biblioteca.controller;


public interface Library {

    boolean performCheckOut(String itemName);

    boolean performReturn(String itemName);

}
