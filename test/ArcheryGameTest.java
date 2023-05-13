import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ArcheryGameTest {
    ArcheryGame archeryGame;

    @BeforeEach
    void setUp() {
        archeryGame = new ArcheryGame();
    }

    @Test
    public void testArchMethod() {
        int[][] archGame = {
                {1, 2, 3,},
                {7, 8, 9},
                {7, 2, 1},
                {6, 4, 3}
        };
       // String result = archeryGame.playerIndex(archGame);
        int[][] myArray = archeryGame.playerIndex(archGame);
        assertEquals(50, myArray);
    }

    @Test
    public void testPlayerIndex() {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = archeryGame.playerIndex(array);
        int[][] expected = {{2, 2, 3}, {4, 5, 1}, {7, 8, 5}};
        assertArrayEquals(expected, result);
    }
}
