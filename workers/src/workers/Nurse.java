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
    private double basicSalary;
    private int overtime;
    private boolean hasChildren;
    
    public Nurse(String name, char timing, int overtime, boolean hasChild){
        this.name = name;
        this.timing = timing;
        this.overtime = overtime;
        this.hasChildren = hasChild;
    }
    
}
