public class TrianglePattern {
    public static void main(String[] args){
        leftTrianglePattern();
        System.out.println();
        upsideLeftTrianglePattern();
        System.out.println();
        upsideRightTrianglePattern();
        rightTrianglePattern();
    }

    public static void leftTrianglePattern(){
        int condition = 10;
        for(int loopCount1=1; loopCount1<=condition; loopCount1++){
            for(int loopCount2=1; loopCount2<=loopCount1; loopCount2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void upsideLeftTrianglePattern(){
        int condition = 10;
        for(int loopCount = 1; loopCount<condition; loopCount++){
            for(int loopCount2=condition; loopCount2>loopCount; loopCount2--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void upsideRightTrianglePattern(){
        int conditionForLoop = 10;
        for(int loop1=1; loop1<=conditionForLoop; loop1++){
            for(int loop2=conditionForLoop; loop2>=loop1 ; loop2--){
                System.out.print("*");
            }
            System.out.println();
            for(int loop3=0; loop3<loop1; loop3++){
                System.out.print(" ");
            }
        }
    }
    public static void rightTrianglePattern(){
        int conditionForLoop=10;
        for(int loop1=1; loop1<=conditionForLoop; loop1++){
            for(int loop2=conditionForLoop; loop2>=loop1; loop2--){
                System.out.print(" ");
            }
            for(int loop3=0; loop3<loop1; loop3++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
