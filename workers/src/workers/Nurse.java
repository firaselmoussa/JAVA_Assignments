/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workers;

/**
 *
 * @author Firas
 */
public class Nurse {
    
    private String name;
    private char timing;
    private static double basicSalary;
    private int overtime;
    private boolean hasChildren;
    
    public Nurse(String name, char timing, int overtime, boolean hasChild){
        this.name = name;
        this.timing = timing;
        this.overtime = overtime;
        this.hasChildren = hasChild;
    }
    
    public String getName(){
        return name;
    }
    
    public char getTiming(){
        return timing;
    }
    
    public double getBasicSalary(){
        return basicSalary;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setTiming(char newTiming){
        timing = newTiming;
    }
    
    public void setOverTime(int nbHours){
        overtime = nbHours;
    }
    
}
