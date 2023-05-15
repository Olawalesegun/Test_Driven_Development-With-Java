import org.junit.Test;
import static org.junit.Assert.*;

public class RevTest {

    @Test
    public void testReverseArray() {
        Rev reverseArray = new Rev();
        int[] originalArray = {1, 2, 3, 4, 5};
        reverseArray.setArray(originalArray);
        reverseArray.reverseArray();
        int[] actualReversedArray = reverseArray.collectReverseArray();
        int[] expectedReversedArray = {5, 4, 3, 2, 1};
        assertArrayEquals(expectedReversedArray, actualReversedArray);
    }
}
