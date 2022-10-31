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
    
    private String name, countryCode, continent;
    private double area;
    private int population;
    
    private static final Map<String, String> continents = new HashMap<>();
    static {
        continents.put("Africa", "1");
        continents.put("America", "2");
        continents.put("Asia", "3");
        continents.put("Oceania", "4");
        continents.put("Europe", "5");
    }
    
    
    public Country( String givenName,
                    String givenContinent,
                    double givenArea,
                    int givenPopulation ){
        
        name = givenName;
        continent = givenContinent;
        area = givenArea;
        population = givenPopulation;
        
        String[] nameArr = name.split("");
   
        countryCode = nameArr[0]+nameArr[1]+nameArr[2]+'-'+continents.get(givenContinent);

    }
    
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
 
}
