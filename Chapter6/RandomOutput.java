import java.util.Random;
import java.security.SecureRandom;
public class RandomOutput {
    /*
    Write statements that will display a random number from each of the following sets:
    a) 0, 3, 6, 9, 12.
    b) 1, 2, 4, 8, 16, 32.
    c) 10, 20, 30, 40.
    */
    public static void main(String[] args) {
        int[] arrayValues = {6, 7,8,9};
        RandomOutput.findrandomNumber(arrayValues);
        System.out.println("==================================");
        int[] arrayValues2 = {1, 2, 4, 8, 16, 32};
        RandomOutput.findSecuredRandomNumber(arrayValues2);
    }
    public static int findrandomNumber(int[] arrayFirstSet){
        Random randomNum = new Random();
        int arrayIndexCount = arrayFirstSet.length;
        int randomDeclaration = randomNum.nextInt(arrayIndexCount);
        int collectedNumFromArray = arrayFirstSet[randomDeclaration];
        System.out.println("The random number generated is: " + collectedNumFromArray);
        return collectedNumFromArray;
    }

    public static int findSecuredRandomNumber(int[] arrayPassedIntoTheMethod){
        SecureRandom secRan = new SecureRandom();
        int arrayLength = arrayPassedIntoTheMethod.length;
        int randomLengthDefined = secRan.nextInt(arrayLength);
        int randomNumberCollected = arrayPassedIntoTheMethod[randomLengthDefined];
        System.out.println("The secured random number generated is: " + randomNumberCollected);
        return randomNumberCollected;
    }
}
