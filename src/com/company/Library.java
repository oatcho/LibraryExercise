package com.company;

public class Library {

    Book [] booksInMyLibrary = new Book [2];


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


//    public void numberOfBooksInLib () {
//        int numBooks2 = 0;
//        for (int i = 0; i <booksInMyLibrary.length; i++) {
//            if (booksInMyLibrary[i] != null) {
//                numBooks2++;
//            }
//        }
//    }

}
