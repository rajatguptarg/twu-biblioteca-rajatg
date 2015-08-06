package com.twu.biblioteca;

import com.twu.biblioteca.controller.Dispatcher;
import com.twu.biblioteca.controller.Session;
import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.helper.Constants;
import com.twu.biblioteca.helper.Input;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.LibraryItem;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.view.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<LibraryItem> movieList = new ArrayList<LibraryItem>();
        List<LibraryItem> movieListCheckedOut = new ArrayList<LibraryItem>();

        movieList.add(new Movie("XXX", "2010", "John Doe", "7.2"));
        movieList.add(new Movie("XXX 2", "2010", "John Doe", "4.2"));
        movieList.add(new Movie("X-Men", "2012", "John Doe", "8.2"));
        movieList.add(new Movie("Shawshank Redemption", "1994", "John Doe", "9.2"));
        movieList.add(new Movie("Hulk", "2007", "John Doe", "7.0"));

        Library movieSection = new Library(movieList, movieListCheckedOut);

        List<LibraryItem> bookList = new ArrayList<LibraryItem>();
        List<LibraryItem> checkedOutBookList = new ArrayList<LibraryItem>();

        bookList.add(new Book("Great Rajat", "Gatsby", "2015"));
        bookList.add(new Book("Incredible Rajat", "Tyrion Lannister", "2010"));
        bookList.add(new Book("Have Fun", "Rajat", "2012"));
        bookList.add(new Book("I know nothing", "Jon Snow", "2011"));
        bookList.add(new Book("valar morghulis", "Khalisi", "2010"));

        Library bookSection = new Library(bookList, checkedOutBookList);

        Input input = new Input();

        List<User> userList = new ArrayList<User>();

        userList.add(new User("123-1234", "12345", Constants.ADMIN));
        userList.add(new User("123-1235", "12345", Constants.USER));

        Session session = new Session(userList);

        Dispatcher dispatcher = new Dispatcher();
        Login login = new Login(session, input, dispatcher);
        Welcome welcome = new Welcome();
        Menu menu = new Menu(dispatcher, input);
        CheckIn checkIn = new CheckIn(bookSection, movieSection, dispatcher, input);
        CheckOut checkOut = new CheckOut(bookSection, movieSection, dispatcher, input);
        ListAll listAll = new ListAll(bookSection, movieSection, dispatcher);

        welcome.initiate(login, input);
        dispatcher.initiate(listAll, menu, checkOut, checkIn, welcome);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(welcome);

        bibliotecaApp.run();
    }
}
