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
        
        //SCANNER OBJECT
        Scanner scan = new Scanner(System.in);
        
        //LOOP TERMINATION VARIABLE
        String loop_termination;
        
        
        //PROGRAM LOOP
        do{
            
            System.out.print("\nNEW TRIANGLE\n"
                    + "---------------------------------------------------------"
                    + "\n\nChoose color: ");
            String color = scan.next();

            ////TRY USING USER INPUT
                try{
                    
                    //USER INPUT
                    System.out.print("Choose isFilled('true or false): ");
                    boolean isFilled;
                    if(scan.next().equalsIgnoreCase("true"))
                        isFilled = true;
                    else
                        isFilled = false;
                    System.out.print("Choose side1:");
                    double s1 = scan.nextDouble();
                    System.out.print("Choose side2:");
                    double s2 = scan.nextDouble();
                    System.out.print("Choose side3:");
                    double s3 = scan.nextDouble();


                    //CREATE TRIANGLE WITH USER INPUT
                    Triangle new_t = new Triangle(s1, s2, s3, color, isFilled);
                    System.out.println(new_t.toString());

                //CATCH WRONG INPUT EXCEPTIONS
                }catch(InputMismatchException e){

                    Class classX = (scan.next()).getClass();
                    System.out.println(e + "  =>  " +classX);

                 //CATCH ANY OTHER EXCEPTIONS
                }catch(Exception e){
                    System.out.println("Something went wrong \n"+e);
                }
                
            
            //PROMPT THE USER TO TERMINATE THE LOOP OR NOT
            System.out.println("Do you want to create another triangle? ('YES' or 'NO')");
            loop_termination = scan.next();
            
        }while(loop_termination.equalsIgnoreCase("YES")); //TERMINATE ACCORDING TO USER INPUT

    }
    
}
