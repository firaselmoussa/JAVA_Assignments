/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy;

/**
 *
 * @author Firas
 */
public class Prescription extends Medicine{
    
    String code;

    public Prescription(String code, String name, double price) {
        super(name, price);
        this.code = code;
    }

    @Override
    public String toString() {
        return "Prescription{" + "code=" + code + '}';
    }
    
    
    
}
