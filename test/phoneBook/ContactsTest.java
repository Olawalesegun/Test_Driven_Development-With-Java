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
        tecnoContact = new Contacts("Segun", "Olawale", "09081080670", "seg@gmail.com", "17-06-1987");
    }
    @Test
    public void testThatContactExist(){
        assertNotNull(tecnoContact);
    }
    @Test
    public void testThatWhenICreateContactContactIsCreated(){
        List<Contacts> contact = new ArrayList<>();
      //  tecnoContact.createContact();
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
    public void testThatWhenICreateContactICanAccessFirstElementsAdded(){
        //tecnoContact("Segun", "Olawale", "09081080670", "seg@gmail.com", "17-06-1987");
        assertEquals("Segun", tecnoContact.getFirstName());
    }
    @Test
    public void testThatWhenContactIsCreatedICanICanAccessFirstAndSecondElementAdded(){
        //tecnoContact.createContact("Segun", "Olawale", "09081080670", "seg@gmail.com", "17-06-1987");
        assertEquals("Segun", tecnoContact.getFirstName());
        assertEquals("Olawale", tecnoContact.getLastName());
    }
    @Test
    public void testThatWhenContactIsCreatedICanAccessTheFirstSecondAndThirdElementsAdded(){
       // tecnoContact.createContact("Segun", "Olawale", "09081080670", "seg@gmail.com", "17-06-1987");
        assertEquals("Segun", tecnoContact.getFirstName());
        assertEquals("Olawale", tecnoContact.getLastName());
        assertEquals("09081080670", tecnoContact.getPhoneNo());
        assertEquals("17-06-1987", tecnoContact.getDate());
    }
    @Test
    public void testThatICanEditOrUpdateFirstElementAddedToContact(){
       // tecnoContact.createContact("Obed", "Silicon", "09078234567", "seg@nur.com", "07-04-1986");
        assertEquals("Segun", tecnoContact.getFirstName());
        tecnoContact.updateFirstName("Shola");
        assertEquals("Shola Olawale", tecnoContact.getFirstName() + " " +tecnoContact.getLastName());
    }
    @Test
    public void testThatICanEditOrUpdateLastName(){
       // tecnoContact.c554rf4redc vdfgvb]\-p['/ttttttttttt5rhgtvgftgtyheateContact("Obed", "Silicon", "09078234567", "seg@nur.com", "07-04-1986");
        assertEquals("Segun", tecnoContact.getFirstName());
        tecnoContact.updateLastName("Shola");
        assertEquals("Segun Shola", tecnoContact.getFirstName() + " " +tecnoContact.getLastName());
    }
    @Test
    public void testThatICanEditAndUpdateAllELementsAdded(){
        //"09081080670", "seg@gmail.com", "17-06-198m  mgfbvgf gfvvrcfdg65t5687uy6y76yu7uuyu6ytga7"
       // tecnoContact.createContact("Obed", "Silicon", "09078234567", "seg@nur.com", "07-04-1986");
        assertEquals("Segun", tecnoContact.getFirstName());
        tecnoContact.updateFirstName("Sabitu");
        tecnoContact.updateLastName("Shola");
        tecnoContact.updatePhoneNo("09043214567");
        tecnoContact.updateEmail("ort@gmail.com");
        assertEquals("Sabitu Shola 09043214567 seg@gmail.com", tecnoContact.getFirstName() + " " +tecnoContact.getLastName() +
                " " + tecnoContact.getPhoneNo() + " "+ tecnoContact.getEmail());
    }
}