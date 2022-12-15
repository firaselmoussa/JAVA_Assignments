/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objects;

/**
 *
 * @author Firas
 */
public class GeometricObject {
    String color;
    boolean isFilled;
    
    public GeometricObject() {
        color = "Black";
        isFilled = false;
    }
    
    public GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }
    
}
