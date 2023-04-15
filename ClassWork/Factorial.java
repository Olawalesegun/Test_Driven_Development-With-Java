public class Factorial {

    public static int factorialInput(int facNumber){
        int facResult;
            facResult = facNumber;
            /*for(int i= 0; i<facNumber; i++){
               facResult = facResult * (facNumber - 1);
            }*/
            while(facNumber!=1){
                facResult = facResult * (facNumber - 1);
                facNumber--;
            }
            return facResult;
    }
}
