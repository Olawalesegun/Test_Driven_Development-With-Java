package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account acc = new Account("0014567231", "Shola", "Olawale", "09056789101","sholz@inc.com", "00000");
    @Test
    public void testThatAccountExist(){

        assertNotNull(acc);
    }
    @Test
    public void testThatAccountIsEmptyWithNoMoneyInItUponCreation(){
        assertEquals(0, acc.checkBalance("00000"));
    }
    @Test
    public void testThatAccountCanDeposit(){
        acc.deposit(5000);
        double bal = acc.checkBalance("00000");
        assertEquals(5000, bal);
    }
    @Test
    public void testThatIfMoneyIsDepositedByYouMoreThanOnceBalanceWillReflectIt(){
        acc.deposit(5000);
        acc.deposit(3000);
        acc.deposit(1000);
        assertEquals(9000, acc.checkBalance("00000"));
    }
    @Test
    public void testThatIfIDepositedNegativeNumbersItShouldNotDeposit(){
        acc.deposit(0);
        acc.deposit(-4500);
        acc.deposit(-7800);
        assertEquals(-0, acc.checkBalance("00000"));
    }
    @Test
    public void testToWithDrawMoneyFromNewAccountThatHasntBeenCreditedYet(){
        acc.withdraw("00000",5000);
        assertEquals(0, acc.checkBalance("00000"));
    }
    @Test
    public void testThatICanWithDrawAfterIHadDepositedIntoMyNewAccount(){
        acc.deposit(3000);
        acc.withdraw("00000",2000);
        assertEquals(1000, acc.checkBalance("00000"));
    }
    @Test
    public void testThatMyAccountCanWithstandAnyFormOfComplexTransaction(){
        acc.deposit(8000);
        acc.withdraw("00000",4000);
        acc.withdraw("00000",435);
        acc.withdraw("00000",18);
        assertEquals(3547, acc.checkBalance("00000"));
    }
}