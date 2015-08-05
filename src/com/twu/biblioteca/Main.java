package com.twu.biblioteca;

import com.twu.biblioteca.controller.Session;
import com.twu.biblioteca.controller.Library;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.LibraryItem;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.view.Menu;
import com.twu.biblioteca.view.View;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

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

        List<User> userList = new ArrayList<User>();

        userList.add(new User("123-1234", "12345", Constants.ADMIN));
        userList.add(new User("123-1235", "12345", Constants.USER));

        Session session = new Session(userList);

        View view = new View(menu, bookSection, movieSection, session);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view);

        bibliotecaApp.run();
    }
}
