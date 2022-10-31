package countries;

import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Firas
 */
public class Country {
    
//    declaring variables
    private String name, countryCode, continent;
    private double area;
    private int population;
    
//    creating map of continents
    private static final Map<String, String> continents = new HashMap<>();
    static {
        continents.put("africa", "1");
        continents.put("america", "2");
        continents.put("asia", "3");
        continents.put("oceania", "4");
        continents.put("europe", "5");
    }
    
//    Country constructor
    public Country( String givenName,
                    String givenContinent,
                    double givenArea,
                    int givenPopulation ){
        
        name = givenName;
        continent = givenContinent;
        area = givenArea;
        population = givenPopulation;
   
//        extracting country code
        countryCode = givenName.substring(0, 3) +'-'+continents.get(givenContinent.toLowerCase());

    }
    
//    All getter methods 
    public String getName(){
        return name;
    }
    
    public String getContinent(){
        return continent;
    }
    
    public String getCountryCode(){
        return countryCode;
    }
    
    public double getArea(){
        return area;
    }
    
    public int getPopulation(){
        return population;
    }
 
//    All setter methods
    public void setArea(double newArea){
        area = newArea;
    }
    
    public void setPopulation(double newPopulation){
        area = newPopulation;
    }
    
//    To String method
    public String toString(){
        return name + "'s population is " + population + ", area is" + area + ", population is" + population +"and its code is " + countryCode;
    }
}
