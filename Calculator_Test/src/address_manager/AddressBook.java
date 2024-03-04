/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package address_manager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class AddressBook {

    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        if (contacts.contains(contact)) {
            throw new IllegalArgumentException("Add Duplicated Contact");
        }
        return contacts.add(contact);
    }

    public boolean removeContact(Contact contact) {
        return contacts.remove(contact);
    }

    public Contact searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
