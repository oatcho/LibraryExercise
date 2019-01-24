package com.company;

public class Library {

    Book [] booksInMyLibrary = new Book [10];

    public void numberOfBooksInLibrary() {
        System.out.println("We've currently got " + booksInMyLibrary.length + " books in the library.");
    }

    public void showAllBooksInLibrary() {
        for (int indivBook = 0; indivBook<booksInMyLibrary.length; indivBook++) {
            System.out.println(" This is what we've got bro: " + booksInMyLibrary[indivBook]);
    }}

}
