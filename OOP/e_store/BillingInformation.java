package e_store;

public class BillingInformation {
    private String receiversPhoneNUmber;
    private String receiversName;
    private String deliveryAddress;
    CreditCardInformation[] creditCardInformation;

    public BillingInformation(String receiversName, String receiversPhoneNUmber, String deliveryAddress, CreditCardInformation[] creditCardInformation){
        this.receiversName = receiversName;
        this.receiversPhoneNUmber = receiversPhoneNUmber;
        this.deliveryAddress = deliveryAddress;
        this.creditCardInformation = creditCardInformation;
    }

}
