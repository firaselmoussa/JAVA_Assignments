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
    
    private String name, type, Quality;
    private Brand brand;
    private double price;
    private static int numberOfProducts = 0;
    
    
    public Product(String name, String type, Brand brand){
        this.name = name;
        this.type = type;
        this.brand = brand;
        numberOfProducts++;
        
        brand.setNumberOfProducts(brand.getNumberOfProducts()+1);
    }
    
}
