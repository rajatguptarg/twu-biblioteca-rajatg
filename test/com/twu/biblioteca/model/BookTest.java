package com.twu.biblioteca.model;

import org.junit.Test;
import static org.junit.Assert.*;


public class BookTest {

    @Test
    public void shouldReturnTrueIfTitleIsMatchedWithCaseSensitivity() {
        Book book = new Book("My Book", "Rajat", "2015");

        assertEquals(true, book.hasTitle("My Book"));
    }

    @Test
    public void shouldReturnTrueIfTitleIsMatchedWithOutCaseSensitivity() {
        Book book = new Book("My Book", "Rajat", "2015");

        assertEquals(true, book.hasTitle("my book"));
    }

    @Test
    public void shouldBeAbleToIssueToUser() {
        Book book = new Book("My Book", "Rajat", "2015");
        User user = new User("Name1", "email1", "12-12", "123-1234", "12345", "user");

        assertEquals(true, book.issueTo(user));
    }
}
