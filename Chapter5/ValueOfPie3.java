public class ValueOfPie3 {
    public static void main(String[] args) {
        double pi = 4.0;
        double denominator = 3.0;
        boolean positive = false;
        int termsForLoopToRun = 200000;
        int counterToCheckForHowManyTimesItExists = 0;
        System.out.println("Terms\tValue of π");
        for (int counterToLoopThroughTerms = 1; counterToLoopThroughTerms <= termsForLoopToRun; counterToLoopThroughTerms++) {
            if (positive) {
                pi += 4.0/denominator;
            } else {
                pi -= 4.0/denominator;
            }
            denominator += 2.0;
            positive = !positive;
            if (String.format("%.5f", pi).startsWith("3.14159")) {
                counterToCheckForHowManyTimesItExists = counterToLoopThroughTerms;
            }
            if (counterToLoopThroughTerms % 1000 == 0) {
                System.out.println(counterToCheckForHowManyTimesItExists + "\t" + pi);
            }
        }
        System.out.println("Terms needed for first value starting with 3.14159: " + counterToCheckForHowManyTimesItExists);
    }
}
