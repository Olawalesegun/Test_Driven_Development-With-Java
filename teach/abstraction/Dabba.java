package inheritance;

public abstract class Dabba {

    // if a class contains an abstract method or methods, then the class must be declared to be an
    // abstract class using the abstract keyword, without declaring it as an abstrct class it would be an issue

    // Also, an abstract class can contain concrete methods, this means every class that inherits/extends it
    // will inherit the concrete method, and have its implementation automatically.

    public void sleep(){

    }
    // if the class is not an abstract class this method won't work as an abstract method
    public abstract void eat();
}
