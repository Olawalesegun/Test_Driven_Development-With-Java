package inheritance;

public class Dog extends Animal{
    //In abstraction with abstarct keyword,  when we extend an abstarct class
    // we must always give implementation to all methods that are inherited
    // from an abstract class
    public void sleep(){
        System.out.println("Dog is sleeping");
    }

    public void wake(){
        System.out.println("As a Dog, I'm now awake");
    }
}