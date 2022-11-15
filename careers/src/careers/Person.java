/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package careers;

/**
 *
 * @author Firas
 */
public class Person {
    
    private String name;
    private Job job;
    private static int jobsCount;
    private static double totalSalary;
    
    public Person(String n, Job j){
        name = n;
        job = j;
        
        jobsCount++;
        totalSalary += job.getSalary();
    }
}
