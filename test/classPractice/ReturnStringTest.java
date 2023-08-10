package classPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnStringTest {

    @Test
    public void testThatMethodWorks(){
        ReturnString retStr = new ReturnString();
        String firstStringEntered = "JamBBola";
        String secondStringEntered = "ZACTToJlma";
        StringBuilder result = retStr.checkStringForSameValue(firstStringEntered, secondStringEntered);
        assertEquals("JBB",result.toString());
    }


}