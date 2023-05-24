package creditCardValidator;

public class CreditCardValidateTemplate {

    private String cardType;
    private String cardNumber;
    private int cardDigitLength;
    private String cardValidityStatus;

    public CreditCardValidateTemplate(String cardType, String cardNumber,
                                      int cardDigitLength, String cardValidityStatus){
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cardDigitLength = cardDigitLength;
        this.cardValidityStatus = cardValidityStatus;
    }
    public void setCardType(String cardType){
        this.cardType = cardType;
    }
    public String getCardTyp(){
        return cardType;
    }
    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public String cardNumber(){
        return cardNumber
    }

}
