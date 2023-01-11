/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel;

/**
 *
 * @author Firas
 */
public class Trip {
    private String departureCity, arrivalCity;
    private double basicPrice;

    public Trip(String departureCity, String arrivalCity, double basicPrice) {
        if (basicPrice < 0)
            throw new IllegalArgumentException();
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.basicPrice = basicPrice;
    }
    
    
}
