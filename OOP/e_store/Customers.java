package e_store;

import java.util.ArrayList;

public class Customers extends Users{
    private ArrayList<BillingInformation> billingInformation;
    private ShoppingCart shoppingCart;
    public Customers(String name, int age, String emailAddress, String password, String phoneNumber){
       this.name = name;
       this.age = age;
       this.emailAddress = emailAddress;
       this.password = password;
       this.phoneNumber = phoneNumber;

    }

}
