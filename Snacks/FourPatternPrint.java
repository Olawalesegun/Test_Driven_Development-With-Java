public class FourPatternPrint {
    public static void main(String[] args) {
        printPattern();
        printPattern2();
        printPattern3();
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

    public static void printPattern2() {
        int loopCondition = 5;
        for(int loop1=1; loop1<=loopCondition; loop1++){
            for (int loop2=0; loop2<loop1; loop2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern3(){
        int loopCondition = 5;
        for(int loop1=1; loop1<=loopCondition; loop1++){
            for(int loop2=loop1; loop2<loopCondition; loop2++){
                System.out.print(" ");
            }
            for(int loop3=0; loop3<loop1; loop3++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
