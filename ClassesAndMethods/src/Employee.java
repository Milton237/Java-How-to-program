/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    
    public Employee(String fName, String lName, double salary){
        this.firstName = fName;
        this.lastName = lName;
        this.salary = salary;
    }
    
    public void setFirstname(String fName){
        this.firstName = fName;
    }
    
    public void setlastName(String lName){
        this.lastName = lName;
    }
    
    public void setSalary(double salary){
        if(salary > 0){
        this.salary = salary;
        }
        if(salary < 0){
            System.out.println("Salary can not be less than zero");
        }
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
}
