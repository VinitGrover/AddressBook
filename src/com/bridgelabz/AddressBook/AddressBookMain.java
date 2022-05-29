package com.bridgelabz.AddressBook;
public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Main Program");

        AddressBook a1 = new AddressBook();
        a1.contactList();
        System.out.println(a1.list);


    }
}
