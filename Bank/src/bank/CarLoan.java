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
    
    //DATA FIELDS
    private String carType;
    private double insuranceFee;

    
    //CONSTRUCTOR
    public CarLoan(String carType, double insuranceFee, String customerName, double loanAmount, double interrest, int nbYears) {
        super(customerName, loanAmount, interrest, nbYears);
        this.carType = carType;
        this.insuranceFee = insuranceFee;
    }

    
    //GETTERS
    public String getCarType() {
        return carType;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    
    //SETTERS
    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }
    
    
    //FINAL AMOUNT METHOD
    public double finalAmount(double tax){
        return super.getLoanAmount()+insuranceFee;
    }

    
    //TOSTRING METHOD
    @Override
    public String toString() {
        return "CarLoan{" + "carType=" + carType + ", insuranceFee=" + insuranceFee + '}';
    }
    
    
}
