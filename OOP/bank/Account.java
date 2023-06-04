package bank;

public class Account {
    private String firstName;
    private String lastName;
    private double balance;
    private final String ACCOUNT_NO;
    private final String mail;
    private String password;

    public Account(String accNo, String firstName, String lastName, String mail, String password) {
        ACCOUNT_NO = accNo;
        this.firstName = firstName;
        this.mail = mail;
        this.password = password;
        this.lastName = lastName;
    }
    public void deposit(int amount) {
        if( validateDeposit(amount)) balance += amount;
    }
    public double checkBalance(String password) {
        double bal = 0;
        if(verifyPassword(password)) bal = balance;
        return bal;
    }
    public double withdraw(String password, int withdrawAmount) {
        double giveBackValue = 0;
        if(validateWithdrawAmount(withdrawAmount) && verifyPassword(password)){
            balance -= withdrawAmount;
            giveBackValue = withdrawAmount;
        }
        return giveBackValue;
    }
    private boolean validateDeposit(int amount){
        boolean output = false;
        if(amount >0) output = true;
        return output;
    }
    private boolean verifyPassword(String password){
        boolean passwordVerification = this.password == password;
        return passwordVerification;
    }
    public boolean validateWithdrawAmount(int amountToValidate){
        boolean validateResult = balance >= amountToValidate;
        return validateResult;
    }
}
