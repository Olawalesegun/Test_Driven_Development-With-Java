package phoneBook;

import java.util.*;

public class PhoneBook {

    private ArrayList<Contacts> contactList;
    private Contacts newContact;
    public PhoneBook() {
        contactList = new ArrayList<>();
    }
    public void createContact(String firstName, String lastName, String phoneNo, String mail, String bDay) {
        newContact = new Contacts(firstName, lastName, phoneNo, mail, bDay);
        contactList.add(newContact);
        if(contactList != null) print("You have successfully created a contact");
    }
    public void removeContact(String firstName) {
        loopThroughContactListToRemove(firstName);
    }
    public void loopThroughContactListToRemove(String firstName){
        for (Contacts cont : contactList) {
           checkIfConditionIsEqualToValueEntered(cont, firstName);
        }
    }
    public void checkIfConditionIsEqualToValueEntered(Contacts cont, String firstName){
        if (cont.getFirstName().equals(firstName)) {
            contactList.remove(cont);
        } else {
            print(" ---- Name cannot be found -------");
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
    public void updateFirstNameOnly(String firstName){
        for(Contacts con: contactList){
            if(con.getFirstName() != null){
                newContact.updateFirstName(firstName);
            }else{
                print("You will have to create contact before you can update contact");
            }
        }
    }
    public void updateLastNameOnly(String lastName){
        for(Contacts con: contactList){
            if(con.getLastName() != null){
                newContact.updateLastName(lastName);
            }else{
                print("You will have to create contact before you can update contact");
            }
        }
    }
    public void updateFirstNameAndLastName(String firstName, String lastName){
        updateFirstNameOnly(firstName);
        updateLastNameOnly(lastName);
    }
    public String printElementsOfPhoneBook(Contacts con){
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
            }else{
                print("Contact does not exist");
            }
        }
        print(result);
        return result;
    }
    public void sortContactsFromListOfContacts() {
        Collections.sort(contactList, new Comparator<Contacts>() {
            @Override
            public int compare(Contacts contact1, Contacts contact2) {
                return contact1.getFirstName().compareTo(contact2.getFirstName());
            }
        });
    }
//    public void sortContactsFromListOfContacts() {
//        Collections.sort(contactList, (contact1, contact2) ->
//                contact1.getFirstName().compareTo(contact2.getFirstName()));
//    }
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

