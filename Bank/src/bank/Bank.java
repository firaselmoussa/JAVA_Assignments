/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

import java.util.ArrayList;
import java.util.Scanner;

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
                
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Loan type:\nCar: 'c'\nHome: 'h'");
        String user_choice = input.next();
        
        //CREATED ARRAY LIST & OBJECTS
        ArrayList<Loan> loans = new ArrayList<>();
        loans.add(new CarLoan("SUV", 499.9, "Jhon Doe", 6000, 7, 4));
        loans.add(new CarLoan("Minivan", 200.0, "Jhon Cena", 4000, 5, 2));
        loans.add(new HomeLoan("CityX, StreetXX", 4, "Jhon Doe", 40000, 6, 9));
        loans.add(new HomeLoan("CityY, StreetXX", 10, "Jhon Cena", 90000, 8, 12));
        
        
        //DISPLAYED DATA
        System.out.println("LOANS DATA: ");
        for(int i = 0; i < loans.size(); i++){
            System.out.println(loans.get(i).toString());
        }
        
        //DISPLAYED FINAL AMOUNT
        System.out.print("Final Amount of Loans: ");
        for(int i = 0; i < loans.size(); i++){
            if(loans.get(i) instanceof bank.CarLoan)
                try{
                    System.out.print(((CarLoan)loans.get(i)).finalAmount()+" ");
                }catch(NoSuchMethodError e){
                    System.out.println(e);
                }
                
            else if(loans.get(i) instanceof bank.HomeLoan)
                try{
                    System.out.print(((HomeLoan)loans.get(i)).finalAmount(80)+" ");
                }catch(NoSuchMethodError e){
                    System.out.println(e);
                }
            
            //BREAKLINE
            if(i >= loans.size()-1)
                System.out.println("");
        }
        
        //DISPLAYING INSURANCE FEE OF CAR_LOANS
        System.out.print("Insurance Fee of car Loans: ");
        for(int i = 0; i < loans.size(); i++){
            if(loans.get(i) instanceof bank.CarLoan)
                System.out.print(((CarLoan)loans.get(i)).getInsuranceFee()+" ");
            
        }
        

    }
    
}
