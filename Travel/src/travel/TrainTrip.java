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
    private boolean isVIP;

    public TrainTrip(boolean isVIP, String departureCity, String arrivalCity, double basicPrice) {
        super(departureCity, arrivalCity, basicPrice);
        this.isVIP = isVIP;
    }
    
  

    @Override
    public double calculateCost() {
        
        return 0;
        
    }

    @Override
    public void economize() {
        
    }

   
    
}
