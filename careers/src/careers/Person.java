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
    private static double totalSalary = 0;
    private static double maxSalary;
    private static String personWithMaxSalary;
    
    public Person(String n, Job j){
        name = n;
        job = j;
        
        jobsCount++;
        totalSalary += job.getSalary();
        
        if(j.getSalary() > maxSalary){
            maxSalary = j.getSalary();
            personWithMaxSalary = n;
        }
        
    }
    
    public String getName(){
        return name;
    }
    
    public int getJobsCount(){
        return jobsCount;
    }
    
    public double getTotalSalary(){
        return totalSalary;
    }
    
    public Job getJob(){
        return job;
    }
    
    public void setJob(Job job){
        totalSalary = (totalSalary - this.job.getSalary()) + job.getSalary();
        
        this.job = job;
    }
    
    public String toString(){
        return "Name: "+name+" "+job.toString();
    }
    
    
    public String getMaxSalary(){
        return personWithMaxSalary;
    }
}
