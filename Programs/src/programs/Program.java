/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs;

import java.util.ArrayList;

/**
 *
 * @author Firas
 */
public class Program {
    protected ArrayList<DataType> list; 
    protected ProgrammingLanguage pl;

    public Program(ArrayList<DataType> list, ProgrammingLanguage pl) {
        this.list = list;
        this.pl = pl;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < list.size(); i++){
            s += list.get(i).toString()+"\n";
        }
        s += pl.toString();
        return s;
    }
    
    
}

