/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.and.interfaces;

/**
 *
 * @author MILTON PRO
 */
public abstract class Employee{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDay;

    // constructor
    public Employee(String first, String last, String ssn,
            int month, int day, int year){

        setFirstName(first);
        setLastName(last);
        setSocialSecurityNumber(ssn);

        birthDay = new Date(month, day, year);
    }
    // SETTERS
    public void setFirstName(String first){
        this.firstName = first;
    }
    public void setLastName(String last){
        this.lastName = last;
    }
    public void setSocialSecurityNumber(String ssn){
        this.socialSecurityNumber = ssn;
    }
    // GETTERS
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }
    public Date getBirthday(){
        return this.birthDay;
    }
    // return String representation of Employee object
    @Override
    public String toString(){
        return String.format("%s %s\nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    // ABSTRACT METHODS
    // not implemented here
    public abstract double earnings();
}

