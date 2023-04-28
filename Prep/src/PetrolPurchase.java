import java.util.Scanner;
public class PetrolPurchase {
    Scanner userInput = new Scanner(System.in);
   /* Create a class called PetrolPurchase to represent information about the petrol you purchase.
    The class should include five pieces of information in the form of instance variables—the station’s
    location (type String), the type of petrol (type String), the quan-tity (type int) of the purchase
    in liters, the price per liter (double), and the percentage discount (double). Your class should
    have a constructor that initializes the five instance variables. Provide a
    set and a get method for each instance variable. In addition, provide a method named getPurchase-
    Amount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
    minus the discount, then returns the net amount you had to pay as a double value. Write an appli-
    cation class named Petrol that demonstrates the capabilities of class PetrolPurchase.*/


    //TODO:
    //  1. Create a Class
    //  2. Create instance variable (stationLocation: String, petrolType: String,
    //          petrolQuantity: int, pricePerLitre: double, percentageDiscount: double).
    //  3. Declare and initialize a constructor
    //  4. Declare a setter and a getter for all instance variable
    //  5. Declare a method getPurchase:
    //      The method getpurchase calculates the net purchase (quantity * price per litre) - discount
    //  6. returns net amount

    private String stationLocation;
    private String petrolType;
    private int petrolQuantity;
    private double pricePerLitre;
    private double percentageDiscount;

   /* public static void main(String[] args) {

    }*/

    public PetrolPurchase(String stationLocation, String petrolType, int petrolQuantity, double pricePerLitre, double percentageDiscount){
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.petrolQuantity = petrolQuantity;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }
    public void setStationLocation(String stationLocation){
        this.stationLocation = stationLocation;
    }
    public String getStationLocation(){
        return stationLocation;
    }
    //2
    public void setPetrolType(String petrolType){
        this.petrolType = petrolType;
    }
    public String getPetrolType(){
        return petrolType;
    }
    public void setPetrolQuantity(int petrolQuantity){
        this.petrolQuantity = petrolQuantity;
    }
    public int getPetrolQuantity(){
        return petrolQuantity;
    }
    public void setPricePerLitre(double pricePerLitre){
        this.pricePerLitre = pricePerLitre;
    }
    public double getPricePerLitre(){
        return pricePerLitre;
    }
    public void setPercentageDiscount(double percentageDiscount){
        this.percentageDiscount = percentageDiscount;
    }
    public double getPercentageDiscount(){
        return percentageDiscount;
    }

    public double getPurchase(int quantity, double discount, double ppl){
        double netPurchase = (quantity * ppl) - discount;
        return netPurchase;

        /*//The method getpurchase calculates the net purchase (quantity * price per litre) - discount
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the required quantity");
        int qty = userInput.nextInt();
        setPetrolQuantity(qty);
        System.out.println("Enter the price per litre");
        double quantity = getPetrolQuantity();
        double ppl = getPricePerLitre();
        double discount = getPercentageDiscount();*/
    }



}
