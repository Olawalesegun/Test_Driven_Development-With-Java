package tdd;

public class AirConditioner {
    //public void getDecreaseTemperature;
    private boolean isOnV;
    private String productName;
    private int temperature = 15;

    public int decreaseTemperature(int temperature) {
        this.temperature = temperature;
       // temperature--;
        if (temperature >= 16 | temperature < 30){
            temperature--;
            //System.out.println("Invalid input");
            // temperature -= 1;
        }
        else System.out.println("Input a number greater than 16 and less than 30");
        return temperature;
    }
    public int setTemperature(){
      return temperature++;

    }

    public int getTemperature(){
        return temperature;
    }



    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public void setOn(boolean isOnV){
        this.isOnV = isOnV;
       // if(isOnV == true) isOnV = true;
    }
    public boolean isOn(){
        if(isOnV == true) return true;
        else return false;
    }
}
