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
    
    //DATA FIELDS
    private String customerName;
    private double loanAmount, interrest;
    private int nbYears;

    
    //CONSTRUCTOR
    public Loan(String customerName, double loanAmount, double interrest, int nbYears) {
        this.customerName = customerName;
        //limiting the interest rate
        if(interrest < 8)
            this.loanAmount = 8;
        if(interrest < 5)
            this.interrest = 5;
        else
            this.interrest = interrest;
        this.loanAmount = loanAmount;
        this.nbYears = nbYears;
    }

    //GETTERS
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

    
    //SETTERS
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setInterrest(double interrest) {
        this.interrest = interrest;
    }

    public void setNbYears(int nbYears) {
        this.nbYears = nbYears;
    }
    
    //toSTRING
    @Override
    public String toString() {
        return "Loan{" + "customerName=" + customerName + ", loanAmount=" + loanAmount + ", interrest=" + interrest + ", nbYears=" + nbYears + '}';
    }
    
}
