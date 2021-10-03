package com.bridgelabz;

import java.util.*;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();
        addressBook.askUser();
    }

    /*Menu
         */
        void askUser () {
            System.out.println(" Select the action ");
            System.out.println("1. Add contact.\n2. Edit contact. \n3. display contact. \n4. Delete contact. \n5. Exit");

            int choice =scanner.nextInt();
            switch (choice){
                case 1:
                    addPerson();
                    break;
            }
        }
        /* user info
         */
    void addPerson(){
        System.out.print("Enter first name ");
        String firstName=scanner.next();
        System.out.print("Enter Last name ");
        String lastName=scanner.next();
        System.out.print("Enter address: ");
        String address=scanner.nextLine();
        System.out.print("Enter city, state: ");
        String city=scanner.next();
        String state=scanner.next();
        System.out.print("Enter PIN code: ");
        String pinCode=scanner.next();
        System.out.print("Enter phone number: ");
        String phoneNumber=scanner.next();
        System.out.print("Enter email ID: ");
        String emaiID= scanner.next();
    }
}