import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegerTest {

    @Test
    public void testThatHugeIntegerIsEqualSame(){
        HugeInteger hugeInteger = new HugeInteger();
        String input = "0123456789";
        int[] array = {0,1,2,3,4,5,6,7,8,9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        hugeInteger.parse(input);
        assertEquals(Arrays.toString(array), Arrays.toString(hugeInteger.getArray()));
    }
    @Test
    public void testThatHugeIntegerIsEqualToOne(){
        HugeInteger hugeInteger = new HugeInteger();
        String input = "0123456789111";
        int[] array = {0,1,2,3,4,5,6,7,8,9,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        hugeInteger.parse(input);
        assertEquals(Arrays.toString(array), Arrays.toString(hugeInteger.getArray()));
    }
    @Test
    public void testToString(){
        HugeInteger hugeInteger = new HugeInteger();
        String input = "0123456789111";
        hugeInteger.parse(input);
        String result = "0123456789111000000000000000000000000000";
        assertEquals(result,hugeInteger.toString());
    }
    @Test
    public void testThatICanAdd(){
        HugeInteger hugeInteger = new HugeInteger();
        String input = "0123456789111";
        hugeInteger.parse(input);
        HugeInteger hugeInteger2 = new HugeInteger();
        String input2 = "0123456789111";
        hugeInteger2.parse(input2);
        //hugeInteger.add(hugeInteger2);
        String result = "0246913578222000000000000000000000000000";
        assertEquals(result, hugeInteger.add(hugeInteger2));
    }

    @Test
    public void testThatICanAddBiggerValues(){
        HugeInteger hugeInteger = new HugeInteger();
        String input = "5454564684456454684646454545";
        hugeInteger.parse(input);
        HugeInteger hugeInteger2 = new HugeInteger();
        String input2 = "4256456484464684864864864864";
        hugeInteger2.parse(input2);
        //hugeInteger.add(hugeInteger2);
        String result = "9711021168921139549511319409000000000000";
        assertEquals(result, hugeInteger.add(hugeInteger2));
    }

    @Test
    public void testThatWHenISubtractBetweenBothHugeIntegerObjectItEqualsExpectedResult(){
        HugeInteger hugeInteger = new HugeInteger();
        HugeInteger hugeInteger1 = new HugeInteger();
        String input1 = "56454210032311316797946498748";
        String input2 = "34664864678464621214565587864";
//        String input1 = "2345678546343213";
//        String input2 = "1676543256541328";
        hugeInteger.parse(input1);
        hugeInteger1.parse(input2);

        String result = "2178934535384669558338091088400000000000";
        assertEquals(result, hugeInteger.subtract(hugeInteger1));
    }
    @Test
    public void testThat2ObjectValueIsEqualToSameValue(){
        HugeInteger hugeInteger = new HugeInteger();
        String input = "5664325143463788300000000000000000000000";
        hugeInteger.parse(input);
        HugeInteger hugeInteger2 = new HugeInteger();
        String input2 = "7654896543732245600000000000000000000000";
        hugeInteger2.parse(input2);
        boolean result = hugeInteger.isEquals(hugeInteger2);
        assertFalse(result);
    }
    @Test
    public void testThat2ObjectValueIsNotEqualToSameValue(){
        HugeInteger hugeInteger = new HugeInteger();
        HugeInteger hugeInteger1 = new HugeInteger();
        String argPassed = "5664325143463788300000000000000000000000";
        String input2 = "5664325143463788300000000000000000000000";
        hugeInteger.parse(argPassed);
        hugeInteger1.parse(input2);
        assertTrue(hugeInteger.isEquals(hugeInteger1));
    }
    @Test
    public void itThrowsAn_ErrorWhenThereIsNoDigitsInTheInputs(){
        HugeInteger hugeInteger = new HugeInteger();
        assertThrows(NumberFormatException.class, ()->
                hugeInteger.parse("566432514346378EWQ8300000000000000"));
        try {
            hugeInteger.parse("566432514346378EWQ8300000000000000");
        }catch (Exception e){
            assertEquals(NumberFormatException.class, e.getClass());
            assertEquals("Contains Alphabets", e.getMessage());
        }
    }
    @Test
    public void inputLength_ShouldNotBe_MoreThan40(){
        HugeInteger hugeInteger = new HugeInteger();
        String input = "56643251434637883000000000000000000000005664325143463788300000000000000000000000";
        assertThrows(IllegalArgumentException.class, ()-> hugeInteger.parse(input));
    }
}