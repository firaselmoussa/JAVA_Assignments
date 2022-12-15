/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objects;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Firas
 */
public class Objects {
    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String loop_termination;
        
        do{
            
            System.out.println("NEW TRIANGLE\n"
                    + "---------------------------------------------------------"
                    + "Choose color: ");
            String color = scan.next();
            
            
            
            System.out.println("Do you want to create another triangle? ('YES' or 'NO')");
            loop_termination = scan.next();
            
        }while(loop_termination.equalsIgnoreCase("YES"));

    }
    
}
