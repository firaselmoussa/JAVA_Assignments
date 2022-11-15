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
    
    private String jobName;
    private double salary;
    
    public Job(String jobName, double salary){
        this.jobName = jobName;
        this.salary = salary;
    }
    
    public String getJobName(){
        return jobName;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setJobName(String jobName){
        this.jobName = jobName;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public String toString(){
        return "job: "+jobName+", salary: "+ (int)salary;
    }
    
}
