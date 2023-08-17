package practice;

import java.util.Scanner;

public class Thread1 extends Thread{
    Scanner scan = new Scanner(System.in);
    @Override
    public void run(){
        print();
    }
    public void print(){
        System.out.println("FIrst Thread runs");
        System.out.println("Enter your account Number");
        String accNo = scan.next();
        System.out.println("Enter your account password");
        String password = scan.next();
        System.out.println("First Thread ends.");
    }
}

