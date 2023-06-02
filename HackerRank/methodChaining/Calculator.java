package methodChaining;
public class Calculator {
    private int result;

    public Calculator() {
        this.result = 0;
    }

    public Calculator add(int number) {
        result += number;
        return this;
    }

    public Calculator subtract(int number) {
        result -= number;
        return this;
    }

    public Calculator multiply(int number) {
        result *= number;
        return this;
    }

    public Calculator divide(int number) {
        if (number != 0) {
            result /= number;
        }
        return this;
    }

    public int getResult() {
        return result;
    }
}
