/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel;

/**
 *
 * @author Firas
 */
public class Flight extends Trip implements Economize{
    //DATA FIELDS
    private String seatClass;

    //CONSTRUCTOR
    public Flight(String seatClass, String departureCity, String arrivalCity, double basicPrice) {
        super(departureCity, arrivalCity, basicPrice);
        
        if(seatClass != "First Class" && seatClass != "Economic")
            throw new IllegalArgumentException();
        
        this.seatClass = seatClass;
    }

    //ABSTRACT, CALCULATE COST
    @Override
    public double calculateCost() {
        if(this.seatClass == "First Class")
            return (this.getBasicPrice()*2.5);
                
        return this.getBasicPrice();
    }

    //ABSTRACT, ECONOMIZE
    @Override
    public void economize() {
        this.seatClass = "Economic";
    }
    
    //TO STRING
    @Override
    public String toString() {
        return "A flight departing from "+this.getDepartureCity()+" to "+this.getArrivalCity()+" for a basic price of "+this.getBasicPrice()+"$."+"\nseat class reserved for this flight is "+seatClass+".";
      
    }
}
