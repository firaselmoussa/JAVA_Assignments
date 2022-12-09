/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Firas
 */
public class CarLoan extends Loan{
    private String carType;
    private double insuranceFee;

    public CarLoan(String carType, double insuranceFee, String customerName, double loanAmount, double interrest, int nbYears) {
        super(customerName, loanAmount, interrest, nbYears);
        this.carType = carType;
        this.insuranceFee = insuranceFee;
    }

    public String getCarType() {
        return carType;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }
    
    
    
    
    
}
