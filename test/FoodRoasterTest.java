import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FoodRoasterTest {
    @Test
    public void createEnumTest() {
        FoodRoaster roaster = FoodRoaster.MONDAY;
        FoodRoaster secondRoaster = FoodRoaster.MONDAY;
        var roosters = FoodRoaster.values();
        for (var day : roosters) System.out.println(day.name() + " " + Arrays.toString((day.getFood())));

    }
}





