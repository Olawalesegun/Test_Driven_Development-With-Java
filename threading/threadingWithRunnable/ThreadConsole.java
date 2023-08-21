package threadingWithRunnable;

public class ThreadConsole {

    public static void main(String[] args) {

        try{
            Thread1 thr = new Thread1();

            Thread thread1 = new Thread(thr);
            Thread thread2 = new Thread(thr);
            Thread thread3 = new Thread(thr);

            thread1.setName("April");
            thread2.setName("May");
            thread3.setName("June");
            if("April".equals(thread1.getName())){

            }

            thread1.start();

            thread2.start();
            thread3.start();

        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }

    }
}
