package creditCardValidator;

public class CreditCardTemplate {

    private String cardType;
    private String cardNumber;
    private int cardDigitLength;
    private String cardValidityStatus;

    public CreditCardTemplate(String cardType, String cardNumber, String cardValidityStatus){
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cardDigitLength = cardNumber.length();
        this.cardValidityStatus = cardValidityStatus;
    }
    public void setCardType(String cardType){
        this.cardType = cardType;
    }
    public String getCardType(){
        return cardType;
    }
    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public String getCardNumber(){
        return cardNumber;
    }
    public int getCardDigitLength(){
        return getCardNumber().length();
    }
    public void setCardValidityStatus(String validityStatus){
        this.cardValidityStatus = validityStatus;
    }
    public String getCardValidityStatus(){
        return cardValidityStatus;
    }

}
