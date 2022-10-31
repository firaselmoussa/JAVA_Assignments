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
        
//        created Scanner
        Scanner myScanner = new Scanner(System.in);
        
//        prompted user to input a sentence
        System.out.print("Enter a sentence: ");
        
//        store user input
        String input = myScanner.nextLine();

//        split user input into array of words
        String[] inputArr = input.split(" ");
        
//        creating an output version of the users input
        String output = input;
        
//        looping over each word of the users input 
        for(int i = 0; i < inputArr.length-1; i++){
            
//            comparing each word with the word that comes next, if they match one gets removed 
            if(inputArr[i].equals(inputArr[i+1])){
                output = output.replaceFirst(inputArr[i], "");
            }
        }
        
//        printing out the result accordingly 
        if(!input.equals(output)){
            System.out.println("The sentence includes wrong repetitions.");
            System.out.println("The sentence should be: "+ output);
        }else{
            System.out.println("There are no wrong repetitions");
        }
    }
    
}
