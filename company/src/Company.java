
import company.Department;
import company.Employee;
import company.Head;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Firas
 */
public class Company {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee john = new Employee("john", "jhonny", 60);
        Head james = new Head("james", "jy", 70, 0);
        Department marketing = new Department("Marketing", james);
        
        System.out.println(john.toString()+"\n");
        System.out.println(james.toString()+"\n");
        System.out.println(marketing.toString()+"\n");
        
    }
    
}
