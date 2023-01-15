/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs;

/**
 *
 * @author Firas
 */
public abstract class DataType {
    protected String name;

    public DataType() {
        this.name = "NO NAME";
    }

    public DataType(String name) {
        this.name = name;
    }
    public abstract String add(DataType  d);

    @Override
    public String toString() {
        return "DataType: "+name;
    }
    
    
}

