package com.bridgelabz.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static Scanner sc = new Scanner(System.in);
    ArrayList<Contacts> list = new ArrayList<>();

    public void contactList() {
        System.out.println("Enter First Name");
        String firstName = sc.nextLine();

        System.out.println("Enter last Name");
        String lastName = sc.nextLine();

        System.out.println("Enter State");
        String state = sc.nextLine();

        System.out.println("Enter City");
        String city = sc.nextLine();

        System.out.println("Enter Address");
        String address = sc.nextLine();

        System.out.println("Enter phone number");
        String phone = sc.nextLine();

        System.out.println("Enter email");
        String email = sc.nextLine();

        Contacts cList = new Contacts(firstName, lastName, address, city, state, phone, email);

        list.add(cList);

    }
}
