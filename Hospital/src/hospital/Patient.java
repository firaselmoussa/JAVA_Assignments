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
    private boolean isVaccinated;
    private static int numberOfPatients;
    
    public Patient(String name, int id, Vaccine vaccine, boolean isVaccinated){
        this.name = name;
        if(id < 0)
            this.id = id*(-1);
        else
            this.id = id;
        this.vaccine = vaccine;
        this.isVaccinated = isVaccinated;
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
    
    public void setIsVaccinated(boolean isVaccinated){
        this.isVaccinated = isVaccinated;
    }
    
    public String toString(){
        return "Name: "+name+", Id: "+id+", Vaccine: {"+vaccine.toString()+"} , Is Vaccined: "+isVaccinated;
    }
}
