/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company;

/**
 *
 * @author Firas
 */
public class Department {
    String name, id;
    Head headEmployee;
    
    public Department(String name, Head headEmployee){
        this.name = name;
        this.headEmployee = headEmployee;
        id = name.substring(0, 3).toUpperCase();
    }
    
    public void setHead(Head headEmployee){
        this.headEmployee = headEmployee;
    }
    
    public Head getHead(){
        return headEmployee;
    }
    
    public String toString(){
        return "Name: "+name+"\nHead: {\n"+headEmployee.toString()+"\n}";
    }
    
}
