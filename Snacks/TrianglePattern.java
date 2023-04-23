public class TrianglePattern {
    public static void main(String[] args){
        leftTrianglePattern();
        System.out.println();
        upsideLeftTrianglePattern();
        System.out.println();
        upsideRightTrianglePattern();
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
        int condition = 10;
        int loop2;
        for(int loopCount=1; loopCount<=condition; loopCount++){
            for(loop2=loopCount; loop2<=condition; loop2++){
                System.out.print("*");
            }
            System.out.println();
         //   for(int i= 1; i<condition; i++){
          //     for(j = 1; ) System.out.print(" ");
            }
        }
    }
