/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package careers;

/**
 *
 * @author Firas
 */
public class Careers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person Sami = new Person("Sami", new Job("test", 1000));
        Person Kamal = new Person("Kamal", new Job("Programmer", 2100));
        Person Jamal = new Person("Jamal", new Job("Programmer", 1800));
        Person Tarek = new Person("Tarek", new Job("Teacher", 1900));

            
        Person persons[] = {Sami, Kamal, Jamal, Tarek};
        
        System.out.print("The salaries of each of the persons are: ");
        
        for(int i = 0; i < Sami.getJobsCount(); i++){
            System.out.print((int)(persons[i].getJob().getSalary()));
            if(i < Sami.getJobsCount()-1)
                System.out.print(", ");
            else
                System.out.println("");
        }
        
        System.out.println("The person with the maximum salary is: "+persons[0].getMaxSalary());
        System.out.println("The total of all salaries is: "+(int)persons[0].getTotalSalary());
        
    }
    
}
