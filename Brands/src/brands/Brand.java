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
    
    
}
