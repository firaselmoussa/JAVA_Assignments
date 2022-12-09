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

    public String getHomeAddress() {
        return homeAddress;
    }

    public int getNbOfRooms() {
        return nbOfRooms;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setNbOfRooms(int nbOfRooms) {
        this.nbOfRooms = nbOfRooms;
    }
    
    
    //FINAL AMOUNT METHOD: CALCULATES FINAL AMOUNT AFTER TAXATION
    public double finalAmount(double tax){
        return ((super.getLoanAmount()*Math.pow(1+super.getInterrest(), super.getNbYears())) + ((super.getLoanAmount()*Math.pow(1+super.getInterrest(), super.getNbYears()))*tax));
    }
    
    
    
}
