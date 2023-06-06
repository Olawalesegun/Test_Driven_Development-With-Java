package e_store;

public class CreditCardInformation{

    private String cvv;
    private String cardExpirationYear;
    private String cardExpirationMonth;
    private String creditCardNumber;
    private String nameOfCard;
    private CardType cardType;

    public CreditCardInformation(String cvv, String cardExpirationYear, String cardExpirationMonth,
                                 String creditCardNumber, String nameOfCard, CardType cardType){
        this.cvv = cvv;
        this.cardExpirationYear = cardExpirationYear;
        this.cardExpirationMonth = cardExpirationMonth;
        this.creditCardNumber = creditCardNumber;
        this.nameOfCard = nameOfCard;
        this.cardType = cardType;

    }
}