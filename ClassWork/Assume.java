public class Assume {
    private int firstParameter;
    private int secondParameter;
    private int total;
    public void setParametersToMultiply(int firstParameter, int secondParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;

        total = 0;
        if(firstParameter > 0 && secondParameter > 0){
            for(int count= 0; count<secondParameter; count++) {
                total += firstParameter;
            }
        }
        else if(firstParameter<0 && secondParameter<0){
            secondParameter = Math.abs(secondParameter);
            firstParameter = Math.abs(firstParameter);
            for(int count= 0; count<secondParameter; count++) {
                total += firstParameter;
            }
        }
        else if((firstParameter > 0 && secondParameter < 0) || (firstParameter < 0 && secondParameter > 0)){
            secondParameter = Math.abs(secondParameter);
            firstParameter = Math.abs(firstParameter);
            for(int count= 0; count<secondParameter; count++){
                total += firstParameter;
            }
            total = -total;
        }
    }
//    public void doTheMaths(){
//
//    }

    public int getMultiplicationOfParametersEntered() {
        return total;
    }

    // Asuming  there's no multiply and no maths class, multiply the 2 number
}
