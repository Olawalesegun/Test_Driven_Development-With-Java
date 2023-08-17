package practice;

public class Thread3 extends Thread{

    @Override
    public void run(){
        show();
    }
    public void show(){
        System.out.println("Third Thread runs");
        System.out.println("======================");
        System.out.println("No activity");
        System.out.println("Third Thread ends");
    }

}
