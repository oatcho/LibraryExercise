package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

//    public Book [] booksInMyLibrary = new Book [3];
    public ArrayList<Book> booksInMyLibrary = new ArrayList<>();
    public static Scanner ser = new Scanner(System.in);


    public int numberOfBooksInLibrary() {
        int numBooks = 0;
        for (int i = 0; i < booksInMyLibrary.size(); i++) {
            if (booksInMyLibrary.get(i) != null) {
                numBooks++;
            }
//            System.out.println(numBooks);
            return numBooks;

        }

//        System.out.println("We've currently got " + numBooks + " book(s) in the library. \n");
        return numBooks;
    }


    public void printBooks() {

        System.out.println(booksInMyLibrary);
        int numBooks = 0;
        for (int i = 0; i < booksInMyLibrary.size(); i++){
            if (booksInMyLibrary.get(i) != null){
                numBooks++;
            }
        }
        System.out.println("We currently have " + numBooks + " book(s) in the library. \n");
        for (Book book : booksInMyLibrary) {
            if (book != null) {
                book.describeBook();
            }
        }
    }

    public void addBook() {

        Book book = new Book();

        System.out.println("What's the name of the book?");
//        ser.nextLine();
        book.setBookTitle(ser.nextLine());

        System.out.println("Who wrote it?");
        book.setBookAuthor(ser.nextLine());

        System.out.println("Who's the publisher?");
        book.setBookPublisher(ser.nextLine());

        System.out.println("How many pages long is it?");
        book.setBookPageAmt(ser.nextInt());

        System.out.println(booksInMyLibrary.size());

        booksInMyLibrary.add(book);

        System.out.println(booksInMyLibrary.size());
//        for (int i = 0; i < booksInMyLibrary.size(); i++) {
//            if (booksInMyLibrary.get(i) == null) {
//                booksInMyLibrary.add(i, book);
//                break;
//            }

//        }

    }

    public boolean isFull() {
        return numberOfBooksInLibrary() == Integer.MAX_VALUE;
    }

    public boolean hasRoom() {
        return !isFull();
    }

    public void search() {


        String searchInput;
        System.out.println("What's the name of the book?");
        ser.nextLine();
        searchInput = ser.nextLine();
        System.out.println(searchInput);
        boolean bookFound = false;
        for (int i = 0; i < booksInMyLibrary.size(); i++) {
            if (booksInMyLibrary.get(i).getBookTitle().equalsIgnoreCase(searchInput)) {
                bookFound = true;
                System.out.println("What do you want to do next? \n 1) Edit Book Info \n 2) Borrow (Delete) Book \n 3) Return to Main Menu");
                int searchMenuOption = ser.nextInt();
                while (searchMenuOption != 3) {
                    switch (searchMenuOption) {

                        case 1:
                            System.out.println("What part of the book would you like to edit?");
                            System.out.println("\n1) Edit title \n 2) Edit author \n 3) Edit publisher \n 4) Edit number of pages \n 5) Exit");
                            int inputEditOption = ser.nextInt();
                            switch (inputEditOption) {
                                case 1:
                                    System.out.println("What's the new title?");
                                    ser.nextLine();
                                    booksInMyLibrary.get(i).setBookTitle(ser.nextLine());
                                    break;
                                case 2:
                                    System.out.println("Who's the new author?");
                                    ser.nextLine();
                                    booksInMyLibrary.get(i).setBookAuthor(ser.nextLine());
                                    break;
                                case 3:
                                    System.out.println("Who's the new publisher?");
                                    ser.nextLine();
                                    booksInMyLibrary.get(i).setBookPublisher(ser.nextLine());
                                    break;
                                case 4:
                                    System.out.println("Whats the new total number of pages?");
                                    ser.nextInt();
                                    booksInMyLibrary.get(i).setBookPageAmt(ser.nextInt());
                                    break;
                                case 5:
                                    break;
                                default:
                                    break;


                            }
                            break;

                        case 2:
                            booksInMyLibrary.remove(i);
                            break;

                    }
//                    break;
                }
            }

        }
        if (!bookFound) {
            System.out.println("Sorry, we don't have that book here.");
        }
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
