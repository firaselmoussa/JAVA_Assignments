/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

/**
 *
 * @author Firas
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vaccine cov_19 = new Vaccine("cov-19", "01/01/2032", 90);
        
        Patient sick_bob = new Patient("Bob", 8759, cov_19, false);
        
        Doctor Dr_Jean = new Doctor("Jean", 224, cov_19, true);


     
    }
    
}
