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
            case 2:
                System.out.println("Enter first and last name of the person to edit the contact: ");
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
    void edit(){
        System.out.print("What do you want to edit:");
        System.out.println("1. First name: \n2. Last Name: \n3. Address: \n4. City\n5. State\n6. phone number\n7. email\n8. PIN Code");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                String firstName=scanner.next();
                break;
            case 2:
                String lastName=scanner.next();
                break;
            case 3:
                String address=scanner.nextLine();
                break;
            case 4:
                String city=scanner.next();
                break;
            case 5:
                String state=scanner.next();
                break;
            case 6:
                String phoneNumber=scanner.next();
                break;
            case 7:
                String emaiID= scanner.next();
                break;
            case 8:
                String pinCode=scanner.next();
                break;
            default:
                break;
        }
    }
}