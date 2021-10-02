package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner sc = new Scanner(System.in);
        int menu;

        System.out.println(" 0. Exit. ");
        System.out.println(" 1. Add contact. ");
        System.out.println(" 2. Edit contact. ");
        System.out.println(" 3. display contact. ");
        System.out.println(" 4. Delete contact. ");
        menu = sc.nextInt();
        if (menu>=0 && menu<5)
            System.out.println("You have selected option is "+menu);
        else
            System.out.println("You have selected wrong input.");
    }
}
