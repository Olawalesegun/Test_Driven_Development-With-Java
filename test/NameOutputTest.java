import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameOutputTest {

    @Test
    public void nameTest(){
        NameOutput name = new NameOutput();
        String shigo = name.namingOutput("Segun");
        assertEquals("Hello, Segun", shigo);
    }

}