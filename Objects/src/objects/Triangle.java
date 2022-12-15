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
        perimeter = side1+side2+side3;
        area = Math.sqrt(perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3));
    }
    
    public Triangle(double side1, double side2, double side3, String color, boolean isFilled) {
        super(color, isFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        perimeter = side1+side2+side3;
        area = Math.sqrt(perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3));
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public boolean isIsFilled() {
        return isFilled;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    @Override
    public String toString() {
        return "Triangle{" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", area=" + area + ", perimeter=" + perimeter + '}';
    }
    
    
    
}
