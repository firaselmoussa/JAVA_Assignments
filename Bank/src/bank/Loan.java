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
    
    String customerName;
    double loanAmount, interrest;
    int nbYears;
    
    public Loan(String customername, double loanAmount, double interrest, int nbyears){
        this.customerName = customername;
        this.interrest = interrest;
        this.loanAmount = loanAmount;
        this.nbYears = nbyears;
    }
    
}
