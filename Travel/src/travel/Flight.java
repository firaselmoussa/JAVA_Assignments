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
    private String seatClass;

    public Flight(String seatClass, String departureCity, String arrivalCity, double basicPrice) {
        super(departureCity, arrivalCity, basicPrice);
        this.seatClass = seatClass;
    }

    
    @Override
    public double calculateCost() {
        
    }

    @Override
    public void economize() {
        
    }
    
    
}
