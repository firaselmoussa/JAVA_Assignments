/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs;

/**
 *
 * @author Firas
 */
public class ProgrammingLanguage implements Language, Comparable<Language>{
    protected String type, name;
    protected int DateOfRelease;

    public ProgrammingLanguage(String t, String n, int d) {
        this.type = t;
        this.name = n;
        this.DateOfRelease = d;
    }

    
    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getDateOfRelease() {
        return DateOfRelease;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Language t) {
        if(t instanceof ProgrammingLanguage){
        if(this.DateOfRelease > ((ProgrammingLanguage)t).DateOfRelease)
            return 1;
        else if(this.DateOfRelease < ((ProgrammingLanguage)t).DateOfRelease)
            return -1;
        
        }
        return 0;
    }
     
    @Override
    public String toString() {
        return type+" Programming Language "+name+"Released in "+DateOfRelease;
    }


    
}

