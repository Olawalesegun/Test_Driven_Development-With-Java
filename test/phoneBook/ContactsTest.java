package phoneBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class ContactsTest {
    Contacts tecnoContact;
    @BeforeEach
    void setUp() {
        tecnoContact = new Contacts();
    }
    @Test
    public void testThatContactExist(){
        assertNotNull(tecnoContact);
    }
    @Test
    public void testThatWhenICreateContactContactIsCreated(){
        List<Contacts> contact = new ArrayList<>();
        tecnoContact.createContact("Segun", "Olawale", "09081080670", "seg@gmail.com", "17-06-1987");
        contact.add(tecnoContact);
        int i = 0;
        for(Contacts cont: contact){
            assertEquals(cont, contact.get(i));
            System.out.println(cont);
            //System.out.println(Arrays.toString(new Contacts[]{cont}));
            i++;
        }
    }
    @Test
    public void testThatWhenICreateContactICanAccesEachElementsAdded(){
        assertEquals("Segun", tecnoContact.getFirstName());
    }
}