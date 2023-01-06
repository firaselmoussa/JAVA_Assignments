/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy;

import java.util.LinkedList;

/**
 *
 * @author Firas
 */
public class Store {
    
    private String name, location;
    LinkedList<Medicine> medicines = new LinkedList<Medicine>();
    private int number_of_medicines;

    public Store(String name, String location, int number_of_medicines) {
        this.name = name;
        this.location = location;
        this.number_of_medicines = number_of_medicines;
    }

    @Override
    public String toString() {
        return "Store{" + "name=" + name + ", location=" + location + ", medicines=" + medicines + ", number_of_medicines=" + number_of_medicines + '}';
    }
    
    
    
}
