package trial;


public class Account {
    private final String phoneNo;
    private String firstName;
    private String lastName;
    private double balance;
    private final String ACCOUNT_NO;
    private String mail;
    private String password;

    public Account(String accNo, String firstName, String lastName, String phoneNo, String mail, String password) {
        ACCOUNT_NO = accNo;
        this.firstName = firstName;
        this.mail = mail;
        this.password = password;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setMail(String mail){
        this.mail = mail;
    }
    public void deposit(double amount) {
        if( validateDeposit(amount)) balance += amount;
    }
    public double checkBalance(String password) {
        double bal = 0;
        if(verifyPassword(password)) bal = balance;
        return bal;
    }
    public double withdraw(String password, double withdrawAmount) {
        double giveBackValue = 0;
        if(validateWithdrawAmount(withdrawAmount) && verifyPassword(password)){
            balance -= withdrawAmount;
            giveBackValue = withdrawAmount;
        }
        return giveBackValue;
    }
    public String getAccountNumber(){
        return ACCOUNT_NO;
    }
    public String getAccountPassword(){
        return password;
    }
    private boolean validateDeposit(double amount){
        boolean output = false;
        if(amount >0) output = true;
        return output;
    }
    private boolean verifyPassword(String password){
        boolean passwordVerification = this.password == password;
        return passwordVerification;
    }
    public boolean validateWithdrawAmount(double amountToValidate){
        boolean validateResult = balance >= amountToValidate;
        return validateResult;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }
}
