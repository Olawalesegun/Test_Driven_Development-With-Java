package practice;

public class Thread0 implements Runnable{

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if(threadName.equals("FIRST")){
            printSomething();
        } else if (threadName.equals("SECOND")) {
            playGame();
        }else{
            sayIt();
        }
    }

    public void printSomething(){
        System.out.println("First Method in");
        System.out.println("===================");
        for (int count=7; count<13; count++){
            System.out.println(count + "00");
        }
        System.out.println("First Method ends");
    }

    public void playGame(){
        System.out.println("Second Method in");
        for(int count=0; count<12; count++){
            System.out.println(count + "*" + count + 1 + "=" + count * (count + 1));
        }
        System.out.println("Second Method ends");
    }

    public void sayIt(){
        System.out.println("Third Method in");
        System.out.println("*****************");
        System.out.println("Hi!! I'm learning How to Thread carefully.");
    }
}
