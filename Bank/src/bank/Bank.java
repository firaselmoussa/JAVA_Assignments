/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

import java.util.ArrayList;

/**
 *
 * @author Firas
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        
        ArrayList<Loan> loans = new ArrayList<>();
        loans.add(new CarLoan("SUV", 499.9, "Jhon Doe", 6000, 7, 4));
        loans.add(new CarLoan("Minivan", 200.0, "Jhon Cena", 4000, 5, 2));
        loans.add(new HomeLoan("CityX, StreetXX", 4, "Jhon Doe", 40000, 6, 9));
        loans.add(new HomeLoan("CityY, StreetXX", 10, "Jhon Cena", 90000, 8, 12));
        
        
        for(int i = 0; i < loans.size(); i++){
            System.out.println(loans.get(i).toString());
        }
       
        for(int i = 0; i < loans.size(); i++){
            if(loans.get(i) instanceof bank.CarLoan)
                System.out.println(((CarLoan)loans.get(i)).getInsuranceFee());
        }
        

    }
    
}
