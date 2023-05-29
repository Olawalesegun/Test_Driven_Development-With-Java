package InterfaceWithList;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class JavaArrayListTest {

    JavaList list = new JavaArrayList();
    @Test
    public void addTest(){

        list.add("Strive and Keep pushing ");
        assertEquals(1,list.size());
    }

    @Test
    public void removeTest(){
        list.add("Segun is in Semicolon");
        list.add("Segun Olawale");
        list.remove(1);
        assertEquals(1,list.size());
    }
}