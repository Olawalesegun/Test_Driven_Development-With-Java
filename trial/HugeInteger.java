import static java.util.function.Predicate.isEqual;

public class HugeInteger {
    private int[] arrayHolder = new int[40];
    public void parse(String input) {
        checkLengthOfInput(input);
        checkIfItContainAlphabet(input);
        for (int index = 0; index < input.length(); index++) {
            arrayHolder[index] = Integer.parseInt(String.valueOf(input.charAt(index)));
        }
    }
    private void checkLengthOfInput(String input){
        if (input.length() > 40) throw new IllegalArgumentException("Input length greater than 40");
    }
    private void checkIfItContainAlphabet(String input){
//        for (int index = 0; index < input.length(); index++) {
//            if(!Character.isDigit(input.charAt(index))){
//                throw new NumberFormatException("Contains Alphabets");
//            }
//        }
        for (Character c : input.toCharArray()){
            if (!Character.isDigit(c)) throw new NumberFormatException("Contains Alphabets");
        }
    }
    public int[] getArray() {
        return arrayHolder;
    }
    @Override
    public String toString() {
        String value = "";
        for (int i : arrayHolder) {
            value += i;
        }
        return value;
    }

    public String add(HugeInteger hugeInteger2) {
        int[] sumArray = new int[arrayHolder.length];
        for (int index = arrayHolder.length - 1; index >= 0; index--) {
            int sum = this.arrayHolder[index] + hugeInteger2.arrayHolder[index];
            if (sum > 9){
                int remainder = sum % 10;
                sumArray[index] = remainder;
                int divide = sum/10;
                this.arrayHolder[index - 1] = this.arrayHolder[index - 1]+divide;
            }
            else sumArray[index] = sum;
        }
        String value = "";
        for (int i : sumArray) {
            value += i;
        }
        System.out.println(value);
        return value;
    }
    public String subtract(HugeInteger hugeInteger1) {
        int[] subHolder = new int[arrayHolder.length];
        String value = "";
        for (int index = arrayHolder.length - 1; index >= 0; index--) {
            if(this.arrayHolder[index] < hugeInteger1.arrayHolder[index]){
                this.arrayHolder[index] = this.arrayHolder[index] + 10;
                this.arrayHolder[index - 1] = this.arrayHolder[index - 1] - 1;
                subHolder[index] = this.arrayHolder[index] - hugeInteger1.arrayHolder[index];
            }
            else {
                int sub = this.arrayHolder[index] - hugeInteger1.arrayHolder[index];
                subHolder[index] = sub;
            }
        }
        for (int number : subHolder){
            value += number;
        }
        return value;
    }

    public boolean isEquals(HugeInteger hugeInteger2) {
        int count = 0;
        for (int index = 0; index < arrayHolder.length; index++) {
            if (this.arrayHolder[index] == hugeInteger2.arrayHolder[index]) count++;
        }
        return count == arrayHolder.length;
    }
}
