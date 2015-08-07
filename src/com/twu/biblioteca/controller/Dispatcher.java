package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.view.*;


public class Dispatcher {
    private User user;
    private Menu menu;
    private ListAll listAll;
    private CheckOut checkOut;
    private CheckIn checkIn;
    private Welcome welcome;

    public void initiate(ListAll listAll, Menu menu, CheckOut checkOut, CheckIn checkIn, Welcome welcome) {
        this.listAll = listAll;
        this.menu = menu;
        this.checkOut = checkOut;
        this.checkIn = checkIn;
        this.welcome = welcome;
        this.user = null;
    }

    public void start(int userChoice, User currentUser) {
        user = currentUser;
        dispatch(userChoice);
    }

    void dispatch(int choice) {
        switch (choice) {
            case 0:
                welcome.run();
            case 1:
                listAll.availableBooks(user);
                break;
            case 2:
                checkOut.performCheckOutBook(user);
                break;
            case 3:
                checkIn.performCheckInBook(user);
                break;
            case 4:
                listAll.availableMovies(user);
                break;
            case 5:
                checkOut.performCheckOutMovie(user);
                break;
            case 6:
                checkIn.performCheckInMovie(user);
                break;
            case 7:
                listAll.userDetails(user);
                break;
            case 8:
                listAll.checkedOutBooks(user);
                break;
            case 9:
                listAll.checkedOutMovies(user);
                break;
            case 10:
                listAll.displayUserHavingBooks(user);
            default:
                menu.run(user);
        }
    }
}
