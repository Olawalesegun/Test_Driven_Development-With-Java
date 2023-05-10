public class ArrayExceptionHandling {

    public static void main(String[] args) {
        tryAndCatch();
    }
    public static void tryAndCatch(){
        try{
            int[] arr = {2,5,6,7,8};
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Kindly enter waht is expected o you before something do you");
        }


    }
}
