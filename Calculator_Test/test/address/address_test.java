/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package address;

import address_manager.AddressBook;
import address_manager.Contact;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class address_test {
    
    public address_test() {
    }
    
   @Test
    public void testAddContact() {
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("John Doe", "john@example.com", "123456789");
        
        assertTrue(addressBook.addContact(contact));
        assertEquals(1, addressBook.getContacts().size());
    }

    @Test
    public void testRemoveContact() {
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("Jane Doe", "jane@example.com", "987654321");
        
        addressBook.addContact(contact);
        assertTrue(addressBook.removeContact(contact));
        assertEquals(0, addressBook.getContacts().size());
    }

    @Test
    public void testSearchContact() {
        AddressBook addressBook = new AddressBook();
        Contact contact1 = new Contact("Alice", "alice@example.com", "111111111");
        Contact contact2 = new Contact("Bob", "bob@example.com", "222222222");
        
        addressBook.addContact(contact1);
        addressBook.addContact(contact2);

        Contact result = addressBook.searchContact("Bob");
        assertNotNull(result);
        assertEquals("Bob", result.getName());
    }

    @Test
    public void testGetAllContacts() {
        AddressBook addressBook = new AddressBook();
        Contact contact1 = new Contact("Eve", "eve@example.com", "333333333");
        Contact contact2 = new Contact("Charlie", "charlie@example.com", "444444444");
        
        addressBook.addContact(contact1);
        addressBook.addContact(contact2);

        List<Contact> allContacts = addressBook.getContacts();
        assertEquals(2, allContacts.size());
        assertTrue(allContacts.contains(contact1));
        assertTrue(allContacts.contains(contact2));
    }
       
    @Test
    public void testAddDuplicateContact() {
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("John Doe", "john@example.com", "123456789");
        
        assertTrue(addressBook.addContact(contact));
        assertFalse(addressBook.addContact(contact)); // Adding the same contact again should return false
        assertEquals(1, addressBook.getContacts().size());
    }

    @Test
    public void testRemoveNonexistentContact() {
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("Jane Doe", "jane@example.com", "987654321");
        
        assertFalse(addressBook.removeContact(contact)); // Removing a non-existent contact should return false
        assertEquals(0, addressBook.getContacts().size());
    }

    @Test
    public void testSearchNonexistentContact() {
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("Alice", "alice@example.com", "111111111");
        
        assertNull(addressBook.searchContact("Bob")); // Searching for a non-existent contact should return null
    }

    @Test
    public void testGetAllContactsEmptyList() {
        AddressBook addressBook = new AddressBook();
        
        List<Contact> allContacts = addressBook.getContacts();
        assertEquals(0, allContacts.size());
    }

    @Test
    public void testGetAllContactsAfterRemoval() {
        AddressBook addressBook = new AddressBook();
        Contact contact1 = new Contact("Eve", "eve@example.com", "333333333");
        Contact contact2 = new Contact("Charlie", "charlie@example.com", "444444444");
        
        addressBook.addContact(contact1);
        addressBook.addContact(contact2);
        addressBook.removeContact(contact1);

        List<Contact> allContacts = addressBook.getContacts();
        assertEquals(1, allContacts.size());
        assertFalse(allContacts.contains(contact1));
        assertTrue(allContacts.contains(contact2));
    }
}
