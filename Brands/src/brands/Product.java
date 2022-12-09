/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brands;

/**
 *
 * @author Firas
 */
public class Product {
    
    //DATA FIELDS
    private String name, type, Quality;
    private Brand brand;
    private double price;
    private static int numberOfProducts = 0;
    
    
    //CONSTRUCTOR
    public Product(String name, String type, Brand brand){
        this.name = name;
        this.type = type;
        this.brand = brand;
        numberOfProducts++;
        
        brand.setNumberOfProducts(brand.getNumberOfProducts()+1);
    }

    
    //GETTERS
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getQuality() {
        return Quality;
    }

    public Brand getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public static int getNumberOfProducts() {
        return numberOfProducts;
    }

    
    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuality(String Quality) {
        this.Quality = Quality;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void setNumberOfProducts(int numberOfProducts) {
        Product.numberOfProducts = numberOfProducts;
    }
    
    
    //TOSTRING METHOD
    public String toString(){
        return brand.toString()+"\nThe product "+name+" is "+Quality+" "+type+", its price is "+(int)price+"$";
    }
    
    
}
