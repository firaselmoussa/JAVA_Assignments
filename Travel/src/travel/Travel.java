
import travel.Flight;
import travel.Ticket;
import travel.TrainTrip;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Firas
 */
public class Travel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ticket myTicket = new Ticket();
        
        myTicket.addTrip(new TrainTrip(true, "Prauge", "Vienna", 50));
        myTicket.addTrip(new TrainTrip(false, "Vienna", "Venice", 70));
        myTicket.addTrip(new Flight("First Class", "Venice", "Madrid", 170));
        
        System.out.println("Total cost of the ticket prior economizing: $"+myTicket.getTotalCost());
        
        System.out.println(myTicket.toString());
        
        myTicket.reduceCost();
        
        System.out.println(myTicket.toString());
        
        
        System.out.println("Total cost of the ticket After economizing: $"+myTicket.getTotalCost());
        
    }
    
}
