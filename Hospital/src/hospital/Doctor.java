/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Firas
 */
public class Doctor {
    private String name;
    private int id;
    private Vaccine vaccine;
    private boolean isVaccined;
    private static int numberOfDoctors;
    
    public Doctor(String name, int id, Vaccine vaccine, boolean isVaccined){
        this.name = name;
        if(id < 0)
            this.id = id*(-1);
        else
            this.id = id;
        this.vaccine = vaccine;
        this.isVaccined = isVaccined;
        numberOfDoctors++;
    }
    
}
