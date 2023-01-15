/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs;

/**
 *
 * @author Firas
 */
public class text extends DataType{

    protected String value;
    protected int length;

    public text(String name, String value, int length) {
        super(name);
        this.value = value;
        this.length = length;
    }
    
    public String getName(){
        return name;
        
    } 
    
    public void setValue(String value){
        this.value = value;
    }
    @Override
    public String add(DataType d) {
       return name+" + "+d.name+" = "+this.value.concat(((text)d).value);
    }

    @Override
    public String toString() {
        return "DataType: "+name+" of type "+this.getClass()+" with value = "+ value;
    }
    
   
}

