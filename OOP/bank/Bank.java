package bank;

import javax.security.auth.login.AccountNotFoundException;
import java.util.ArrayList;

public class Bank {
    private final String nameOfBank;
    private int countAndIncrementUponCreationOfAccount;
    private ArrayList<Account> listOfAccountsPresentInBank;
    private Account newAccCreated;
    public Bank(String nameOfBank){
        this.nameOfBank = nameOfBank;
        listOfAccountsPresentInBank = new ArrayList<>();
    }
    public Account registerNewCustomer(String firstName, String lastName, String phoneNo, String email, String password){
        // Account newAccCreated = null;
        if(validateRegistrationDetails(firstName, lastName, phoneNo, email, password)){
            //String accountNumber = 100000000 + countAndIncrementUponCreationOfAccount + "";
            String accountNumber = createAccountNumber(phoneNo);
            newAccCreated = new Account(accountNumber, firstName, lastName, phoneNo, email, password);
            newAccCreated.setPassword(password);
            newAccCreated.setMail(email);
            listOfAccountsPresentInBank.add(countAndIncrementUponCreationOfAccount, newAccCreated);
            System.out.println("You have successfully registered your account with our bank");
            countAndIncrementUponCreationOfAccount++;
        }
        else{
            System.out.println("Take Life Seriously and Input the right details as you shou should, stop wasting both of our time");
            System.exit(0);
        }
        return newAccCreated;
    }
    private String createAccountNumber(String phoneNumber){
        String accNo = " ";
        if(phoneNumber.startsWith("0")){
            accNo = phoneNumber.substring(1);
        }
        return accNo;
    }
    public void deposit(String accNo, double amount){
        if(verifyAccountNumber(accNo) && verifyAmountIsValid(amount)) {
            for (Account acc : listOfAccountsPresentInBank) {
                if (accNo.equals(acc.getAccountNumber())) {
                   acc.deposit(amount);
                }
            }
        }
    }
    public void withdraw(String accNo, double amount, String password){
        if(verifyAccountNumber(accNo) && verifyAmountIsValid(amount) &&verifyPassword(password)){
            for (Account acc : listOfAccountsPresentInBank){
                if (accNo.equals(acc.getAccountNumber()) && password.equals(acc.getAccountPassword())) {
                    acc.withdraw(password, amount);
                    break;
                }
            }
        }
    }
    public void transfer(String sendersAccountNo, String receiversAccountNumber, double amount, String password) throws AccountNotFoundException {
        if(verifyAccountNumber(sendersAccountNo) && verifyAccountNumber(receiversAccountNumber) &&
                verifyAmountIsValid(amount) && verifyPassword(password)){
            Account senderAccountRecord = lookForAccountByTheAccountNumber(sendersAccountNo);
            Account receiverAccountRecord = lookForAccountByTheAccountNumber(receiversAccountNumber);
            if(senderAccountRecord == null || receiverAccountRecord == null){
                throw new AccountNotFoundException("Account not found.");
            }
            if(!senderAccountRecord.getAccountPassword().equals(password)){
                throw new IllegalArgumentException("Invalid password.");
            }
            if(senderAccountRecord.getBalance() < amount) {
                System.out.println("Insufficient amount");
            }
            senderAccountRecord.withdraw(password, amount);
            receiverAccountRecord.deposit(amount);
            /*if(senderAccountRecord != null && receiverAccountRecord != null &&
                    senderAccountRecord.getAccountPassword().equals(password)){
                if(senderAccountRecord.getBalance() >= amount){
                    senderAccountRecord.withdraw(password, amount);
                    receiverAccountRecord.deposit(amount);
                }
                *//*else{
                    getAccountBalance() ==
                }*//*

            }*/
        }
    }
    public double getAccountBalance(){
        return newAccCreated.getBalance();
    }
    private Account lookForAccountByTheAccountNumber(String receiversAccountNumber) {
        for(Account acc: listOfAccountsPresentInBank){
            if(acc.getAccountNumber().equals(receiversAccountNumber)){
                return acc;
            }
        }
        return null;
    }
    public boolean verifyPassword(String password){
        boolean isPasswordVerified = password.length() == 5;
        return isPasswordVerified;
    }
    public boolean verifyAmountIsValid(double amount) {
        boolean isAmountValid = amount > 0;
        return isAmountValid;
    }
    private boolean verifyAccountNumber(String accNo){
        boolean isAccLengthTheRequiredLength = accNo.length() == 10;
        return isAccLengthTheRequiredLength;
    }
    public boolean validateRegistrationDetails(String firstName, String lastName, String phoneNo, String email, String password){
      /* try{
           validateFirstName(firstName);
           validateLastName(lastName);
           validatePhoneNo(phoneNo);
           validateEmail(email);
           validatePassword(password);
       }catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }*/

        boolean verifyFirstName = firstName.length() > 2;
        boolean verifyLastName = lastName.length() > 2;
        boolean verifyPhoneNo = phoneNo.length() == 11;
        boolean verifyMail = email.length() > 2;
        boolean verifyPassword = password.length() > 2;
        boolean isValidated = false;
        if(verifyFirstName && verifyLastName && verifyPhoneNo && verifyMail && verifyPassword) isValidated = true;
        return isValidated;

       /* try {
            if (firstName.length() < 3) {
                throw new IllegalArgumentException("First name must be at least 3 characters long");
            }
            if (lastName.length() < 3) {
                throw new IllegalArgumentException("Last name must be at least 3 characters long");
            }
            if (!phoneNo.startsWith("0") || phoneNo.length() != 11) {
                throw new IllegalArgumentException("Phone number must start with 0 and be 11 characters long");
            }
            if (!email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z]{2,6}$")) {
                throw new IllegalArgumentException("Email must contain an @ and a .");
            }
            if (password.length() < 5) {
                throw new IllegalArgumentException("Password must be at least 5 characters long");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }*/
    }
   /* public void validateFirstName(String firstName){
        if(firstName.length() < 3){
            throw new IllegalArgumentException("Hello Friend!! Your First name must be at least 3 characters in terms of length");
        }
    }
    public void validateLastName(String lastName){
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last name must be at least 3 characters long");
        }
    }
    public void validatePhoneNo(String phoneNo){
        if (!phoneNo.startsWith("0") || phoneNo.length() != 11) {
            throw new IllegalArgumentException("Phone number must start with 0 and be 11 characters long");
        }
    }
    public void validateEmail(String email){
        if (!email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,6}$")) {
            throw new IllegalArgumentException("Email must contain an @ and a .");
        }
    }
    public void validatePassword(String password){
        if (password.length() < 5) {
            throw new IllegalArgumentException("Password must be at least 5 characters long");
        }
    }*/

    public String getDetails() {
        return "Details for " + newAccCreated.getAccountNumber() + "are " + "" +newAccCreated.getFirstName() +
                " " + newAccCreated.getLastName();
    }
    public String getAccNumber(){
        return newAccCreated.getAccountNumber();
    }
    public String getEmail(){
       try{
            boolean b = newAccCreated.getEmail() != null;
            newAccCreated.getEmail();
        } catch(NullPointerException e){
            System.out.println("My Friend, You do not have an Account with us, Please Register");
        }
       return " ";
       // return newAccCreated.getEmail();
    }
    public String getPassword(){
        return newAccCreated.getPassword();
    }
}
