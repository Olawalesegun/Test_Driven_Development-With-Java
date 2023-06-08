package bank;

import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Main main = new Main();
        main.displayWelcomePagePopAndPrompt();
    }
    public void displayWelcomePagePopAndPrompt(){
        String welcomePrompt = """
                    Welcome to iNClusive Bank
                ------The Bank For Everyone------
                        
                        ----_^_^_----
                        
                Press 1 For Transactions: 
                Press 2 For Customer Support: 
                """;
        print(welcomePrompt);
    }
    public void print(String prompt){
        System.out.println(prompt);
    }
    public void takeinData(){
        Scanner userInput = new Scanner(System.in);
        int entry = userInput.nextInt();
        switch(entry){
            case 1 ->

        }
    }
}
