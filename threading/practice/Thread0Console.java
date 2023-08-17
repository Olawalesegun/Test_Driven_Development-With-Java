package practice;

public class Thread0Console {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread starts now");
        Thread0 thr = new Thread0();

        Thread tr = new Thread(thr);
        Thread tr2 = new Thread(thr);
        Thread tr3 = new Thread(thr);

        tr.setName("FIRST");
        tr2.setName("SECOND");
        tr3.setName("THIRD");

        tr.start();
        tr2.start();
        tr3.start();

        tr.join();
        tr2.join();
        tr3.join();

        System.out.println("Main Thread ends now!!!");
    }
}
