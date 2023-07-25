package timbuchalka;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account2 acc = new Account2("0053217896", 0, "Fisayo", "fisayoGabanti", "08124567899");
    @Test
    public void testThatAccountCanBeCreated(){
        assertNotNull(acc);
    }
    @Test
    public void testThatAccountIsEmptyWithNoCash(){
        acc.setAccountNumber("0053217896");
        String accountBalance = acc.getAccountNumber();
        double accBal = acc.checkAccountBalance(accountBalance);
        assertEquals(0, accBal);
    }
    @Test
    public void testThatAccountCanOnlyBeAccessedByActualOwner(){

    }
}