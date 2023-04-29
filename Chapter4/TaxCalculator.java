import java.math.BigDecimal;
public class TaxCalculator {

   /* 4.20 (Tax Calculator) Develop a Java application that determines the total tax for each of three
    citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
    earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
    a given year. Your program should input this information for each citizen, then determine and dis-
    play the citizen’s total tax. Use class Scanner to input the data.*/

    //  TODO:
    //  1. Declare a class
    //  2. Declare instance variable of the object (taxrate: double, citizenEarning: BigDecimal, citizenName: String
    //  3. Declare a setter and getter
    //  4. Declare a method to carry out the tax calculation
    //  5. return citizenTotalTax

    private Double taxRate;
    private BigDecimal citizenEarning;
    private String citizenName;

    public TaxCalculator(String citizenName, BigDecimal citizenEarning, Double taxRate){
        this.citizenName = citizenName;
        this.citizenEarning = citizenEarning;
        this.taxRate = taxRate;
    }
    public void setTaxRate(double taxRate){
        this.taxRate = taxRate;
    }
    public Double getTaxRate() {
        return taxRate;
    }
    public void setCitizenEarning(BigDecimal citizenEarning){
        this.citizenEarning = citizenEarning;
    }
    public BigDecimal getCitizenEarning(){
        return citizenEarning;
    }
    public void setCitizenName(String citizenName){
        this.citizenName = citizenName;
    }
    public String getCitizenName(){
        return citizenName;
    }

    public BigDecimal taxCalculator(String name, BigDecimal earning){
        BigDecimal conditionForTaxRate = BigDecimal.valueOf(30000);
        BigDecimal totalTax;
        if(earning.compareTo(conditionForTaxRate) > 0){
            setTaxRate(0.20);
            double tax = getTaxRate();
            BigDecimal citizenTax = earning.multiply(BigDecimal.valueOf(tax));
            totalTax = citizenTax.add(earning);
            System.out.println(name + "'s" + " tax is: ");
        }
        else{
            setTaxRate(0.15);
            double tax = getTaxRate();
            BigDecimal citizenTax = earning.multiply(BigDecimal.valueOf(tax));
            totalTax = earning.add(citizenTax);
            //totalTax = citizenTax.multiply(BigDecimal.valueOf(earning));
            System.out.println(name + "'s" + " tax is: ");

        }
        return totalTax;
    }
}
