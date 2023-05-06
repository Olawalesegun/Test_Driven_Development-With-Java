import java.util.Scanner;
public class Bank {
    /*  TODO:
            1. create a new BankAccount
            2. Create fields to take account number, balance, customer name, email and phone number.
            3. Create Getters and Setters for each field.
            4. Create Two additional methods:
                    1. To allow customer to deposit funds(this should increment the balance field.
                    2. To allow customer withdraw fund. deduct from the balace field
                            throw Exception if no insufficient funds and it shouldn't withdraw.
     */
    Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setAccountNumber("1234567891").setBalance(39_000_000).setCustomerName("Segun").deposit();
    }
    private String accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    public Bank setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
        return this;
    }
   /* public Bank getAccountNumber(){
        return this.accountNumber;
    }*/
    public Bank setBalance(int balance){
        this.balance = balance;
        return this;
    }
    /*public int getBalance(){
        return this.balance;
    }*/
    public Bank setCustomerName(String customerName){
        this.customerName = customerName;
        return this;
    }
   /* public String getCustomerName(){
        return this.customerName;
    }*/
    public Bank setEmail(){
        this.email = email;
        return this;
    }
    /*public String getEmail(){
        return this.email;
    }*/
    public Bank setPhoneNumber(){
        this.phoneNumber = phoneNumber;
        return this;
    }
    /*public String getPhoneNumber(){
        return this.phoneNumber;
    }*/
    public int deposit(){
        System.out.println("Hello " + customerName + ','+ " Welcome to Orange World");
        if(accountNumber == null || accountNumber.isEmpty()){
            System.out.println("Kindly enter an accountNumber");
            balance = 0;
        } else if (accountNumber.length() == 10) {
            System.out.println("Enter the amount you want to deposit; ");
            int depositAmount = userInput.nextInt();
            balance += depositAmount;
            System.out.println("You have deposited " + depositAmount + " and your current balance is " + balance);
        }
        else{
            System.out.println("Kindly input the correct account number");
        }
        return balance;
    }
    public Bank withdraw(){
        if(accountNumber == null || accountNumber.isEmpty()){
            System.out.println("Kindly Enter a valid account number: ");
            balance = 0;
        } else if (accountNumber.length() == 10) {
            System.out.println("Enter the withdraw amount: ");
            int withdrawAmount = userInput.nextInt();
            if(withdrawAmount <= balance) balance -= withdrawAmount;
        } else{
            System.out.println("Kindly pay attention to your inputs and try again");
        }
        Bank bank = this;
        return bank;
    }

}
