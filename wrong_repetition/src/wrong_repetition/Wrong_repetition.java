/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wrong_repetition;

import java.util.Scanner;

/**
 *
 * @author Firas
 */
public class Wrong_repetition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        
        String input = myScanner.nextLine();

        String[] inputArr = input.split(" ");
        
        String output = input;
        
        for(int i = 0; i < inputArr.length-1; i++){
            
            if(inputArr[i].equals(inputArr[i+1])){
                output = output.replaceFirst(inputArr[i], "");
            }
        }
        
        if(!input.equals(output)){
            System.out.println("The sentence includes wrong repetitions.");
            System.out.println("The sentence should be: "+ output);
        }else{
            System.out.println("There are no wrong repetitions");
        }
    }
    
}
