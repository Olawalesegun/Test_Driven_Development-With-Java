package pract.generiic;

public class Agent<T> {

    T id;
    T name;
    T amountCollected;
    T amountPayable;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(T amountCollected) {
        this.amountCollected = amountCollected;
    }

    public T getAmountPayable() {
        return amountPayable;
    }

    public void setAmountPayable(T amountPayable) {
        this.amountPayable = amountPayable;
    }
}
