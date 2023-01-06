/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pharmacy;

/**
 *
 * @author Firas
 */
public class Pharmacy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Store store = new Store("Pharmacy", "street, city", 6);
        Prescription m1 =  new Prescription("Med11", "Medicine", 29.9);
        OverCounter o1 =  new OverCounter(true, "Medicine", 80);
        
        store.addMedicine(m1);
        store.addMedicine(new Prescription("Med33", "Med", 65));
        
        System.out.println(o1.findPriceAfterTax() +"\n"+store.buyMedicine("Medicine"));
       
        
    }
    
}
