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
    
    //DATA FIELDS
    String color;
    boolean isFilled;
    
    
    //NO-ARGS CONSTRUCTOR
    public GeometricObject() {
        color = "Black";
        isFilled = false;
    }
    
    
    //CONSTRUCTOR
    public GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    
    //GETTERS
    public String getColor() {
        return color;
    }

    public boolean isIsFilled() {
        return isFilled;
    }
    
    
    //SETTERS
    public void setColor(String color) {
        this.color = color;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
    
    //TOSTRING METHOD
    @Override
    public String toString() {
        return "GeometricObject{" + "color=" + color + ", isFilled=" + isFilled + '}';
    }
    
}
