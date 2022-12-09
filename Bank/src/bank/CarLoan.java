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

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }
    
    
    public double finalAmount(double tax){
        return ((super.getLoanAmount()*Math.pow(1+super.getInterrest(), super.getNbYears())) + ((super.getLoanAmount()*Math.pow(1+super.getInterrest(), super.getNbYears()))*tax));
    }

    @Override
    public String toString() {
        return "CarLoan{" + "carType=" + carType + ", insuranceFee=" + insuranceFee + '}';
    }
    
    
}
