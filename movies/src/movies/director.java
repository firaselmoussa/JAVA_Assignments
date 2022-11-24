/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movies;

/**
 *
 * @author Firas
 */
public class Director {
    //DATA FIELDS
    private String name;
    private String nationality;
    private int age;
    private String gender;
    private boolean isRetired;
    
    //CONSTRUCTOR
    public Director(String name, String nationality, int age, String gender, boolean isRetired){
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.gender = gender;
        this.isRetired = isRetired;
    }
    
    //GETTER METHODS
    public String getName(){
        return name;
    }
    
    public String getNationality(){
        return nationality;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getGender(){
        return gender;
    }
    
    public boolean isRetired(){
        return isRetired;
    }
    
    //SETTER METHODS
    public void setName(String name){
        this.name = name;
    }
    
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    
    public void setAge(int age){
        this.age= age;
        if (age >= 70)
                isRetired = true;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public void setisRetired(boolean isRetired){
        this.isRetired = isRetired;
    }
    
    //DESCRIPTION
    public String toString(){
        return "Director: "+name+"\nNationality: "+nationality+"\nAge: "+age+"\nGender: "+gender+"\nRetired: "+isRetired;
    }
}
