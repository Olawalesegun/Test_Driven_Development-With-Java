package DataStructuresAndAlgorithm;

public class MyStack {
    private boolean isEmpty = true;
    private int counter;
    private String[] elements;
    public MyStack(int sizeOfStack) {
        elements = new String[sizeOfStack];
    }

    public boolean isEmpty() {
        if(counter == 0) return true;
        return false;
    }

    public void push(String element) {
        elements[counter] = element;
        counter++;
    }

    public String pop() {
       counter--;
       return elements[counter];
    }
}
