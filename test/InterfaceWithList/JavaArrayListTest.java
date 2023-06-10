package InterfaceWithList;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JavaArrayListTest {

    JavaList list = new JavaArrayList();
    @Test
    public void testToEnsureItAdds(){

        list.add("Strive and Keep pushing ");
        assertEquals(1,list.size());
    }

    @Test
    public void testToEnsureItRemove(){
        list.add("Segun is in Semicolon");
        list.add("Segun Olawale");
        list.remove(1);
        assertEquals(1,list.size());
    }

    @Test
    public void testToEnsureItAddsandAlsoGetsAtTheSameTime(){
        list.add("Segun is in Semicolon");
        list.add("DIgiTAl ANtive");
        list.add("Testing Testing ");
        assertEquals("Segun is in Semicolon",list.get(0));
    }
}