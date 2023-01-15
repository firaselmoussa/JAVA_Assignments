/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs;

/**
 *
 * @author Firas
 */
public class number extends DataType{
    protected int value;

    public number(int value, String name) {
        super(name);
        this.value = value;
    }
    
    public String getName(){
        return name;
    } 

    @Override
    public String add(DataType d) {
        int x = this.value+((number)d).value;
        return this.name+" + "+((number)d).name+" = "+x;
    }

    @Override
    public String toString() {
        return "DataType: "+this.name+" of type "+this.getClass()+" with value = "+this.value;
    }

  
}

