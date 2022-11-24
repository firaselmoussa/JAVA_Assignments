/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movies;

/**
 *
 * @author Firas
 */
public class Movie {
    private String name;
    private String genre;
    private String description;
    private Director director;
    private Actor actors[];
    private static int numberOfMovies;

    public Movie(String name, String genre, Director director, Actor actors[]){
        this.name = name;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        description = name+", "+genre;
        numberOfMovies++;
    }
    
    public Movie(String description, Director director, Actor actors[]){
        this.description = description;
        this.director = director;
        this.actors = actors;
        name = description.split(" ")[0];
        name = description.split(" ")[-1];
        numberOfMovies++;
    }
    
    public String getName(){
        return name;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public String getDescription(){
        return description;
    }
    
    public Director getDirector(){
        return director;
    }
    
    public Actor[] getActors(){
        return actors;
    }
    
    public int getNumberOfMovies(){
        return numberOfMovies;
    }
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setGenre(String genre){
        this.genre = genre;
    }
    
    public void setDescription(String description){
        this.description = description;
        setName(description.split(" ")[0]);
        setGenre(description.split(" ")[-1]);
    }
    
    public void setDirector(Director director){
        this.director = director;
    }
    
    public void setActors(Actor actors[]){
        this.actors = actors;
    }
    
    public String toString(){
         return "Ator: "+name+"\nGenre: "+genre+"\nDirector: "+director+"\nActors: "+actors.length;
    }
    
}
