package com.company;

import java.util.Scanner;

public class BookDemo {

    public static Scanner key = new Scanner(System.in);

    public static int menu() {

        int menuChoice;

        do {
            System.out.println("Welcome to the Library, how can I help you? \n 1) Show me your selection of books \n 2) I want to donate a book. \n 3) I came looking for a particular book. \n 4) I'm ready to go home now");
            menuChoice = key.nextInt();

            if(menuChoice <1 || menuChoice >4) {
                System.out.println("Sorry, we can't do that here");
            }
        } while (menuChoice <1 || menuChoice >4);
        return menuChoice;
    }

    public static void main(String[] args) {


        int menuOption = 0;
        Library seeLibrary = new Library();
        Book firstBook = new Book ();
        seeLibrary.booksInMyLibrary.add(0, firstBook);
//        seeLibrary.booksInMyLibrary[0]=firstBook;


        while (menuOption !=4) {
            menuOption = menu();
            switch (menuOption) {

                case 1:

                    seeLibrary.numberOfBooksInLibrary();
                    seeLibrary.printBooks();
//                    seeLibrary.numberOfBooksInLibrary();
                    break;

                case 2:

                    if (seeLibrary.hasRoom()) {

                        seeLibrary.addBook();

                    } else {
                        System.out.println("We've got too many books right now, no thanks. \n");
                    }

                    break;

                case 3:

                    seeLibrary.search();
                    break;

            }
        }
    }
}
