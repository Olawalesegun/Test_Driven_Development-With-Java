package tdd;

public class TestDrillerUtme {
    private int amountPerCopy;
    int iteratingNumber;
    public int checkForCopies(int copyNumber){
        //for(iteratingNumber= 0; iteratingNumber <= copyNumber )
        if((copyNumber <= 4) && (copyNumber>=0)){
            amountPerCopy = 2000;
            for (iteratingNumber = 1; iteratingNumber <= 1; iteratingNumber++) {
                amountPerCopy *= copyNumber;
            }
        }
        else if((copyNumber >= 5) && (copyNumber <= 9)){
            amountPerCopy = 1800;
            for(iteratingNumber = 1; iteratingNumber<=1; iteratingNumber++){
                amountPerCopy *= copyNumber;
            }
        }
        else if((copyNumber>=10) && (copyNumber<=29)){
            amountPerCopy = 1600;
            for(iteratingNumber = 1; iteratingNumber<=1; iteratingNumber++){
                amountPerCopy *= copyNumber;
            }
        }
        else if((copyNumber>=30) && (copyNumber<=49)){
            amountPerCopy = 1500;
            for(iteratingNumber = 1; iteratingNumber<=1; iteratingNumber++){
                amountPerCopy *= copyNumber;
            }
        }
        else if((copyNumber>=50) && (copyNumber<=99)){
            amountPerCopy = 1300;
            for(iteratingNumber = 1; iteratingNumber<=1; iteratingNumber++){
                amountPerCopy *= copyNumber;
            }
        }
        else if((copyNumber>=100) && (copyNumber<=199)){
            amountPerCopy = 1200;
            for(iteratingNumber = 1; iteratingNumber<=1; iteratingNumber++){
                amountPerCopy *= copyNumber;
            }
        }
        else if((copyNumber>=200) && (copyNumber<=499)){
            amountPerCopy = 1100;
            for(iteratingNumber = 1; iteratingNumber<=1; iteratingNumber++){
                amountPerCopy *= copyNumber;
            }
        }
        else if((copyNumber==500) || (copyNumber > 500)){
            amountPerCopy = 1000;
            for(iteratingNumber = 1; iteratingNumber<=1; iteratingNumber++){
                amountPerCopy *= copyNumber;
            }
        }
        else if(copyNumber<0) {
            System.out.println("Stop Playing my friend, input a copy within the category stated");
        }
        return amountPerCopy;
    }


}
