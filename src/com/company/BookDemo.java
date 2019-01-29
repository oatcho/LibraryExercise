package com.company;

import java.util.Scanner;

public class BookDemo {

    public static Scanner key = new Scanner(System.in);

    public static int menu() {

        int menuChoice;

        do {
            System.out.println("Welcome to the Detroit Labs Library, what do you want from me? \n 1) Show me what you got. \n 2) I want to give you this book here, man. \n 3) I came for a particular book. \n 4) This is actually kind of weird, I'm going home");
            menuChoice = key.nextInt();

            if(menuChoice <1 || menuChoice >4) {
                System.out.println("Sorry, Man. We don't do that here.");
            }
        } while (menuChoice <1 || menuChoice >4);
        return menuChoice;
    }

    public static void main(String[] args) {

        int menuOption = 0;
        Library seeLibrary = new Library();


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

                        System.out.println("What's the name of the book, dude?");
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
