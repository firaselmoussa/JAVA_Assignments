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
    private static double basicSalary = 700;
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
    
    public double totalSalary(){
        return (hasChildren? (basicSalary + (15*overtime)) : (basicSalary + (15*overtime))+(basicSalary*.1));
    }
    
    public String toString(){
        String wt = timing == 'D'? "Day": "Night";
        return "Nurse: "+name+"\nWork Time: "+wt+"\n Salary: "+basicSalary+"\nOvertime: "+overtime+"\nTotal Salary: "+totalSalary();
    }
    
}
