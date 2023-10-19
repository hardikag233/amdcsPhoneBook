package com.project.model;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
	
	private Map<String, String> contacts = new HashMap<String, String>();

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public String searchContact(String name) {
        return contacts.getOrDefault(name, "Contact not found");
    }

    public void updateContact(String name, String newPhoneNumber) {
        if(contacts.containsKey(name)) {
            contacts.put(name, newPhoneNumber);
        } else {
            System.out.println("Contact not found");
        }
    }

    public void deleteContact(String name) {
        if(contacts.remove(name) == null) {
            System.out.println("Contact not found");
        }
    }

    public void displayContacts() {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
        }
    }
}
