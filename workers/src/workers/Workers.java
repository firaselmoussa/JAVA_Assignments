/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workers;

/**
 *
 * @author Firas
 */
public class Workers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Nurse nurses[] = {  new Nurse("Heba Mortada", 'D', 0, false),
                            new Nurse("Ali Mortada", 'N', 0, true),
                            new Nurse("George Sader", 'D', 10, true)};
        
        for(int i = 0 ; i < nurses.length; i++){
            System.out.println(nurses[i].toString()+"\n");
        }
        
        nurses[0].setOverTime(25);
        
        for(int i = 0 ; i < nurses.length; i++){
            System.out.println("Name: "+nurses[i].getName()+", total salary: "+nurses[i].totalSalary());
        }
        
    }
}
