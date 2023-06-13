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
    public void testThatPhoneBookExist(){
        assertNotNull(tecnoPhoneBook);
    }
    @Test
    public void testThatICanCreateContact(){
        tecnoPhoneBook.createContact("Segun", "Olawale", "09054324100",
                "shegzz@ir.com", "18-09-2013");
        assertEquals("Olawale", tecnoPhoneBook.getFirstName());
    }
    @Test
    public void testThatICanCanCreateMoreThanOneContact(){
        tecnoPhoneBook.createContact("Lamide", "Kelvin", "09053010203",
                "lam@ir.com", "13-02-2009");
        tecnoPhoneBook.createContact("Anjola", "Salsa", "07065432108",
               "anj@kel.com", "12-01-1990");
     String newElements = tecnoPhoneBook.displayContacts();
         String[] arr = {"Lamide Kelvin 09053010203 09053010203 lam@ir.com, Anjola Salsa 07065432108 07065432108 anj@kel.com"};
     assertEquals( Arrays.toString(arr) , newElements);

    }


   /* @Test
    public void testThatICanAddContact(){
        tecnoPhoneBook.createContact();
    }*/
}