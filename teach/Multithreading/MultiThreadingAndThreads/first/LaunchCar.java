package Multithreading.MultiThreadingAndThreads.first;

public class LaunchCar {
    public static void main(String[] args)
    {
        Car c=new Car();

        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);

        t1.setName("Child1");
        t2.setName("Child2");
        t3.setName("Child3");

        t1.start();

        t2.start();
        t3.start();

    }

}
