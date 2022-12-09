/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Firas
 */
public class HomeLoan extends Loan{
    
    private String homeAddress;
    private int nbOfRooms;
    
    public HomeLoan(String homeAddress, int nbOfRooms, String customerName, double loanAmount, double interrest, int nbYears){
        super(customerName, loanAmount, interrest, nbYears);
        this.homeAddress = homeAddress;
        this.nbOfRooms = nbOfRooms;
    }
    
}
