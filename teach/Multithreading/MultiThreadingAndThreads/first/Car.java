package Multithreading.MultiThreadingAndThreads.first;

class Car implements Runnable
{
    public void run()
    {
        try
        {
            System.out.println(Thread.currentThread().getName() + " has entered the parking lot");
            Thread.sleep(3000);
            synchronized(this)
            {
                System.out.println(Thread.currentThread().getName() + " has entered into to the car");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " has started to drive the car");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " came back and parked the car");
            }

        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
    }

}
