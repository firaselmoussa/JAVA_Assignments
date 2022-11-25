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
    private boolean isVaccined;
    private static int numberOfPatients;
    
    public Patient(String name, int id, Vaccine vaccine, boolean isVaccined){
        this.name = name;
        if(id < 0)
            this.id = id*(-1);
        else
            this.id = id;
        this.vaccine = vaccine;
        this.isVaccined = isVaccined;
        numberOfPatients++;
    }
    
    public String getName(){
        return name;
    }
    
    public int getId(){
        return id;
    }
    
    public Vaccine getVaccine(){
        return vaccine;
    }
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setVaccine(Vaccine vaccine){
        this.vaccine = vaccine;
    }
    
    public String toString(){
        return "Name: "+name+", Id: "+id+", Vaccine: {"+vaccine.toString()+"} , Is Vaccined: "+isVaccined;
    }
}
