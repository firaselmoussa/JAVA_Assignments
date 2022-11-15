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
    
    public Country( String givenName,
                    String givenContinent,
                    double givenArea,
                    int givenPopulation ){
        
        name = givenName;
        continent = givenContinent;
        area = givenArea;
        population = givenPopulation;
        
        String[] nameArr = name.split("");
        countryCode = nameArr[0]+nameArr[1]+nameArr[2]+'-'+'1';
//        ((city.getName() == null) ? "N/A" : city.getName())
        
    }
    
    
}
