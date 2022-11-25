/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Firas
 */
public class Patient {
    private String name;
    private int id;
    private Vaccine vaccine;
    
    public Patient(String name, int id, Vaccine vaccine){
        this.name = name;
        if(id < 0)
            this.id = id*(-1);
        else
            this.id = id;
        this.vaccine = vaccine;
    }
}
