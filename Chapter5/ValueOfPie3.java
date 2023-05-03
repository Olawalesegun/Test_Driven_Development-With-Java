public class ValueOfPie3 {
    public static void main(String[] args) {
        double pi = 4.0;
        double denominator = 3.0;
        boolean positive = false;
        int terms = 200000;
        int count = 0;
        System.out.println("Terms\tValue of π");
        for (int i = 1; i <= terms; i++) {
            if (positive) {
                pi += 4.0/denominator;
            } else {
                pi -= 4.0/denominator;
            }
            denominator += 2.0;
            positive = !positive;
            if (String.format("%.5f", pi).startsWith("3.14159")) {
                count = i;
            }
            if (i % 1000 == 0) {
                System.out.println(i + "\t" + pi);
            }
        }
        System.out.println("Terms needed for first value starting with 3.14159: " + count);
    }
}
