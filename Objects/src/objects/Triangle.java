/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objects;

/**
 *
 * @author Firas
 */
public class Triangle extends GeometricObject{
    private double side1, side2, side3 = 1.0;
    private double area, perimeter;
    
    public Triangle() {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public Triangle(double side1, double side2, double side3, String color, boolean isFilled) {
        super(color, isFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}
