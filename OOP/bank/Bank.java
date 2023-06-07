package bank;

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
    public Account registerNewCustomer(String firstName, String lastName, String email, String password){

        // Account newAccCreated = null;
        if(validateRegistrationDetails(firstName, lastName, email, password)){
            String accountNumber = 100000000 + countAndIncrementUponCreationOfAccount + "";
            newAccCreated = new Account(accountNumber,firstName, lastName, email, password);
            listOfAccountsPresentInBank.add(countAndIncrementUponCreationOfAccount, newAccCreated);
            countAndIncrementUponCreationOfAccount++;
        }
        return newAccCreated;
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
    public void transfer(String sendersAccountNo, String receiversAccountNumber, double amount, String password){
        if(verifyAccountNumber(sendersAccountNo) && verifyAccountNumber(receiversAccountNumber) &&
                verifyAmountIsValid(amount) && verifyPassword(password)){
            Account senderAccountRecord = lookForAccountByTheAccountNumber(sendersAccountNo);
            Account receiverAccountRecord = lookForAccountByTheAccountNumber(receiversAccountNumber);
            if(senderAccountRecord != null && receiverAccountRecord != null &&
                    senderAccountRecord.getAccountPassword().equals(password)){
                senderAccountRecord.withdraw(password, amount);
                receiverAccountRecord.deposit(amount);
            }
        }
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
    public boolean validateRegistrationDetails(String firstName, String lastName, String email, String password){
        boolean verifyFirstName = firstName.length() > 2;
        boolean verifyLastName = lastName.length() > 2;
        boolean verifyMail = email.length() > 2;
        boolean verifyPassword = password.length() > 2;
        boolean isValidated = false;
        if(verifyFirstName && verifyLastName && verifyMail && verifyPassword) isValidated = true;
        return isValidated;
    }

    public String getFirstName() {
        return fir
    }
}
