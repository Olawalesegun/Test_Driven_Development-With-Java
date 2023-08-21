package threadingWithRunnable;

import java.util.Scanner;

public class Thread1 implements Runnable{

    Scanner scan = new Scanner(System.in);
    private String name;
    @Override
    synchronized public void run() {
        setName();
        displayName();
    }

    public void setName(){
        System.out.println("Enter Name: ");
        name = scan.nextLine();
    }
    public String convertName(){
        int lengthOfName= name.length();
        int[] collected = new int[lengthOfName];
        //int i = 0;
        String output = "";
        try{
            for(int counter=0; counter<=lengthOfName; counter++){
                collected[counter] = Integer.parseInt(String.valueOf(name.charAt(counter)));
                // i++;
            }
            for(int j=0; j<=collected.length; j++){
                output += collected[j];
            }
        }catch(Exception e){
            System.out.println("This is the " + e.getMessage());
        }
        return output;
    }
    public void loopThrough(){
       /* Hello Lunawolves, good to have you in here Mate.
        Kindly do take note that the released date will be announced in the #📢｜announcement .
                As of now, there is no official released date,
                but this will be announced as at when due. However you can read more about the*/
    }

    public void displayName(){
        System.out.println("The name is: " + getClass().getName() + " "+
                Thread.currentThread().getName() + " "+name);
        System.out.print(convertName());
    }
}
