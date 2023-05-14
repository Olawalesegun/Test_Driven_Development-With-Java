import org.junit.Test;
import static org.junit.Assert.*;

public class RevTest {

    @Test
    public void testReverseArray() {
        ReverseArray reverseArray = new ReverseArray();
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] expectedReversedArray = {5, 4, 3, 2, 1};
        reverseArray.setArray(originalArray);
        reverseArray.reverseArray();
        int[] actualReversedArray = reverseArray.collectReverseArray();
        assertArrayEquals(expectedReversedArray, actualReversedArray);
    }
}
