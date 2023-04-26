public class ClockClass {

    private int hour;
    private  int minute;
    private int second;

    public ClockClass(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
   /* public static void main(String[] args) {
        ClockClass clock = new ClockClass(30, 20, 10);

    }*/

    public void setHour(int hour){
        this.hour = hour;

    }
    public int  getHour(){
        int condition = 23;
        if(hour>condition) hour = 0;
        return hour;
    }
    public void setMinute(int minute){
        this.minute = minute;

    }
    public int getMinute(){
        int condition = 59;
        if(minute>condition) minute = 0;
        return minute;
    }
    public  void setSecond(int second){
        this.second = second;
    }
    public int getSecond(){
        int condition = 59;
        if(second>condition) second = 0;
        return second;
    }
    public String displayTime(){
        int hour = getHour();
        int minute = getMinute();
        int second = getSecond();
        /*System.out.println(getHour()+':'+ getMinute() + ':' + getSecond());*/
        return hour + ":" + minute + ":" + second ;
    }
}
