package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account acc = new Account("Shola", "Olawale", "sholz@inc.com", "00000");
    @Test
    public void testThatAccountExist(){

        assertNotNull(acc);
    }
    @Test
    public void testThatAccountIsEmptyWithNoMoneyInIt(){
        assertEquals(5000, acc.checkBalance("00000"));
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
    public void testToWithDrawNewMoneyFromNewAccountThatHasntBeenCreditedYet(){
        acc.withdraw(5000);
        assertEquals(0, acc.checkBalance("00000"));
    }

    @Test
    public void testThatICanWithDrawAfterIHadDepositedIntoMyNewAccount(){
        acc.deposit(3000);
        acc.withdraw(2000);
        assertEquals(1000, acc.checkBalance("00000"));
    }
    @Test
    public void testThatMyAccpountCanWithStadAnyFormOfComplexTransaction(){
        acc.deposit(8000);
        acc.withdraw(4000);
        acc.withdraw(435);
        acc.withdraw(18);
        assertEquals(3423, acc.checkBalance("00000"));
    }
}