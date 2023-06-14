package phoneBook;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneBook {

    private ArrayList<Contacts> contactList;
    private Contacts newContact;
    public PhoneBook() {
        contactList = new ArrayList<>();
    }
    public void createContact(String firstName, String lastName, String phoneNo, String mail, String bDay) {
        newContact = new Contacts(firstName, lastName, phoneNo, mail, bDay);
        contactList.add(newContact);
    }
    public void removeContact(String firstName) {
        for (Contacts cont : contactList) {
            if (cont.getFirstName().equals(firstName)) {
                contactList.remove(cont);
            } else {
                System.out.println(" ---- Name cannot be found -------");
            }
        }
    }
    public String getFirstName() {
        return newContact.getFirstName();
    }
    public String displayContacts() {
        String[] elementsInContact = new String[contactList.size()];
        int count = 0;
        for(Contacts cont: contactList) {
            elementsInContact[count] = printElementsOfPhoneBook(cont);
            count++;
            //System.out.println(cont);
        }
        return Arrays.toString(elementsInContact);
    }
    public String  printElementsOfPhoneBook(Contacts con){
        String elementsContainer = con.getFirstName() + " " +con.getLastName() + " " +
                con.getPhoneNo() + " " + con.getEmail() + " " + con.getDate();
        //print(elementsContainer);
        return elementsContainer;
    }
    public void print(String elementToPrint){
        System.out.println(elementToPrint);
    }

    public int getSize() {
        return contactList.size();
    }

    public String searchContactFor(String nameInContact) {
        String result = null;
        for(Contacts contact: contactList){
            if(contact.getFirstName().equals(nameInContact)){
                result = printElementsOfPhoneBook(contact);
            }
        }
        return result;
    }
}



















    /*private Map<String, Contact> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contacts.put(name, contact);
        System.out.println("Added contact: " + contact);
    }

    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            Contact contact = contacts.remove(name);
            System.out.println("Removed contact: " + contact);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            Contact contact = contacts.get(name);
            System.out.println("Contact found: " + contact);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }*/

