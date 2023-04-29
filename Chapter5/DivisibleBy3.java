public class DivisibleBy3 {

   /* 5.12 (Integers Divisible by 3) Write an application that calculates the sum of those integers between
    1 and 30 that are divisible by 3.*/
   public static void main(String[] args) {
       DivisibleBy3 divb3 = new DivisibleBy3();
       divb3.divideBy3();
   }
    public int divideBy3(){
        int total=0;
        for(int count=1; count<30; count++){
            if(count%3 == 0){
                total = total + count;
            }
        }
        System.out.println("The total is: " + total);
        return total;
    }
}
