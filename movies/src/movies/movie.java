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
    }
}
