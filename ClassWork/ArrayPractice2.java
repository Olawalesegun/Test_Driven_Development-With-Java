import java.util.Scanner;
import java.util.Arrays;
public class ArrayPractice2 {

    public static void main(String[] args) {
        arrayPrac();
    }
    public static String arrayPrac(){
        Scanner scan = new Scanner(System.in);
        int[] arraySum1 = new int[5];
        //int arraySum;
        int collect;
        int total = 0;
        int numberCount = 5;
        for(int count=0; count<numberCount; count++){
            System.out.println("Enter 5 numbers: ");
            collect = scan.nextInt();
            arraySum1[count] = collect;
            arraySum1[count] = arraySum1[count];
            total += arraySum1[count];
        }
        System.out.println(Arrays.toString(arraySum1));
        System.out.println("Total is: " + total);
        return Arrays.toString(arraySum1);




    }
}
