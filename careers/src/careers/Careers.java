/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package careers;


import java.util.Scanner;

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
        
        Scanner myScanner = new Scanner(System.in);
  
        Person[] persons = new Person[0];

        
        do{
            System.out.print("Enter the name, job, and salary: ");
            String[] usersInput = myScanner.nextLine().split(" ");
            
                Person tempPersons[] = new Person[persons.length+1];
            for(int i =0; i < persons.length; i++){
                tempPersons[i] = persons[i];
            }
            tempPersons[persons.length] = new Person(usersInput[0], new Job(usersInput[1], Double.parseDouble(usersInput[2])));
            
            persons = tempPersons;
            
        }while(!myScanner.next().equalsIgnoreCase("exit"));
        
        
            System.out.print("The salaries of each of the persons are: ");

            for(int i = 0; i < persons[0].getJobsCount(); i++){
                System.out.print((int)(persons[i].getJob().getSalary()));
                if(i < persons[0].getJobsCount()-1)
                    System.out.print(", ");
                else
                    System.out.println("");
            }

            System.out.println("The person with the maximum salary is: "+persons[0].getMaxSalary());
            System.out.println("The total of all salaries is: "+(int)persons[0].getTotalSalary());
            System.out.println("The average of all salaries is: "+(int)(persons[0].getTotalSalary() / persons[0].getJobsCount()));

            System.out.println("The description of all the persons: ");

            for(int i = 0; i < persons[0].getJobsCount(); i++){
                System.out.println(persons[i].toString());
            }


            System.out.println("After adding 100 to the salaries of programmers: ");

            for(int i = 0; i < persons[0].getJobsCount(); i++){
                if(persons[i].getJob().getJobName() == "Programmer"){
                    persons[i].getJob().setSalary(persons[i].getJob().getSalary()+100);
                    System.out.println(persons[i].toString());
                }
            }

            persons[0].setJob(new Job("Chef", 1500));

            System.out.println(persons[0].toString());


        }
        
    
    
}
