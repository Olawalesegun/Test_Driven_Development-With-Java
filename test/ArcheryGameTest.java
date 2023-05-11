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
    public void testArchMethod(){
        int[][] archGame = {
                {1,2,3,},
                {7,8,9},
                {7,2,1},
                {6,4,3}
        };
        int result = archeryGame.playerIndex(archGame);
        assertEquals(50, result);
    }
}