/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Firas
 */
public class Loan {
    
    private String customerName;
    private double loanAmount, interrest;
    private int nbYears;

    public Loan(String customerName, double loanAmount, double interrest, int nbYears) {
        this.customerName = customerName;
        this.loanAmount = loanAmount;
        this.interrest = interrest;
        this.nbYears = nbYears;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getInterrest() {
        return interrest;
    }

    public int getNbYears() {
        return nbYears;
    }
    
    
    
    
    
    
}
