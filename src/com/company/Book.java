package com.company;

public class Book {

    private String bookTitle;
    private String bookAuthor;
    private String bookPublisher;
    private int bookPageAmt;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public int getBookPageAmt() {
        return bookPageAmt;
    }

    public void setBookPageAmt(int bookPageAmt) {
        this.bookPageAmt = bookPageAmt;
    }

    public void describeBook() {
        System.out.println("This book is titled: " + bookTitle + ", was authored by: " + bookAuthor + ", published by: " + bookPublisher + ", and is " + bookPageAmt + " pages long. \n");
    }
}
