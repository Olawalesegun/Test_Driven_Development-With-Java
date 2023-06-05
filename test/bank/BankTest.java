package bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    private Bank bank;

    @BeforeEach
    public void setUp() {
        bank = new Bank("MyBank");
    }

    @Test
    public void testRegisterNewCustomer() {
        Account account = bank.registerNewCustomer("Kunle Remi", "Dauda", "kunlerem@inc.com", "00001");
        Assertions.assertNotNull(account);
        assertEquals("Kunle Remi", account.getFirstName());
        assertEquals("Dauda", account.getLastName());
        assertEquals("kunlerem@inc.com", account.getEmail());
        assertEquals("00001", account.getPassword());
    }

    @Test
    public void testDeposit() {
        Account account = bank.registerNewCustomer("Kunle Remi", "Dauda", "kunlerem@inc.com", "00001");
        bank.deposit(account.getAccountNumber(), 100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        Account account = bank.registerNewCustomer("Kunle Remi", "Dauda", "kunlerem@inc.com", "00001");
        bank.deposit(account.getAccountNumber(), 100.0);
        bank.withdraw(account.getAccountNumber(), 50.0, "password");
        assertEquals(50.0, account.getBalance(), 0.01);
    }

    @Test
    public void testTransfer() {
        Account senderAccount = bank.registerNewCustomer("Kunle Remi", "Dauda", "kunlerem@inc.com", "00001");
        Account receiverAccount = bank.registerNewCustomer("Kunle Remi", "Dauda", "kunlerem@inc.com", "00001");
        bank.deposit(senderAccount.getAccountNumber(), 100.0);
        bank.transfer(senderAccount.getAccountNumber(), receiverAccount.getAccountNumber(), 50.0, "00001");
        assertEquals(50.0, senderAccount.getBalance(), 0.01);
        assertEquals(50.0, receiverAccount.getBalance(), 0.01);
    }
    @Test
    public void testInvalidAccountNumber() {
        Account account = bank.registerNewCustomer("Kunle Remi", "Dauda", "kunlerem@inc.com", "00001");
        bank.deposit("1234567890", 100.0); // Invalid account number
        assertEquals(0.0, account.getBalance());
    }

    @Test
    public void testInvalidAmount() {
        Account account = bank.registerNewCustomer("Kunle Remi", "Dauda", "kunlerem@inc.com", "00001");
        bank.deposit(account.getAccountNumber(), -50.0); // Negative amount
        assertEquals(0.0, account.getBalance());
    }

    @Test
    public void testInvalidPassword() {
        Account account = bank.registerNewCustomer("Kunle Remi", "Dauda", "kunlerem@inc.com", "00001");
        bank.deposit(account.getAccountNumber(), 100.0);
        bank.withdraw(account.getAccountNumber(), 50.0, "0001");
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testAccountNotFound() {
        Account account = bank.registerNewCustomer("Kunle Remi", "Dauda", "kunlerem@inc.com", "00001");
        bank.withdraw("1234567890", 50.0, "0000100"); // Account not found
        assertEquals(0.0, account.getBalance(), 0.01);
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