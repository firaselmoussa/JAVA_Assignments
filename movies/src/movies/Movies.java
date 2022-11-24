/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movies;

/**
 *
 * @author Firas
 */
public class Movies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Director director = new Director("Alex", "Spanish", 25, "Male", false);
        
        Actor actors[] = { new Actor("John", "American", 58, "Male", false, true), 
                           new Actor("Emily", "French", 24, "Female", false, true),
                           new Actor("Tina", "American", 44, "Female", false, false), 
                           new Actor("Leon", "American", 31, "Male", false, false),
                           new Actor("Joanna", "British", 43, "Female", false, false), 
                           new Actor("Hugh", "Irish", 69, "Male", false, false)};
        
        Movie movie = new Movie("hobs", "fantasy", director, actors);
        


    }
    
}
