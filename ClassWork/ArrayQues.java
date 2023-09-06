import java.util.ArrayList;

public class ArrayQues {

    // write a method that takes in an array and returns an array double it size
    private int[] arrayUsed;
    private boolean validateArray;
    public void takeInArray(int[] array1) {
            if (validateArrayLength(array1)) {
                arrayUsed = new int[array1.length * 2];
                for (int count = 0; count < array1.length; count++) {
                    arrayUsed[count] = array1[count];
                }
            }
            else{
                System.out.println("Kindly input a value with more than one character!!");
            }
    }
    public int[] doubledArrayReturned(){
        return arrayUsed;
    }
    public boolean validateArrayLength(int[] array){
         validateArray = array.length > 1 ? true : false;
         return validateArray;
    }


}