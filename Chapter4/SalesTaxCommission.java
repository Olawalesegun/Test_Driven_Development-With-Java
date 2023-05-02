public class SalesTaxCommission {


   /* 4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
    The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
    salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or
    a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
    these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items
    sold for last week and calculates and displays that salesperson’s earnings. There’s no limit to the num-
    ber of items that can be sold.*/

    /*  TODO:
    *   1.  Declare a class
    *   2.  declare the instance variables
    *   3.  Declare method
    *   4.  return earnings
    * */
    private double weeklyEarnings;
    private double weeklySales;

    /*public SalesTaxCommission getWeeklyEarnings(double weeklyEarnings){
        this.weeklyEarnings = weeklyEarnings;
        return this;
    }*/
    public SalesTaxCommission getWeeklySales(double weeklySales){
        this.weeklySales = weeklySales;
        return this;
    }
    public SalesTaxCommission getTaxCommission(){
        double taxPercent = 0.09;
        weeklyEarnings = weeklySales * taxPercent;
        return this;
    }
    public SalesTaxCommission getWeeklyEarnings(){
        double constantPay = 200;
        weeklyEarnings = weeklyEarnings + constantPay;
        System.out.println("Weekly Earnings is: " + weeklyEarnings);
        return this;
    }

    public static void main(String[] args) {
        SalesTaxCommission salesTax = new SalesTaxCommission();
        salesTax.getWeeklySales(5000).getTaxCommission().getWeeklyEarnings();

    }
}
