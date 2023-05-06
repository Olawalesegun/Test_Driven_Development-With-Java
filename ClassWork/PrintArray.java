import java.util.Arrays;
import java.util.Scanner;
public class PrintArray {

    // write a loop that inserts element into array of size 1-0
    //static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the array size");
        int[] array = {0, 0, 0, 0};
        PrintArray.printArray(array);
    }


    public static int[] printArray(int[] array) {
        int[] collectedArray = new int[array.length];
        for (int countArray = 0; countArray < collectedArray.length; countArray++) {
            collectedArray[countArray] = countArray + 1;
        }
        System.out.println(Arrays.toString(collectedArray));
        return collectedArray;
    }
}

   /* public static String determineLengthOfArray(int number){
        String arrayNum= "[";
        for(int count= number; count>= 0; count--){
            if(arrayNum.length() != 0) arrayNum += count + ",";
            else arrayNum += count;
        }
        arrayNum += "]";
        return arrayNum;
}*/
