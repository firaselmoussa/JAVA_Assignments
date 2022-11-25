/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Firas
 */
public class Vaccine {
    
    //DATA FIELDS
    private String name;
    private String expiryDate;
    private int dose;
    
    //CONSTRUCTOR
    public Vaccine(String name, String expiryDate, int dose){
        this.name = name;
        this.expiryDate = expiryDate;
        this.dose = dose;
    }
    
    //GETTERS
    public String getName(){
        return name;
    }
    
    public String getExpiryDate(){
        return expiryDate;
    }
    
    public int getDose(){
        return dose;
    }
    
    //SETTERS
    public void setName(String name){
        this.name = name;
    }
    
    public void setExpiryDate(String expiryDate){
        this.expiryDate = expiryDate;
    }
    
    public void setDose(int dose){
        this.dose =  dose;
    }
    
    //EXTRACT EXPIRY YEAR
    public String extractYear(){
        return expiryDate.substring(-4, -1);
    }
    
    //TOSTRING METHOD
    public String toString(){
        return "Name: "+name+", Dose: "+dose+", Expire at: "+expiryDate;
    }
    
}
