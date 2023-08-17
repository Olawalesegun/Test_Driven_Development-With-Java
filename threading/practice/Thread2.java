package practice;

public class Thread2 extends Thread{

    @Override
    public void run(){
        printAlphabet();
    }
    public void printAlphabet(){
        int maxCount = 70;
        System.out.println("Second Thread runs");
        for(int count = 65; count<maxCount; count++){
            System.out.println((char)count);
        }
        System.out.println("Second Thread ends!!!");
    }
}
