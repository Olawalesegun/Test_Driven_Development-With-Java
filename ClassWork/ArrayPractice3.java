public class ArrayPractice3 {

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 6, 7};
        checkLargest(array);
        checkSmallest(array);
        System.out.println(checkLargest(array) + checkSmallest(array));
    }
    public static int checkLargest(int[] array1){
        int largest = Integer.MIN_VALUE;
        for (int i : array1) {
            if (i > largest) {
                largest = i;
            }
        }
        System.out.println(largest);
        return largest;
    }

    public static int checkSmallest(int[] array1){
        int smallest = Integer.MAX_VALUE;
        for (int i : array1) {
            if (i < smallest) {
                smallest = i;
            }
        }
        System.out.println(smallest);
        return smallest;
    }
}
