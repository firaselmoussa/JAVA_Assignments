/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movies;

/**
 *
 * @author Firas
 */
public class Actor {
    private String name;
    private String nationality;
    private int age;
    private String gender;
    private boolean isRetired;
    private boolean isMainCharacter;
    
    public Actor(String name, String nationality, int age, String gender, boolean isRetired, boolean isMainCharacter){
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.gender = gender;
        this.isRetired = isRetired;
        this.isMainCharacter = isMainCharacter;
    }
}
