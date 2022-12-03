/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company;

/**
 *
 * @author Firas
 */
public class Head {
    int jobType; //0 = Administrative && 1 = Technical
    String firstName, lastName;
    int age, id;
    
    public Head(String firstName, String lastName, int age, int jobType){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.jobType = jobType;
        
        id = firstName.charAt(0)+lastName.charAt(0)+'#'+age;
    }
    
    public void setJobType(int jobType){
        this.jobType = jobType;
    }
    
    public String toString(){
        return "Name:"+firstName+" "+lastName+"\nId: "+id+"\nJob Type: "+jobType;
    }
    
    
}
