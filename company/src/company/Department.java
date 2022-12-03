/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company;

/**
 *
 * @author Firas
 */
public class Department {
    String name, id;
    
    public Department(String name){
        this.name = name;
        id = name.substring(0, 3).toUpperCase();
    }
    
}
