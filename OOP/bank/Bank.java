package bank;

import java.util.ArrayList;

public class Bank {
    private final String nameOfBank;
    private int countAndIncrementUponCreationOfAccount;
    private ArrayList<Account> listOfAccountsPresentInBank;
    public Bank(String nameOfBank){
        this.nameOfBank = nameOfBank;
        listOfAccountsPresentInBank = new ArrayList<>();
    }
    public Account registerNewCustomer(String firstName, String lastName, String email, String password){
        Account newAccCreated = null;
        if(validateRegistrationDetails(firstName, lastName, email, password)){
            String accountNumber = 10000000 + "" + countAndIncrementUponCreationOfAccount;
            newAccCreated = new Account(accountNumber,firstName, lastName, email, password);
            listOfAccountsPresentInBank.add(countAndIncrementUponCreationOfAccount, newAccCreated);
            countAndIncrementUponCreationOfAccount++;
        }
        return newAccCreated;
    }
    public void deposit
    public boolean validateRegistrationDetails(String firstName, String lastName, String email, String password){
        boolean verifyFirstName = firstName.length() > 2;
        boolean verifyLastName = lastName.length() > 2;
        boolean verifyMail = email.length() > 2;
        boolean verifyPassword = password.length() > 2;
        boolean isValidated = false;
        if(verifyFirstName && verifyLastName && verifyMail && verifyPassword) isValidated = true;
        return isValidated;
    }
}
