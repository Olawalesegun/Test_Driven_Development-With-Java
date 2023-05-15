import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ArrayElementPresenceTest {
    ArrayElementPresence check;

    @BeforeEach
    void setUp() {
        check = new ArrayElementPresence();
    }
    @Test
    public void testConstructorPresence(){
        assertNotNull(check);
    }

    @Test
    public void testElementPresenceInArray(){
        int[] arrayUsedForTesting = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        check.collectArray(arrayUsedForTesting);
        check.mutateArrayStateWithArrayCollected();
        check.checkElementInArray(9);
        String status = check.returnStatusForElementEnteredWhenCheckedInArray();
        String expected = "Element Entered is present";

        assertEquals(expected, status);
    }
    @Test
    public void testElementPresenceInArray2(){
        int[] arrayUsedForTesting = {1, 2, 3, 4, -5, 6, -7, -8, -9};
        check.collectArray(arrayUsedForTesting);
        check.mutateArrayStateWithArrayCollected();
        check.checkElementInArray(6);
        String status = check.returnStatusForElementEnteredWhenCheckedInArray();
        String expected = "Element Entered is present";
        assertEquals(expected, status);
    }

    @Test
    public void testElementPresenceInArray3(){
        int[] arrayUsedForTesting = {1, 2, 3, -4, -5, 6, 7, 8, -9};
        check.collectArray(arrayUsedForTesting);
        check.mutateArrayStateWithArrayCollected();
        check.checkElementInArray(9);
        String status = check.returnStatusForElementEnteredWhenCheckedInArray();
        String expected = "Element Entered is present";

        assertEquals(expected, status);
    }

}