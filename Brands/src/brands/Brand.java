/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brands;

/**
 *
 * @author Firas
 */
public class Brand {
    
    //DATA FIELDS
    private String Title, HeadQuarters;
    private int numberOfProducts = 0;
    
    
    //CONSTRUCTOR
    public Brand(String name, String HeadQuarters){
        Title = name;
        this.HeadQuarters = HeadQuarters;
    }
    
    
    //GETTERS
    public String getTitle(){
        return Title;
    }
    
    public String getHeadQuarters(){
        return HeadQuarters;
    }
    
    public int getNumberOfProducts(){
        return numberOfProducts;
    }
    
    
    //SETTERS
    public void setTitle(String Title){
        this.Title = Title;
    }
    
    public void setHeadQuarters(String HeadQuarters){
        this.HeadQuarters = HeadQuarters;
    }
    
    public void setNumberOfProducts(int numberOfProducts){
        this.numberOfProducts = numberOfProducts;
    }
    
    //TO STRING METHOD
    public String toString(){
        return "Btrand: "+Title+", "+HeadQuarters+", "+numberOfProducts+" products";
    }
}
