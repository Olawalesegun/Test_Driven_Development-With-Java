public class ForLoop {
    public static void main(String[] args){
        double amount = 1000;
        double interest;
        double interested;
        for(interest=2; interest<9; interest++){
           double pacent =  (amount*(interest/100));
            //interested = amount * interest;

            System.out.printf("The interest between " + amount + "and "+ interest + "is" + pacent);
            System.out.println();
           //while(interest = 8 || interest>=2){
            //    System.out.printf("The interest between " + amount + "and "+ interest + "is" + pacent);
            //    System.out.println();
            //    interest--;
            //}
        }

        /**while(interest == 8 || interest>=2) {
            double pacent = (amount * (interest / 100));
            System.out.printf("The interest between " + amount + "and " + interest + "is" + pacent);
            System.out.println();
            interest--;
        }**/

       for(interest=8; interest>=2; interest--){
            double pacent =  (amount*(interest/100));
            System.out.printf("The interest between " + amount + "and "+ interest + "is" + " "+pacent);
            System.out.println();
        }
    }
    /**public static double calcu(double amount, double interestCount){
        for(interestCount=2; interestCount<9; interestCount++){
            double pacent = (double) interest/100;
            interested = amount * pacent;

            System.out.printf("The interest between " + amount + "and "+ interest + "is" + interested);
            System.out.println();
        }
        return amount * interest;
    }**/
}
