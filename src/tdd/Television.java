package tdd;

public class Television {
    private boolean isOn;
    private int volume = 30;
    private int channel = 1;
    public boolean turnOn(){
        return isOn;
    }
    public void toggleOn(){
        if(isOn == true) isOn = false;
        else isOn = true;
    }
    public void setChannel(){
        if((channel >= 1) && (channel <= 99)){
            this.channel = channel;
            channel++;
        }
    }
    public void setDecreasedChannel(){
        if(channel > 1){
            channel--;
        }
    }
    public int changeChannel(){
        return channel;
    }
    public void setIncreaseVolume(){
        volume++;
    }

    public void setDecreaseVolume(){
        if((volume < 100) && (volume > 0)){
            volume--;
        }

    }
    public int getVolume(){
        return volume;
    }
}
