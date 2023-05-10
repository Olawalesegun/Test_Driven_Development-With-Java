import java.util.Arrays;
public class ArrayPrcatice {

    public static void main(String[] args) {
        int[] numbers = new int[50];
        arrayEntries(numbers);
    }
    public static void arrayEntries(int[] arrayNames){
        int length = arrayNames.length;
         for(int count=0; count<length; count++){
             arrayNames[count] = 5;
         }
        System.out.println(Arrays.toString(arrayNames));
         for(int i: arrayNames){
             arrayNames[i] = 5;
         }
        System.out.println(Arrays.toString(arrayNames));

         //DIFFERENT WAYS TO DECLARE AND INITIALIZE?INSTANTIATE AN ARRAY OBJECT
       /*
        int [] arrayCollect = {1,2,3,4,5};
        int[] array1 = new int[5];
        int[] array2 = new int[] {1, 2, 3,4, 5};
        */
    }
}
