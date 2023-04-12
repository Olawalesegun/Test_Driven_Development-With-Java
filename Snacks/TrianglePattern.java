public class TrianglePattern {
    public static void main(String[] args){
        trianglePatterPrint();
    }

    public static void trianglePatterPrint(){
        int condition = 10;
        for(int loopCount1=1; loopCount1<=condition; loopCount1++){
            for(int loopCount2=1; loopCount2<=loopCount1; loopCount2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
