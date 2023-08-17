package practice;

public class ThreadConsole {

    public static void main(String[] args) {
        try{
            System.out.println("Main Method commence running");
            Thread1 thr = new Thread1();
            Thread2 thr2 = new Thread2();
            Thread3 thr3 = new Thread3();
            Thread tr = Thread.currentThread();
            System.out.println(tr.getName());
            Thread.sleep(4000);
            System.out.println(tr.getPriority());

            thr.start();
            thr2.start();
            thr3.start();
            System.out.println("Main Method ends");
           /* thr.print();
            tr.run();*/
        }catch(InterruptedException e){
            e.printStackTrace();
        }


    }
}
