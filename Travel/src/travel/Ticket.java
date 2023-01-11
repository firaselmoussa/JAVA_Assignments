/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel;

import java.util.ArrayList;

/**
 *
 * @author Firas
 */
public class Ticket {
    //DATA FIELDS
    private String ticketNumber;
    private static int ticketsCounter;
    private ArrayList<Trip> trips;

    //CONSTRUCTOR
    public Ticket(){
        ticketsCounter++;
        ticketNumber = "TN"+ticketsCounter;
        ArrayList<Trip> trips = new ArrayList<>();
    }
    
    //ABSTRACT, ADDTRIP
    public void addTrip(Trip t){
        trips.add(t);
    }
    
    //ABSTRACT, REDUCE COST
    public void reduceCost(){
        for(int i = 0; i < trips.size(); i++){
            if(trips.get(i) instanceof TrainTrip)
                ((TrainTrip)trips.get(i)).economize();
            else if(trips.get(i) instanceof Flight)
                ((Flight)trips.get(i)).economize();
        }
    }

    //TO STRING
    @Override
    public String toString() {
        String s = "The ticket "+ticketNumber+" covers the following trips:\n";
        for(int i = 0; i < trips.size(); i++){
            s += i+". "+trips.get(i).toString()+"\n";
        }
        return s;
    }
    
    
    
    
}
