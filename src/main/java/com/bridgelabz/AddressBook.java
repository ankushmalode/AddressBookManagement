package com.bridgelabz;

import java.util.*;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    userInfo user = new userInfo();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook();
        addressBook.askUser();
    }

    /*Menu
     */
    void askUser() {
        userInfo user1 = new userInfo();
        System.out.println(" Select the action ");
        System.out.println("1. Add contact.\n2. Edit contact. \n3. display contact. \n4. Delete contact. \n5. Exit");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                user.addPerson(user1);
                break;
            case 2:
                System.out.println("Enter first and last name of the person to edit the contact: ");
                break;
        }
    }
}