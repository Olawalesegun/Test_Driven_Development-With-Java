import java.util.Arrays;
import java.util.Scanner;


public class DataEncryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four digit integer: ");
        String input =  scanner.nextLine();
        //System.out.println("encrypted data -----> " + collectUs(input));
        collectUs(input);
        String collectReturnUsedAsInput = DataEncryption.collectUs(input);
        DataEncryption.decrypt(collectReturnUsedAsInput);
    }

    public static String collectUs(String input){
        int[] indexCollected = new int[4];
        int[] encodedInt = new int[4];
        int swap;
        String swapped;
        swapped = "nothing";
        /* confirming the length on the input to be 4 */
        if(input.length() == 4){
            // convert input to integer
            for(int counter = 0; counter<input.length(); counter++ ){
                indexCollected[counter] = (int)input.charAt(counter) - '0';
                System.out.print(indexCollected[counter]);
                System.out.println();
            }

            // encrypting the converted index collected from above (Strings to Integer)
            for(int counter2=0; counter2<indexCollected.length; counter2++){
                encodedInt[counter2] = (indexCollected[counter2] + 7) % 10;
                System.out.print(encodedInt[counter2]);
            }
            //Swapping the first digit with the values of the third
            //Swap the second digit with the value of the forth.
            swap = encodedInt[0];
            System.out.println("Swap value " + swap);
            System.out.println(swap);
            encodedInt[0] = encodedInt[2];
            encodedInt[2] = swap;
            swap = encodedInt[1];
            System.out.println("Swap value " + swap);
            encodedInt[1] = encodedInt[3];
            encodedInt[3] = swap;
            System.out.println();
            //System.out.println();

            swapped = encodedInt[0] + "" + encodedInt[1] + "" + encodedInt[2] + "" +
                    encodedInt[3];
            System.out.println("The final stuff is " + swapped);
        }
        else{
            System.out.println("Do the needful my Guy");
        }



       // String array = Arrays.toString(encodedInt);
        // return result of encryption
        return swapped;
    }

    public static String decrypt(String input){
        String returnDecrypt = "nothingYet";
        if(input.length() == 4){
            int[] collect = new int[4];
            int[] decryptValue = new int[4];
            for(int count = 0; count<input.length(); count++){
               collect[count] = (int)input.charAt(count) - '0';
               decryptValue[count] = (collect[count] + 10) - 7;
            }

            returnDecrypt = decryptValue[0] + "" + decryptValue[1] + "" + decryptValue[2] +
                    "" + decryptValue[3];
        }
        else{
            System.out.println("My Friend, you must do the needful, by entering the required length");
        }
        return returnDecrypt;
    }
}