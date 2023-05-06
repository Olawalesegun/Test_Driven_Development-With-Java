import java.util.Arrays;

public class ArraySamples {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[2] = 20;
        System.out.println(array);
        System.out.println(toString(array));
        //  using the array in built function Arrays.toString to print
        array[2] = 30;
        System.out.println(Arrays.toString(array));
    }

    private static String toString(int[] array){
        String arrayRepresentation = "[";
        for(int index=0; index<array.length; index++){
            if(index != array.length -1) arrayRepresentation += array[index] + ",";
            else arrayRepresentation += array[index];

        }
        arrayRepresentation += "]";
        return arrayRepresentation;
    }
}
