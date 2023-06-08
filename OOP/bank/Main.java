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
                        
                ---  Press 0 For Login:     
                ---  Press 1 For Sign Up:
                For a RetPress 1 For 
                //Press 1 For Transactions: 
                //Press 2 For Customer Support: 
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
            case 1-> transactionFirstPage1();
        }
    }
    public void signUp(){
        String firstName = firstNameCollector();
        String lastName = lastNameCollector();
        String phoneNo = phoneNoCollector();
        String email = emailCollector();
        String password = passwordCollector();
        iNClusiveBank.registerNewCustomer(firstName, lastName, phoneNo, email, password);
    }
    public String firstNameCollector(){
        print("Enter your First Name");
        String firstName = userInput.nextLine();
        return firstName;
    }
    public String lastNameCollector(){
        print("Kindly enter your Last Name");
        String lastName = userInput.nextLine();
        return lastName;
    }
    public String phoneNoCollector(){
        print("Kindly enter your phoneNo");
        String phoneNo = userInput.nextLine();
        return phoneNo;
    }
    public String emailCollector(){
        print("Kindly enter your email address");
        String email = userInput.nextLine();
        return email;
    }
    public String passwordCollector(){
        print("Kindly Enter your pin/password");
        String password = userInput.nextLine();
        return password;
    }
    /*public void promptMessageForTransaction(){
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
            case 1-> iNClusiveBank.getAccountBalance();
        }
    }*/
}
