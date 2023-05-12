import java.util.Arrays;

public class dimArray {

    /*7.11
    Write statements that perform the following one-dimensional-array operations:
    a) Set elements of index 10–20, both inclusive, of integer array counts to zero.
    b) Multiply each of the twenty elements of integer array bonus by 2.
    c) Display the ten values of integer array bestScores, each on a new line.*/

    public static void main(String[] args) {
        int[] arraySecondCollection = new int[20];
        dimArray.setElement(arraySecondCollection);
        arraySecondCollection = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 5, 8, 9, 5, 3, 2, 5, 6};
        multiplyElement(arraySecondCollection);
        display10ValuesOfAnArray(arraySecondCollection);
    }
    public static int[] setElement(int[] array) {
        int conditionIndex = 10;
        int conditionTerms = 20;
        for (int count = conditionIndex; count <conditionTerms; count++) array[count] = 0;
        System.out.println(Arrays.toString(array));
        return Arrays.copyOf(array, array.length);
    }
    public static int[] multiplyElement(int[] array){
        int conditionTerms = 20;
        for(int count= 0; count<conditionTerms; count++){
            array[count] = array[count] * 2;
        }
        return Arrays.copyOf(array, array.length);
    }
    public static void display10ValuesOfAnArray(int[] array){
        int conditionTerms = 10;
        for(int count = 0; count<conditionTerms; count++){
            System.out.println(array[0]);
        }
    }
    public static void setElement2(int[] array1) {
        for (int count = 0; count < array1.length; count++) {
            if (count > 10 && count < 20) {
                array1[count] = 0;
            }
            array1[count] *= 2;
            if (count <= 10) {
                System.out.println(array1[count]);
            }
        }
    }
}

