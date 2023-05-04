public class Static {
    public static int myStaticVariable = 5;
    public int myInstanceVariable = 5;

    public Static() {
        myStaticVariable++;
        myInstanceVariable++;
    }

    public static void main(String[] args) {
        Static obj1 = new Static();
        Static obj2 = new Static();

        System.out.println("obj1 instance variable value: " + obj1.myInstanceVariable);
        System.out.println("obj2 instance variable value: " + obj2.myInstanceVariable);
        System.out.println("obj2 instance variable value: " + obj2.myInstanceVariable);
        System.out.println("obj1 instance variable value: " + obj1.myInstanceVariable);
        System.out.println("Static variable value: " + Static.myStaticVariable);
        //System.out.println("Static variable value: " + Static.myStaticVariable);
    }
}