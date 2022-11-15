/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package careers;

/**
 *
 * @author Firas
 */
public class Job {
    
    //DATA FIELDS
    private String jobName;
    private double salary;
    
    //CONSTRUCTOR
    public Job(String jobName, double salary){
        this.jobName = jobName;
        this.salary = salary;
    }
    
    //GETTERS METHODS
    public String getJobName(){
        return jobName;
    }
    
    public double getSalary(){
        return salary;
    }
    
    //SETTERS METHODS
    public void setJobName(String jobName){
        this.jobName = jobName;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    //TO STRING METHOD
    public String toString(){
        return "job: "+jobName+", salary: "+ (int)salary;
    }
    
}
