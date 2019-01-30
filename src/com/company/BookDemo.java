package com.company;

import java.util.Scanner;

public class BookDemo {

    public static Scanner key = new Scanner(System.in);

    public static int menu() {

        int menuChoice;

        do {
            System.out.println("Welcome to the Detroit Labs Library, how can I help you? \n 1) Show me your selection of books \n 2) I want to donate a book. \n 3) I came looking for a particular book. \n 4) I'm ready to go home now");
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
        seeLibrary.booksInMyLibrary[0]=firstBook;


        while (menuOption !=4) {
            menuOption = menu();
            switch (menuOption) {

                case 1:

                    seeLibrary.numberOfBooksInLibrary();
                    seeLibrary.printBooks();
                    break;

                case 2:

                    if (seeLibrary.hasRoom()) {

                        Book enterBook = new Book();

                        System.out.println("What's the name of the book?");
                        key.nextLine();
                        enterBook.setBookTitle(key.nextLine());

                        System.out.println("Who wrote it?");
                        enterBook.setBookAuthor(key.nextLine());

                        System.out.println("Who's the publisher?");
                        enterBook.setBookPublisher(key.nextLine());

                        System.out.println("How many pages long is it?");
                        enterBook.setBookPageAmt(key.nextInt());

                        seeLibrary.addBook(enterBook);

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
