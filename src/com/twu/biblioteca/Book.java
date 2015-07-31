package com.twu.biblioteca;


public class Book {
    private String bookName;
    private String bookAuthor;
    private String yearPublished;
    private boolean checkoutStatus;

    public Book(String bookName, String bookAuthor, String yearPublished) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearPublished = yearPublished;
        this.checkoutStatus = false;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public boolean isBookCheckedOuted() {
        return checkoutStatus;
    }

    public void checkOut() {
        checkoutStatus = true;
    }

    public void checkIn() {
        checkoutStatus = false;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Book book = (Book) other;

        if (bookName != null ? !bookName.equals(book.bookName) : book.bookName != null) return false;
        if (bookAuthor != null ? !bookAuthor.equals(book.bookAuthor) : book.bookAuthor != null) return false;
        return !(yearPublished != null ? !yearPublished.equals(book.yearPublished) : book.yearPublished != null);

    }

    @Override
    public int hashCode() {
        int result = bookName != null ? bookName.hashCode() : 0;
        result = 31 * result + (bookAuthor != null ? bookAuthor.hashCode() : 0);
        result = 31 * result + (yearPublished != null ? yearPublished.hashCode() : 0);
        result = 31 * result + (checkoutStatus ? 1 : 0);
        return result;
    }
}
