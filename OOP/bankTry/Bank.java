/*
package bank;
import java.security.SecureRandom;

public class Bank {
    private String bankAccName;
    private String bankAccEmail;
    private boolean confirmIfBankAccNameAndBankEmailIsProvided;
    private String accNumber;

    */
/*public Bank() {
        //this.confirmIfBankAccNameAndBankEmailIsProvided = confirmIfBankAccNameAndBankEmailIsProvided;
        this.accNumber = createBankAccountNumber();
    }*//*


    public void registerNewCustomer(String bankAccName, String bankAccEmail){
        this.bankAccName = bankAccName;
        this.bankAccEmail = bankAccEmail;
        this.accNumber = getAccNumber();
    }

    public String getBankAccName(){
        return bankAccName;
    }
    public String getBankAccEmail(){
        return bankAccEmail;
    }
    public String getAccNumber(){
        createBankAccountNumber();
        return accNumber;
    }
    private void createBankAccountNumber(){
        boolean confirmIfBankAccNameMeetsRequirement = ((bankAccName.length() > 2) && (bankAccName instanceof String));
        boolean confirmIfBankEmailMeetsRequirement = ((bankAccEmail.length() > 3) && (bankAccEmail instanceof String));
        confirmIfBankAccNameAndBankEmailIsProvided = confirmIfBankAccNameMeetsRequirement && confirmIfBankEmailMeetsRequirement;
        SecureRandom secRandom = new SecureRandom();
        if(confirmIfBankAccNameAndBankEmailIsProvided){
            StringBuilder stringCollector = new StringBuilder();
            int collector = 0;
            for(int count = 0; count<10; count++){
                collector = secRandom.nextInt(10);
                stringCollector.append(collector);
            }
            accNumber = stringCollector.toString();

        }
    }

    public void deposit(String accNo, int i) {
    }
}
*/
