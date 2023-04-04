public class Looping {
    public static void main(String[] args){
        int num;
        for(num=1; num<=100; num++){
            if(num%3 == 0 && num%5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(num%5 == 0){
                System.out.println("Buzz");
            }
            else if(num%3 == 0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(num);
            }
        }

        // Printing ****** as in 1,2,3,4,5

        int col;
        for(col=0; col<5; col++){
            int row;
            for(row=0; row<=col; row++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Print ** as in rectangle
        int row2;
        for(row2=0; row2<4; row2++){
            int col2;
            for(col2=0; col2<4; col2++){
               if((row2==1 && col2==1) && (row2 == 1 && col==2) ||
                       (row2== 2 && col2==1) || (row2==1 || row2==2)){
                    System.out.print(" ");
                    System.out.println("*" + " " + "*");
               }
               else{
                    System.out.print("*");
               }
            }
            System.out.println();
        }

        // Print ** as in triangle

      /**  int i;
        for (i = 0; i < 5; i++) {

            int j = 0;
            for (j = 0; j < i; j++) {
                System.out.printf("*");
                while ((i == 1) || (i == 2) || (i == 3)) {
                    while ((j == 1) || (j == 2) || (j == 3)) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }**/

       /** int i;
        for (i = 1; i <= 100; i++) {
            if (((i % 5) == 0) && ((i % 3) == 0)) {
                System.out.println("FizzBUzz");
            } else if ((i % 5) == 0) {
                System.out.println("Buzz");
            } else if {
                ((i % 3) == 0) {
                    System.out.println("Fizz");
                }
                    else{
                    System.out.println(i);
                }
            }**/
    }
}
