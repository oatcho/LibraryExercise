package com.company;

public class Library {

    Book [] booksInMyLibrary = new Book [10];

    public void numberOfBooksInLibrary() {
        int numBooks = 0;
        for (int i = 0; i < booksInMyLibrary.length; i++) {
            if (booksInMyLibrary[i] != null) {
                numBooks++;
            }
        }

        System.out.println("We've currently got " + numBooks + " book(s) in the library. \n");

    }

    public void printBooks() {
        for (Book book : booksInMyLibrary) {
            if (book != null) {
                book.describeBook();
            }
        }
    }

    public void addBook(Book book) {

        for (int i = 0; i < booksInMyLibrary.length; i++) {
            if (booksInMyLibrary[i] == null) {
                booksInMyLibrary[i] = book;
                break;
            }

        }

    }

}
