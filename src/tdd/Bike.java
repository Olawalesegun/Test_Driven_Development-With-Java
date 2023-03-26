package tdd;

public class Bike {
    private boolean bikeIsOn;
    public void isOn(boolean bikeIsOn){
        if(bikeIsOn == true){
            bikeIsOn = true;
        }
        else{
            bikeIsOn = false;
        }
    }
    public boolean getIsOn(){
        return bikeIsOn;
    }
    public void isOff(boolean bikeIsOff){
        if(bikeIsOn == false) bikeIsOn = false;
    }
    public boolean getIsOff(){
        return bikeIsOn;
    }
}
