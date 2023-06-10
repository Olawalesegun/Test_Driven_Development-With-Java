//package bankTry;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class BankTryTest {
//
//    Bank sterlingBank;
//
//    @BeforeEach
//    void setUp() {
//        sterlingBank = new Bank();
//    }
//
//    @Test
//    public void testThatAccountCanBeCreated(){
//        assertNotNull(sterlingBank);
//    }
//    @Test
//    public void testThatBankCanRegisterNewCustomer() {
//        sterlingBank.registerNewCustomer("Tunde", "orangekapital@include.com");
//        //String email = sterlingBank.getBankAccName();
//        assertEquals("orangekapital@include.com", sterlingBank.getBankAccEmail());
//    }
//    @Test
//    public void testThatBankCanRegisterNewCustomer2(){
//        sterlingBank.registerNewCustomer("Funmi", "fedalshoot@inc.com");
//        String name = sterlingBank.getBankAccName();
//        assertEquals("Funmi", name);
//    }
//    @Test
//    public void testToConfirmDepositFunctionality(){
//        sterlingBank.registerNewCustomer("Shola", "sholatech@gig.inc");
//        String accNo = sterlingBank.getAccNumber();
//        sterlingBank.deposit(accNo, 3000);
//        assertEquals(3000, sterlingBank.checkBalance());
//    }
//}
