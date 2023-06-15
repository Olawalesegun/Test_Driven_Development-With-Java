package phoneBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    PhoneBook tecnoPhoneBook;

    @BeforeEach
    void setUp() {
        tecnoPhoneBook = new PhoneBook();
    }

    @Test
    public void testThatPhoneBookExist() {
        assertNotNull(tecnoPhoneBook);
    }

    @Test
    public void testThatICanCreateContact() {
        tecnoPhoneBook.createContact("Segun", "Olawale", "09054324100",
                "shegzz@ir.com", "18-09-2013");
        assertEquals("Segun", tecnoPhoneBook.getFirstName());
    }

    @Test
    public void testThatICanCanCreateMoreThanOneContact() {
        tecnoPhoneBook.createContact("Lamide", "Kelvin",
                "09053010203", "lam@ir.com", "13-02-2001");
        tecnoPhoneBook.createContact("Anjola", "Salsa",
                "07065432108", "anj@kel.com", "12-01-1990");
        String newElements = tecnoPhoneBook.displayContacts();
        String[] arr = {"Lamide Kelvin 09053010203 lam@ir.com 13-02-2001, Anjola Salsa 07065432108 anj@kel.com 12-01-1990"};
        assertEquals(Arrays.toString(arr), newElements);
    }

    @Test
    public void testThatICanCreateALotOfContacts() {
        tecnoPhoneBook.createContact("Sam", "Immanuel", "09087456543",
                "sam@im.com", "12-03-1989");
        tecnoPhoneBook.createContact("Bola", "Ige",
                "09034567893", "bola@ige.com", "12-03-1980");
        tecnoPhoneBook.createContact("Jide", "Samson",
                "0812345678", "jide@sam.com", "01-01-1970");
        tecnoPhoneBook.createContact("Samuel", "Olasukanmi",
                "090123456790", "sam@ola.com", "03-03-1890");
        tecnoPhoneBook.createContact("Lamide", "Kelvin",
                "09053010203", "lam@ir.com", "13-02-2009");
        tecnoPhoneBook.createContact("Anjola", "Salsa",
                "07065432108", "anj@kel.com", "12-01-1990");
        String[] newElements = {"Sam Immanuel 09087456543 sam@im.com 12-03-1989, " +
                "Bola Ige 09034567893 bola@ige.com 12-03-1980, " +
                "Jide Samson 0812345678 jide@sam.com 01-01-1970, " +
                "Samuel Olasukanmi 090123456790 sam@ola.com 03-03-1890, " +
                "Lamide Kelvin 09053010203 lam@ir.com 13-02-2009, " +
                "Anjola Salsa 07065432108 anj@kel.com 12-01-1990"};
        assertEquals(Arrays.toString(newElements), tecnoPhoneBook.displayContacts());
        assertEquals(6, tecnoPhoneBook.getSize());
    }

    @Test
    public void testThatICanRemoveAContact() {
        tecnoPhoneBook.createContact("Jide", "Samson",
                "0812345678", "jide@sam.com", "01-01-1970");
        tecnoPhoneBook.createContact("Samuel", "Olasukanmi",
                "090123456790", "sam@imm.com", "03-03-1890");
        assertEquals(2, tecnoPhoneBook.getSize());
        tecnoPhoneBook.removeContact("Jide");
        assertEquals(1, tecnoPhoneBook.getSize());
    }
    @Test
    public void testThatICanSearch() {
        tecnoPhoneBook.createContact("Sam", "Immanuel", "09087456543",
                "sam@im.com", "12-03-1989");
        tecnoPhoneBook.createContact("Bola", "Ige",
                "09034567893", "bola@ige.com", "12-03-1980");
        tecnoPhoneBook.createContact("Jide", "Samson",
                "0812345678", "jide@sam.com", "01-01-1970");
        tecnoPhoneBook.createContact("Samuel", "Olasukanmi",
                "090123456790", "sam@ola.com", "03-03-1890");
        tecnoPhoneBook.createContact("Lamide", "Kelvin",
                "09053010203", "lam@ir.com", "13-02-2009");
        tecnoPhoneBook.createContact("Anjola", "Salsa",
                "07065432108", "anj@kel.com", "12-01-1990");
        String result = "Lamide Kelvin 09053010203 lam@ir.com 13-02-2009";
        assertEquals(result, tecnoPhoneBook.searchContactFor("Lamide"));
    }

    @Test
    public void testThatAllContactsDisplayUponEntering(){
        tecnoPhoneBook.createContact("Sam", "Immanuel", "09087456543",
                "sam@im.com", "12-03-1989");
        tecnoPhoneBook.createContact("Bola", "Ige",
                "09034567893", "bola@ige.com", "12-03-1980");
        tecnoPhoneBook.createContact("Jide", "Samson",
                "0812345678", "jide@sam.com", "01-01-1970");
        tecnoPhoneBook.createContact("Samuel", "Olasukanmi",
                "090123456790", "sam@ola.com", "03-03-1890");
        tecnoPhoneBook.createContact("Lamide", "Kelvin",
                "09053010203", "lam@ir.com", "13-02-2009");
        tecnoPhoneBook.createContact("Anjola", "Salsa",
                "07065432108", "anj@kel.com", "12-01-1990");
        assertEquals("jij", tecnoPhoneBook.displayContacts());
    }
    @Test
    public void testThatContactsAreSorted(){
        tecnoPhoneBook.createContact("Sam", "Immanuel", "09087456543",
                "sam@im.com", "12-03-1989");
        tecnoPhoneBook.createContact("Bola", "Ige",
                "09034567893", "bola@ige.com", "12-03-1980");
        tecnoPhoneBook.createContact("Jide", "Samson",
                "0812345678", "jide@sam.com", "01-01-1970");
        tecnoPhoneBook.createContact("Samuel", "Olasukanmi",
                "090123456790", "sam@ola.com", "03-03-1890");
        tecnoPhoneBook.createContact("Lamide", "Kelvin",
                "09053010203", "lam@ir.com", "13-02-2009");
        tecnoPhoneBook.createContact("Anjola", "Salsa",
                "07065432108", "anj@kel.com", "12-01-1990");
        tecnoPhoneBook.sortContactsFromListOfContacts();
        assertEquals("jij", tecnoPhoneBook.displayContacts());
    }
}
