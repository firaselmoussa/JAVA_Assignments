/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy;

/**
 *
 * @author Firas
 */
public class Medicine {
    
    protected String name;
    protected double price;

    public Medicine(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Medicine{" + "name=" + name + ", price=" + price + '}';
    }
    
    
}
