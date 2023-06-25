package phoneBook;

import java.util.Scanner;

public class Main{
    static PhoneBook samsungPhoneBook = new PhoneBook();
    Scanner userInput = new Scanner(System.in);
  public static void main(String[] args){
      Main mn = new Main();
     mn.phoneBookFirstPage();

  }
  public void phoneBookFirstPage(){
      print("""
            Welcome to your Phone
            Press 1 -> To Enter Your PhoneBook
            Press 2 -> To Exit this Option
      """);
      ;
      pickPhoneBookOptions(collectPromptToBeEntered());
  }
  public void pickPhoneBookOptions(int numberToPick){
      switch(numberToPick){
          case 1 -> secondPhaseIntoThePhoneBook();
          case 2 -> exitPhoneBook();
      }
  }
  public void exitPhoneBook(){
      System.exit(0);
  }
  public void print(String valueEntered){
      System.out.println(valueEntered);
  }
  public void secondPhaseIntoThePhoneBook(){
      samsungPhoneBook.sortContactsFromListOfContacts();
      print("----");
      samsungPhoneBook.displayContacts();
      print("""
          You are now in your Phonebook.
          Press 1 -> To Create Contact
          Press 2 -> To Search Contact
          Press 3 -> To Remove Contact
      """);
    ;
      switch(collectPromptToBeEntered()){
          case 1 -> createContact();
          case 2 -> searchContact();
          case 3 -> removeContact();
          case 4 -> exitContact();
      }
  }
  public void createContact(){
      samsungPhoneBook.createContact(enterFirstName(),enterLastName(),
              enterPhoneNo(),enterEmail(),enterBday());
      print("""
              To go back to Main Menu
              Press 1 -> To go to back to Previous Menu
              Press 2 -> To exit
              """);
      int numba
  }
  public int collectPromptToBeEntered(){
      int numba = userInput.nextInt();
      return numba;
  }
  public void searchContact(){
      String firstName = enterFirstName();
      samsungPhoneBook.searchContactFor(firstName);
  }
  public void removeContact(){
      String firstName = enterFirstName();
      samsungPhoneBook.removeContact(firstName);
  }
  public void exitContact(){
      System.exit(0);
  }
  public String enterFirstName(){
      print("Enter your firstName");
      String firstName = userInput.next();
      return firstName;
  }
  public String enterLastName(){
      print("Enter your lastName");
      String lastName = userInput.next();
      return lastName;
  }
  public String enterPhoneNo(){
      print("Enter your phoneNo");
      String phoneNo = userInput.next();
      return phoneNo;
  }
  public String enterEmail(){
      print("Enter your email");
      String email = userInput.next();
      return email;
  }
  public String enterBday(){
      print("Enter your birthday");
      String bday = userInput.next();
      return bday;
  }
}
