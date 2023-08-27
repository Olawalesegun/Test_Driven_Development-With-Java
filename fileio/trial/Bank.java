package account;


import bank.Account;

import javax.security.auth.login.AccountNotFoundException;
import java.util.ArrayList;

public class Bank {
    private final String nameOfBank;
    private int countAndIncrementUponCreationOfAccount;
    private ArrayList<bank.Account> listOfAccountsPresentInBank;
    private bank.Account newAccCreated;

    public Bank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
        listOfAccountsPresentInBank = new ArrayList<>();
    }

    public bank.Account registerNewCustomer(String firstName, String lastName, String phoneNo, String email, String password) {
        // Account newAccCreated = null;
        if (validateRegistrationDetails(firstName, lastName, phoneNo, email, password)) {
            //String accountNumber = 100000000 + countAndIncrementUponCreationOfAccount + "";
            String accountNumber = createAccountNumber(phoneNo);
            newAccCreated = new bank.Account(accountNumber, firstName, lastName, phoneNo, email, password);
            newAccCreated.setPassword(password);
            newAccCreated.setMail(email);
            listOfAccountsPresentInBank.add(countAndIncrementUponCreationOfAccount, newAccCreated);
            System.out.println("You have successfully registered your account with our bank");
            countAndIncrementUponCreationOfAccount++;
        } else {
            System.out.println("Trying to break my code. Really!!\nKindly input the right detail to Register please!!");
            System.exit(0);
        }
        return newAccCreated;
    }

    private String createAccountNumber(String phoneNumber) {
        String accNo = " ";
        if (phoneNumber.startsWith("0")) {
            accNo = phoneNumber.substring(1);
        }
        return accNo;
    }

    public void deposit(String accNo, double amount) {
        if (verifyAccountNumber(accNo) && verifyAmountIsValid(amount)) {
            for (bank.Account acc : listOfAccountsPresentInBank) {
                if (accNo.equals(acc.getAccountNumber())) {
                    acc.deposit(amount);
                }
            }
        }
    }

    public void withdraw(String accNo, double amount, String password) {
        if (verifyAccountNumber(accNo) && verifyAmountIsValid(amount) && verifyPassword(password)) {
            for (bank.Account acc : listOfAccountsPresentInBank) {
                if (accNo.equals(acc.getAccountNumber()) && password.equals(acc.getAccountPassword())) {
                    acc.withdraw(password, amount);
                    break;
                }
            }
        }
    }

    public void transfer(String sendersAccountNo, String receiversAccountNumber, double amount, String password) throws AccountNotFoundException {
        if (verifyAccountNumber(sendersAccountNo) && verifyAccountNumber(receiversAccountNumber) &&
                verifyAmountIsValid(amount) && verifyPassword(password)) {
            bank.Account senderAccountRecord = lookForAccountByTheAccountNumber(sendersAccountNo);
            bank.Account receiverAccountRecord = lookForAccountByTheAccountNumber(receiversAccountNumber);
            if (senderAccountRecord == null || receiverAccountRecord == null) {
                throw new AccountNotFoundException("Account not found.");
            }
            if (!senderAccountRecord.getAccountPassword().equals(password)) {
                throw new IllegalArgumentException("Invalid password.");
            }
            if (senderAccountRecord.getBalance() < amount) {
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

    public double getAccountBalance() {
        return newAccCreated.getBalance();
    }

    private bank.Account lookForAccountByTheAccountNumber(String receiversAccountNumber) {
        for (Account acc : listOfAccountsPresentInBank) {
            if (acc.getAccountNumber().equals(receiversAccountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public boolean verifyPassword(String password) {
        boolean isPasswordVerified = password.length() == 5;
        return isPasswordVerified;
    }

    public boolean verifyAmountIsValid(double amount) {
        boolean isAmountValid = amount > 0;
        return isAmountValid;
    }

    private boolean verifyAccountNumber(String accNo) {
        boolean isAccLengthTheRequiredLength = accNo.length() == 10;
        return isAccLengthTheRequiredLength;
    }

    public boolean validateRegistrationDetails(String firstName, String lastName, String phoneNo, String email, String password) {
        boolean verifyFirstName1 = firstName.length() > 2;
        boolean verifyLastName = lastName.length() > 2;
        if (!verifyPhoneNumber(phoneNo)) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        boolean verifyMail = email.length() > 2;
        boolean verifyPassword = password.length() > 2;
        boolean isValidated = false;
        if (verifyFirstName1 && verifyLastName && verifyPhoneNumber(phoneNo) && verifyMail && verifyPassword)
            isValidated = true;
        return isValidated;
    }

    private boolean verifyPhoneNumber(String phoneNumber) {
        String pattern = "^\\d{11}$";
        return phoneNumber.matches(pattern);
    }

    public String getDetails() {
        return "Details for " + newAccCreated.getAccountNumber() + " are " + "" + newAccCreated.getFirstName() +
                " " + newAccCreated.getLastName();
    }

    public String getAccNumber() {
        return newAccCreated.getAccountNumber();
    }

    public String getEmail() {
        try {
            boolean b = newAccCreated.getEmail() != null;
            newAccCreated.getEmail();
        } catch (NullPointerException e) {
            System.out.println("My Friend, You do not have an Account with us, Please Register");
        }
        return " ";
        // return newAccCreated.getEmail();
    }

    public String getPassword() {
        return newAccCreated.getPassword();
    }
}
