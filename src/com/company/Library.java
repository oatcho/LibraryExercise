package com.company;

import java.util.Scanner;

public class Library {

    Book [] booksInMyLibrary = new Book [2];
    public static Scanner ser = new Scanner(System.in);


    public int numberOfBooksInLibrary() {
        int numBooks = 0;
        for (int i = 0; i < booksInMyLibrary.length; i++) {
            if (booksInMyLibrary[i] != null) {
                numBooks++;
            }
        }

        System.out.println("We've currently got " + numBooks + " book(s) in the library. \n");
        return numBooks;
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

    public boolean isFull() {
        return numberOfBooksInLibrary() == booksInMyLibrary.length;
    }

    public boolean hasRoom() {
        return !isFull();
    }

    public void search() {


        String searchInput;
        System.out.println("What's the name of the book?");
        searchInput = ser.nextLine();
        for (int i = 0; i < booksInMyLibrary.length; i++) {
            if (booksInMyLibrary[i].getBookTitle().equalsIgnoreCase(searchInput)){
                System.out.println("What do you want to do next?");
            }
            else {
                System.out.println("Sorry we don't have that book.");
            }

        break;}
    }


//    public void numberOfBooksInLib () {
//        int numBooks2 = 0;
//        for (int i = 0; i <booksInMyLibrary.length; i++) {
//            if (booksInMyLibrary[i] != null) {
//                numBooks2++;
//            }
//        }
//    }

}
