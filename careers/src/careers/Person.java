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
        this.job = job;
    }
    
    public String toString(){
        return "Name: "+name+", job: "+job.toString();
    }
    
}
