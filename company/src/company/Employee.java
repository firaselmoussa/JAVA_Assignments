/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company;

/**
 *
 * @author Firas
 */
public class Employee {
    String firstName, lastName;
    int age, id;
    
    public Employee(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        
        id = firstName.charAt(0)+lastName.charAt(0)+'#'+age;
    }
}
