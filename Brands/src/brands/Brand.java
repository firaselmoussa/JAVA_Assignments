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
    
    private String Title, HeadQuarters;
    private int numberOfProducts = 0;
    
    
    public Brand(String name, String HeadQuarters){
        Title = name;
        this.HeadQuarters = HeadQuarters;
    }
    
    
    public String getTitle(){
        return Title;
    }
    
    public String getHeadQuarters(){
        return HeadQuarters;
    }
    
    public int getNumberOfProducts(){
        return numberOfProducts;
    }
    
    
    public void setTitle(String Title){
        this.Title = Title;
    }
    
    public void setHeadQuarters(String HeadQuarters){
        this.HeadQuarters = HeadQuarters;
    }
    
    public void setNumberOfProducts(int numberOfProducts){
        this.numberOfProducts = numberOfProducts;
    }
    
    
    public String toString(){
        return "Btrand: "+Title+", "+HeadQuarters+", "+numberOfProducts+" products";
    }
}
