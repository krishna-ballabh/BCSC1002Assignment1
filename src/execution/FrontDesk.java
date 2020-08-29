/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n" +
                    "How may I help you today?\n" +
                    "1. Issue a new book for me.\n" +
                    "2. Return a previously issues book for me.\n" +
                    "3. Show me all my issues books.\n" +
                    "4. Exit.\n");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Book Name : ");
                    String bookName = scanner.nextLine();
                    System.out.println("Enter Author Name : ");
                    scanner.nextLine();
                    String authorName = scanner.nextLine();
                    System.out.println("Enter ISBN Number of Book");
                    scanner.nextLine();
                    String isbnNumber = scanner.nextLine();
                    Book book = new Book(bookName, authorName, isbnNumber);
                    student.addBook(book);
                    break;



            }
        }while (true);

    }

}
