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

    public String getColor() {
        return color;
    }

    public boolean isIsFilled() {
        return isFilled;
    }
    
    
    public void setColor(String color) {
        this.color = color;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
    
    
    @Override
    public String toString() {
        return "GeometricObject{" + "color=" + color + ", isFilled=" + isFilled + '}';
    }
    
}
