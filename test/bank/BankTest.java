package bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.security.auth.login.AccountNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    private Bank bank;

    @BeforeEach
    public void setUp() {

        bank = new Bank("MyBank");
        bank.registerNewCustomer("Segun", "Olawale", "09010000000", "olaseg@gmail.com", "00001");
    }
    @Test
    public void testThatBankRecordsIsntEmpty(){
        assertNotNull(bank);
    }
    @Test
    public void testToConfirmNameRegisterForNewCustomerIsWhatIsReturnedInBankRecords() {
        assertEquals("Details for 9010000000 are Segun Olawale", bank.getDetails());
    }
    @Test
    public void testDeposit() {
        bank.deposit(bank.getAccNumber(), 100.0);
        assertEquals(100.0, bank.getAccountBalance());
    }
    @Test
    public void testToWithdrawWithTheRightPasswordORPin() {
        bank.deposit(bank.getAccNumber(), 100.0);
        bank.withdraw(bank.getAccNumber(), 80.0, "00001");
        assertEquals(20.0, bank.getAccountBalance(), 0.01);
    }
    @Test
    public void testToDepositIntoANonExistingAccountNumber(){
        bank.deposit("9176543212", 400);
        assertEquals(0.0, bank.getAccountBalance());
    }
    @Test
    public void testToDepositIntoAnExistingAccountNumber(){
        bank.deposit("9010000000", 500);
        assertEquals(500, bank.getAccountBalance());
    }
    @Test
    public void testToWithDrawWithAWrongAccountPasswordWhileHavingAnExistingAccountNumber(){
        String bankAccountNumber = "9010000000";
        bank.deposit(bankAccountNumber, 1000);
        bank.withdraw(bankAccountNumber, 400, "00000");
        assertEquals(1000, bank.getAccountBalance());
    }
    @Test
    public void testThatToWithdrawWithRightPasswordOrPinAndAnExistingAccountNumberWorks(){
        bank.deposit("9010000000", 500);
        bank.withdraw("9010000000", 150, "00001");
        assertEquals(350, bank.getAccountBalance());
    }
    @Test
    public void testThatICanTransferToAnExistingAccountNumber() throws AccountNotFoundException {

        bank.deposit("9010000000", 500);
        bank.registerNewCustomer("Chukwuemeka",
                "Chibuzor",
                "08020000000",
                "chukschi@ng.com",
                "9876");
       bank.transfer("9010000000", "8020000000", 200, "9876");
        assertEquals(100, bank.getAccountBalance());
    }
    //@Test
  /*  public void testThatTransferConnects() {
       // Account senderAccount = bank.registerNewCustomer("Kunle Remi", "Dauda", "kunlerem@inc.com", "00001");
      //  Account receiverAccount = bank.registerNewCustomer("Kunle Remi", "Dauda", "kunlerem@inc.com", "00001");
        bank.deposit(senderAccount.getAccountNumber(), 100.0);
        bank.transfer(senderAccount.getAccountNumber(), receiverAccount.getAccountNumber(), 50.0, "00001");
        assertEquals(50.0, senderAccount.getBalance(), 0.01);
        assertEquals(50.0, receiverAccount.getBalance(), 0.01);
    }*/
    @Test
    public void testInvalidAccountNumber() {
        //Account account = bank.registerNewCustomer("Kunle Remi", "Dauda", "kunlerem@inc.com", "00001");
        bank.deposit("9010000000", 100.0);
        assertEquals(0.0, bank.getAccountBalance());
    }
    @Test
    public void testInvalidAmount() {
        bank.deposit(bank.getAccNumber(), -50.0);
        assertEquals(0.0, bank.getAccountBalance());
    }
    @Test
    public void testInvalidPassword() {
        bank.deposit(bank.getAccNumber(), 100.0);
        bank.withdraw(bank.getAccNumber(), 50.0, "0001");
        assertEquals(100.0, bank.getAccountBalance());
    }
    @Test
    public void testAccountNotFound() {
        //Account account = bank.registerNewCustomer("Kunle Remi", "Dauda", "kunlerem@inc.com", "00001");
        bank.withdraw("1234567890", 50.0, "0000100");
        assertEquals(0.0, bank.getAccountBalance(), 0.01);
    }
}








/*
package bank;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Bank iNclusiveBank = new Bank("iNclusiveBank");
    @Test
    public void testThatBankCanAndHasBeenCreated(){

    }

*/
//}