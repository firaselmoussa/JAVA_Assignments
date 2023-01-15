
import java.util.ArrayList;
import programs.DataType;
import programs.Program;
import programs.ProgrammingLanguage;
import programs.number;
import programs.text;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Firas
 */
public class Programs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ProgrammingLanguage pl1 = new ProgrammingLanguage("dynamic", "Python", 1998);
        ProgrammingLanguage pl2 = new ProgrammingLanguage("static", "C++", 1991);
        
        text t1 = new text("var1", "Final", 100);
        text t2 = new text("var2", "Exam", 200);
        number n1 = new number(100, "var3");
        number n2 = new number(100, "var4");
        
        ArrayList<DataType> dt = new ArrayList<>();
        dt.add(t1);
        dt.add(t2);
        dt.add(n1);
        dt.add(n1);
        
        Program p = new Program(dt, pl2);
        
        p.toString();
        
        
        int c = pl1.compareTo(pl2);
        
        if(c >0)
            System.out.println("The older programming lamguage is: \n " +pl2.getName());
        else if(c <0)
            System.out.println("The older programming lamguage is: \n " +pl1.getName());
        else 
            System.out.println("Both Programming Languages were released in the same year");
        
        System.out.println(t1.add(t2));
        System.out.println(n1.add(n2));
        
        
    }
    
}
