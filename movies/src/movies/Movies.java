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
        

        System.out.println(movie.toString());
        System.out.println(movie.getDirector().toString());
        System.out.println("Actors: ");
        for(int i = 0; i > movie.getActors().length; i++){
            System.out.println(movie.getActors()[i].toString());
        }
        
        for(int i = 0; i > movie.getActors().length; i++){
            movie.getActors()[i].setAge(movie.getActors()[i].getAge()+1);
        }
        
        for(int i = 0; i > movie.getActors().length; i++){
            System.out.println(movie.getActors()[i].toString());
        }
    }
    
}
