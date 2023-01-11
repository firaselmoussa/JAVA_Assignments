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
    private String ticketNumber;
    private static int ticketsCounter;
    private ArrayList<Trip> trips;

    public Ticket(){
        ticketsCounter++;
        ticketNumber = "TN"+ticketsCounter;
        ArrayList<Trip> trips = new ArrayList<>();
    }
    
}
