package bank;

import java.util.Scanner;
public class Main {
    Bank iNClusiveBank = new Bank("iNClusiveBank");
    Scanner userInput = new Scanner(System.in);
    public static void main(String[] args){
        Main main = new Main();
        main.showBank();
    }
    public void displayWelcomePagePopAndPrompt(){
        String welcomePrompt = """
                    Welcome to iNClusive Bank
                ------The Bank For Everyone------
                        
                        ----_^_^_----
                        
                ---  Press 0 For SignUp:     
                ---  Press 1 For LogIn:
                """;
        print(welcomePrompt);
    }
    public void showBank(){
       takeInData();
    }
    public void print(String prompt){
        System.out.println(prompt);
    }
    public void takeInData(){
        displayWelcomePagePopAndPrompt();
        int entry = userInput.nextInt();
        switch(entry){
            case 0 -> signUp();
            case 1-> logIn();
        }
    }
    public void signUp(){
        String firstName = firstNameCollector();
        String lastName = lastNameCollector();
        String phoneNo = phoneNoCollector();
        String email = emailCollector();
        String password = passwordCollector();
        iNClusiveBank.registerNewCustomer(firstName, lastName, phoneNo, email, password);
        goBackToLoginPage();
    }
    public void goBackToLoginPage(){
        print(" To Login into your bank account, press 1 \n" +
                "To go back to previous Menu, press 0");
        int entry = userInput.nextInt();
        switch(entry){
            case 1-> logIn();
            case 0 -> takeInData();
        }
    }
    public String firstNameCollector(){
        print("Enter your First Name");
        String firstName = userInput.next();
        return firstName;
    }
    public String lastNameCollector(){
        print("Kindly enter your Last Name");
        String lastName = userInput.next();
        return lastName;
    }
    public String phoneNoCollector(){
        print("Kindly enter your phoneNo");
        String phoneNo = userInput.next();
        if(phoneNo.length() != 11){
            print("invalid phoneNumber, enter 11digit numbers");
            return phoneNoCollector();
        }
        return phoneNo;
    }
    public String emailCollector() {
        print("Kindly enter your email address");
        String email = userInput.next();
        if (!email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,6}$")) {
            print("Invalid email address");
            return email;
        }
        return email;
    }
    public String passwordCollector() {
        print("Kindly Enter your pin/password");
        String password = userInput.next();
        if (password.isEmpty()) {
            print("Please enter a password");
            return passwordCollector();
        }
        return password;
    }
    /*public String emailCollector(){
        print("Kindly enter your email address");
        String email = userInput.next();
        try{
            boolean b = email != null;
        } catch(NullPointerException e){
            System.out.println("mimiiiiii");
        }
        return email;
    }*/
    /*public String passwordCollector(){
        print("Kindly Enter your pin/password");
        String password = userInput.next();
        return password;
    }*/
    public void logIn(){
        String email = emailCollector();
        String password = passwordCollector();
        if(email.equals(iNClusiveBank.getEmail())){
            if(password.equals(iNClusiveBank.getPassword())){
                transactionFirstPage1();
            }
            else{
                print("Your password is incorrect");
            }
        }
        else{
            print("Your email is incorrect");
        }
    }
    public void promptMessageForTransaction(){
        String transactionFrontPage = """
                -- Press 1 For Account Balance
                -- Press 2 For Account Deposit
                -- Press 3: For Account Transfer
                -- Press 4 To go back  to Main Menu
                """;
        print(transactionFrontPage);
    }
    public void transactionFirstPage1(){
        promptMessageForTransaction();
        int entry = userInput.nextInt();
        switch(entry){
            case 1-> promptAccountBalance();
            case 2 -> promptAccountDeposit();
            case 3 -> promptAccountWithDraw();
            case 4 -> promptMessageForTransaction();
        }
    }

    private void promptAccountWithDraw() {
        print("To Withdraw From Your Account, " +
                "Pres 1, to withdraw, " +
                "Press 2, to go back to Transaction Menu" +
                "Press 3 to go back to Main Menu");
        int entry = userInput.nextInt();
        switch(entry){
            case 1 -> withdrawFromAccount();
            case 2 -> transactionFirstPage1();
            case 3 -> promptMessageForTransaction();
        }

    }
    public void withdrawFromAccount(){
        print("Enter your Account Number");
        String accNo = userInput.next();
        print("Enter the amount you choose to withdraw");
        double amount = userInput.nextDouble();
        print("Enter your password");
        String password = userInput.next();
        iNClusiveBank.withdraw(accNo, amount, password);
    }
    public void promptAccountBalance(){
        print("Welcome to your Account Balance Interface");
        print("To get your Account balance, press 1");
        print("To go back to previous Menu, press 0: ");
        int entry = userInput.nextInt();
        switch(entry){
            case 1-> iNClusiveBank.getAccountBalance();
            case 0 -> transactionFirstPage1();
        }
    }
    public void promptAccountDeposit(){
        print("Welcome to your Deposit Interface\n" +
                "Kindly Provide the Account Number, you wish to Deposit");
        String accountNo = userInput.nextLine();
        print("Provide the amount you wish to deposit");
        double amountToBeDeposited = userInput.nextDouble();
        iNClusiveBank.deposit(accountNo, amountToBeDeposited);
    }
}
