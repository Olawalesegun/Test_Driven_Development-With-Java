package tdd;

public class Account {
    private int balance;
    /**public Account(int balance){
        this.balance = balance;
        balance = 5_000;
    }*/
    public int deposit(int amount) {
        balance += amount;
        if(amount <= 0){
            return 0;
        }
        return balance;
        /* without changing the return type to int
        if(amount < 0){
            balance =  balance;
        }
        else{
            balance += amount;
        }
        second method of doing this without changing the return type from void
        if(amount > 0) balance = balance +amount **/
    }

    public int getBalance() {
        if(balance <= 0){
            return 0;
        }
        else
            return balance;
    }

    //public int getCash(){
     //   this.balance = balance;
    //}
    public int withDrawCash(int amount){
        //balance = balance - amount;
        balance = 5_000;
        if(amount <= balance)
            return amount;
        else{
            return 0;
        }

    }
}
