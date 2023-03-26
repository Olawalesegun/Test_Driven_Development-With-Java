package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private Account davidAccount = new Account();
    @Test
    public void depositMoneyTest(){
        //given
                //Account davidAccount = new Account();

        //when
        davidAccount.deposit(2_000);

        //assert or check
        int balance = davidAccount.getBalance();
        assertEquals(2_000, balance);
    }

    @Test
    public void depositTwiceTest(){
        //given
                // Account davidAccount = new Account();

        //when
        davidAccount.deposit(2_000);
        davidAccount.deposit(2_000);

        //assert or check
        int balance = davidAccount.getBalance();
        assertEquals(4_000, balance);
    }

    @Test
    public void depositNegativeValueTest(){
        davidAccount.deposit(-2_000);
        assertEquals(0, davidAccount.getBalance());
    }

    @Test
    public void depositNegativeValueTest2() {
        davidAccount.deposit(-4_000);
        assertEquals(0, davidAccount.getBalance());
    }
    @Test
    public void depositNegativeValueTest3() {
        davidAccount.deposit(8_000);
        assertEquals(8_000, davidAccount.getBalance());
    }
    @Test
    public void withdrawCash(){
        //davidAccount.deposit(5_000);
        davidAccount.withDrawCash(5000);
        assertEquals(5_000, davidAccount.getBalance());
    }

}
