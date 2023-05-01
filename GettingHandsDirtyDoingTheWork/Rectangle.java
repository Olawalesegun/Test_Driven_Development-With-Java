public class Rectangle {
    private int length;
    private int width;

    public Rectangle setLength(int length) {
        this.length = length;
        return this;
    }

    public Rectangle setWidth(int width) {
        this.width = width;
        return this;
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.setLength(5).setWidth(2).calculateRectangle();
    }

    public Rectangle calculateRectangle() {
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println(perimeter);
        return this;
    }


    //  Reasons why we need Method Chaining:
    //      1. Fluent API Design
    //      2. Code Re-usability
    //      3. Code Maintainability
    //      4. Reliability
}







/*
    public Rectangle calculateRectangle(int length, int width) {
        int area = length * width;
        int perimeter = 2 * (length + width);
        return perimeter;
    }
*/