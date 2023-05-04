public class ParkingCharges {

    /*
    Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
    hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
    hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
    longer than 24 hours at a time. Write an application that calculates and displays the parking charges
    for each customer who parked in the garage yesterday. You should enter the hours parked for each
    customer. The program should display the charge for the current customer and should calculate and
    display the running total of yesterday’s receipts. It should use the method calculateCharges to de-
    termine the charge for each customer.
    */
    // TODO:
    //    1. Declare a class
    //    2. Declare instance Variable (parkingHoursUsed: double, totalReceipt: int)
    //    3. Declare a setter and getter in one
    //    3. If HoursPent is not greater than 24hours:
    //    4.        display parking charges for each customer
    //    5.        Enter the number of hours parked for each customer
    //    6.        Display the charge for current customer
    //    7.        Calc and Display the running total expenses
    //    8. Declare method calculateCharges to determine charge for customers

    private double parkingHours;
    private static int totalReceipts;

    public ParkingCharges(double parkingHours){
        this.parkingHours = parkingHours;
    }
    public double getParkingHours( double parkingHours){
        if(parkingHours>0) this.parkingHours = parkingHours;
        else{
            this.parkingHours = parkingHours;
            parkingHours = 0;
        }
       /* if(parkingHours>0 && parkingHours<24){
            this.parkingHours = parkingHours;
        }
        else if(parkingHours > 24){
            this.parkingHours = parkingHours;
            parkingHours = 1;
        }
        else{
            this.parkingHours = parkingHours;
            parkingHours = 1;
        }*/
        return parkingHours;
    }
    public int getTotalReceipts(){
        totalReceipts++;
        return totalReceipts;
    }

    public double calculateCharges(double hourSpent){
        double hour = hourSpent;
        double charge = 0;
        double chargeFor3Hour;
        double chargeForHoursExceeds3Hour = 0;
        if(hour <= 3 && hour > 0){
            chargeFor3Hour = 2.0;
            charge = chargeFor3Hour * hour;
        }
        else if(hour > 3 && hour < 24){
            chargeForHoursExceeds3Hour = 2.0 + 0.50;
            charge = chargeForHoursExceeds3Hour * hour;
        }
        else if(hour > 0 && hour > 24){
            charge = 10;
        }
        if(charge>= 10){
            charge = 10;
        }
        if(charge<=10.00){
           getTotalReceipts();
        }
        System.out.println("The number of times, this receipt was printed is: " + getTotalReceipts());
        return charge;
    }


   /* private double parkingHoursUsed;
    private double garageChargeUpTo3Hour;
    private double chargeExceeds3Hour;
    private double maxChargeUpTo24Hour;
    private double expenses;

    public ParkingCharges(double parkingHoursUsed, double garageChargeUpTo3Hour, double chargeExceeds3Hour, double maxChargeUpTo24Hour){
        this.parkingHoursUsed = parkingHoursUsed;
        this.garageChargeUpTo3Hour = garageChargeUpTo3Hour;
        this.chargeExceeds3Hour = chargeExceeds3Hour;
        this.maxChargeUpTo24Hour = maxChargeUpTo24Hour;
    }
    public double getParkingHoursUsed(double parkingHoursUsed){
        this.parkingHoursUsed = parkingHoursUsed;
        return parkingHoursUsed;
    }
    public double getGarageChargeUpTo3Hour(double garageChargeUpTo3Hour){
        this.garageChargeUpTo3Hour = garageChargeUpTo3Hour;
        if(garageChargeUpTo3Hour<=3 && garageChargeUpTo3Hour>0){
            garageChargeUpTo3Hour = 2;
        }
        else{
            garageChargeUpTo3Hour = 0;
        }
        return garageChargeUpTo3Hour;
    }
    public double getChargeExceeds3Hour(double chargeExceeds3Hour){
        if(chargeExceeds3Hour > 3 && chargeExceeds3Hour <24){
            chargeExceeds3Hour = 0.50 + garageChargeUpTo3Hour;
        }else{
            chargeExceeds3Hour = 0;
        }
        return chargeExceeds3Hour;
    }
    public double getMaxChargeUpTo24Hour(){
        if(parkingHoursUsed == 24){
            maxChargeUpTo24Hour = 20;
        }
        return maxChargeUpTo24Hour;
    }

    public double calculateCharge(double parkingHoursUsed){
        if(parkingHoursUsed > 3){
            get
        }
    }*/
}
