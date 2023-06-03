package diaryApp;

import org.jetbrains.annotations.TestOnly;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class DiaryTest {
    @Test
    public void diaryCanBeCreatedTest(){
        Diary olofofo = new Diary("username", "password");
        assertNotNull(olofofo);
    }
    @Test
    public void newDiaryIsLockedByDefaultTest(){
        Diary olofofo = new Diary("username", "password");
        assertTrue(olofofo.isLocked());
    }
    @Test
    public void lockedDiaryCanBeUnlockedTest(){
        Diary olofofo = new Diary("username", "password");
        assertTrue(olofofo.isLocked());
        olofofo.unlockWith("password");
        assertFalse(olofofo.isLocked());
    }
    @Test
    public void lockedDiaryCannotBeUnlockedWithWrongPasswordTest(){
        Diary olofofo = new Diary("username", "password");
        assertTrue(olofofo.isLocked());
        olofofo.unlockWith("wrong password");
        assertTrue(olofofo.isLocked());

    }
    @Test
    public void unlockDiaryCanBeLockedTest(){
        Diary olofofo = new Diary("username", "password");
        olofofo.unlockWith("password");
        assertFalse(olofofo.isLocked());
        olofofo.lock();

        assertTrue(olofofo.isLocked());
    }
    @Test
    public void unlockedDiaryCanCreateGistTest(){
        Diary olofofo = new Diary("username", "password");
        olofofo.unlockWith("password");
        assertFalse(olofofo.isLocked());
        olofofo.addGist("Title", "Body");
        assertEquals(1, olofofo.countGists());
    }
}
