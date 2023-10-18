package com.project.base;

import java.util.Scanner;

import com.project.model.PhoneBook;

public class PhoneBookSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        PhoneBook pb = new PhoneBook();

        while (true) {
            System.out.println("\nPhone Book System Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    if(!name.matches("[A-Za-z]+") || name.isEmpty()) {
                    	System.out.println("Invalid Name");
                    	continue;
                    }
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = sc.nextLine();
                    if(!phoneNumber.matches("[0-9]+") || phoneNumber.isEmpty()) {
                    	System.out.println("Invalid Phone Number, Enter only Numbers");
                    	continue;
                    }
                    pb.addContact(name, phoneNumber);
                    break;

                case 2:
                    System.out.print("Enter Name to Search: ");
                    name = sc.nextLine();                   
                    System.out.println("Phone Number: " + pb.searchContact(name));
                    break;

                case 3:
                    System.out.print("Enter Name to Update: ");
                    name = sc.nextLine();
                    System.out.print("Enter New Phone Number: ");
                    phoneNumber = sc.nextLine();
                    if(!phoneNumber.matches("[0-9]+") || phoneNumber.isEmpty()) {
                    	System.out.println("Invalid Phone Number, Enter only Numbers");
                    	continue;
                    }
                    pb.updateContact(name, phoneNumber);
                    break;

                case 4:
                    System.out.print("Enter Name to Delete: ");
                    name = sc.nextLine();
                    pb.deleteContact(name);
                    break;

                case 5:
                    pb.displayContacts();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

	}

}
