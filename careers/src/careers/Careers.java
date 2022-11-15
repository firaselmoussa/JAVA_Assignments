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
        
        //CREATE SCANNER OBJECT
        Scanner myScanner = new Scanner(System.in);
  
        //CREATE ARRAY OF PERSONS WITH SIZE OF 0
        Person[] persons = new Person[0];

        //USER INPUT
        String[] usersInput;
        
        //DO-WHILE LOOP OVER USER INPT
        do{
            //USER INSTRUCTIONS
            System.out.print("Enter the name, job, and salary('exit' to quit): ");
            //TAKING USER INPUT
            usersInput = myScanner.nextLine().split(" ");
            
            //VALIDATING USER'S INPUT 
            if(usersInput.length == 3){ 

                //CREATE TEMPORARY PERSONS ARRAY 
                Person tempPersons[] = new Person[persons.length+1];
                //FILLING THE TEMP ARRAY WITH MAIN ARRAY'S DATA
                for(int i =0; i < persons.length; i++){
                    tempPersons[i] = persons[i];
                }
                //ADDING TO THE TEMP ARRAY THE NEWLY GIVEN DATA
                tempPersons[persons.length] = new Person(usersInput[0], new Job(usersInput[1], Double.parseDouble(usersInput[2])));

                //STORING THE TEMP ARRAY'S DATA IN THE MAIN ARRAY
                persons = tempPersons;
           
        //BREAKING THE LOOP IF INPUT IS NOT VALID OF == 'EXIT'
            }else{
                break;
            }
        }while(!usersInput[0].equalsIgnoreCase("exit"));
        
        
        //CHECKING IF THERE IS NO DATA
        if(persons.length > 0){

            //DISPLAYING SALARES OF ALL USERS
            System.out.print("The salaries of each of the persons are: ");

            for(int i = 0; i < persons[0].getJobsCount(); i++){
                System.out.print((int)(persons[i].getJob().getSalary()));
                if(i < persons[0].getJobsCount()-1)
                    System.out.print(", ");
                else
                    System.out.println("");
            }

            //DISPLAYING PERSON WITH MAX SALARY, TOTAL OF ALL SALARIES, AVERAGE OF ALL SALARIES
            System.out.println("The person with the maximum salary is: "+persons[0].getMaxSalary());
            System.out.println("The total of all salaries is: "+(int)persons[0].getTotalSalary());
            System.out.println("The average of all salaries is: "+(int)(persons[0].getTotalSalary() / persons[0].getJobsCount()));

            //DISPLAYING DESCRIPTION OF ALL PERSONS
            System.out.println("The description of all the persons: ");

            for(int i = 0; i < persons[0].getJobsCount(); i++){
                System.out.println(persons[i].toString());
            }

            //ADDING $100 TO PROGRAMMER'S SALARY & DISPLAYING NEW SALARY
            System.out.println("After adding 100 to the salaries of programmers: ");

            for(int i = 0; i < persons[0].getJobsCount(); i++){
                if(persons[i].getJob().getJobName().equalsIgnoreCase("Programmer")){
                    persons[i].getJob().setSalary(persons[i].getJob().getSalary()+100);
                    System.out.println(persons[i].toString());
                }
            }
            
            //CHANGING FIRST PERSON'S JOB AND DISPLSYING THE NEW DESCRIPTION
            System.out.println("After changing the job of the first person: ");
            persons[0].setJob(new Job("Chef", 1500));
            System.out.println(persons[0].toString());


        }
        
    }
    
}
