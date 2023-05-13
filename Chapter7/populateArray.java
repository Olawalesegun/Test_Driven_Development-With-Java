import java.util.Arrays;

public class populateArray {
    private static final int ZERO = 0;
    public static void main(String[] args) {
        int[][] arr = new int[5][];
        arr[ZERO] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[10];
        arr[3] = new int[]{400, 500};

        int[] firstRow = arr[ZERO];
        int lengthOfFirstRow = firstRow.length;
        for(int index = ZERO; index<lengthOfFirstRow; index++)
            populateFirstRow(firstRow, index);

        System.out.println(Arrays.deepToString(arr));

        arr[4] = new int [5];
        int[] lastRow = arr[4];
        int lengthOfLastRow = lastRow.length;
        for(int index=0; index<lengthOfLastRow; index++){
            populateLastRow(lastRow, index);
        }
        System.out.println(Arrays.deepToString(arr));
    }

    public static void populateArray(int[] array){
        for(int index = ZERO; index<array.length; index++){
            array[index] = index;
        }
    }
    public static void populateFirstRow(int[] firstRow, int index){
        firstRow[index] = index;
    }
    public static void populateLastRow(int[] lastRow, int index){
        lastRow[index] = (index+1) * 100;

    }

}
