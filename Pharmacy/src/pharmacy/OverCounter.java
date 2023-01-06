/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy;

/**
 *
 * @author Firas
 */
public class OverCounter extends Medicine implements Taxable{

    private boolean isSupplement;

    public OverCounter(boolean isSupplement, String name, double price) {
        super(name, price);
        this.isSupplement = isSupplement;
    }

    public boolean isIsSupplement() {
        return isSupplement;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    

    public void setIsSupplement(boolean isSupplement) {
        this.isSupplement = isSupplement;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    @Override
    public double findPriceAfterTax() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "OverCounter{" + "isSupplement=" + isSupplement + '}';
    }
    
    
}
