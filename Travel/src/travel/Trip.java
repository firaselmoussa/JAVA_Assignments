/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel;

/**
 *
 * @author Firas
 */
public abstract class Trip {
    
    //DATA FIELDS
    private String departureCity, arrivalCity;
    private double basicPrice;

    //CONSTRUCTOR
    public Trip(String departureCity, String arrivalCity, double basicPrice) {
        
        if (basicPrice < 0) 
            throw new IllegalArgumentException();   //THROWING EXCEPTION IF PRICE IS NEGATIVE
        
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.basicPrice = basicPrice;
    }

    //GETTERS
    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    //SETTERS
    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }
    
    
    //ABSTRACT METHOD
    public abstract double calculateCost();
    
}
