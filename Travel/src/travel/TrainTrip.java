/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel;

/**
 *
 * @author Firas
 */
public class TrainTrip extends Trip implements Economize{
    //DATA FIELDS
    private boolean isVIP;

    //CONSTRUCTOR
    public TrainTrip(boolean isVIP, String departureCity, String arrivalCity, double basicPrice) {
        super(departureCity, arrivalCity, basicPrice);
        this.isVIP = isVIP;
    }
    
  

    //ABSTRACT, CALCULATE COST
    @Override
    public double calculateCost() {
        double cost = this.getBasicPrice();
        if(isVIP)
            cost =+100;
            
        return cost;
        
    }

    //ABSTRACT, ECONOMIZE
    @Override
    public void economize() {
        isVIP = false;
    }

    //TO STRING
    @Override
    public String toString() {
        String s = "A train trip departing from "+this.getDepartureCity()+" to "+this.getArrivalCity()+" for a basic price of 270$.";
        if(isVIP)
            s += "\nIt is a VIP reservation.";
        else
            s += "\nIt is NOT a VIP reservation.";
        
        return s;
    }

   
}
