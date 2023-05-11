import java.util.Arrays;

public class ArrayMinMax {

    public static void main(String[] args) {
        int[] array1 = new int[]{5, 9, 5, 8};
        getLargestSmallestFromArray(array1);
    }
    public static String getLargestSmallestFromArray(int[] array1){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int[] newArray = new int[2];
        int length = array1.length;
        for(int i =0; i<length; i++){
            if(array1[i] > largest){
                largest = array1[i];
            }
            if(array1[i]<smallest){
                smallest = array1[i];
            }
            newArray[0] = largest;
            newArray[1] = smallest;
        }
        System.out.println(Arrays.toString(newArray));
        return Arrays.toString(newArray);

    }
}
