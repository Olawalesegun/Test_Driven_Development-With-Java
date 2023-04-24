public class FourPatternPrint {
    public static void main(String[] args) {
        printPattern();
    }
    public static void printPattern(){
        int loopCondition = 4;
        int loop2Condition = 10;
        for(int loop=1; loop<=loopCondition; loop++){
            for(int loop2=1; loop2<=loop2Condition; loop2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
