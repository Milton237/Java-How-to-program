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
public class SalariedEmployee2 extends Employee{
    private double weeklySalary;

    // constructor
    public SalariedEmployee2(String first, String last, String ssn, double salary){
        super(first, last, ssn);

        setWeeklySalary(salary);
    }
    public SalariedEmployee2(String first, String last, String ssn, double salary,
            int month, int day, int year){
        // pass to Employee constructor
        super(first, last, ssn, month, day, year);

        setWeeklySalary(salary);
    }
    // SETTERS
    public void setWeeklySalary(double salary){
        if(salary >= 0.0f)
            this.weeklySalary = salary;
        else
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0f");
    }
    // GETTERS
    public double getWeeklySalary(){
        return this.weeklySalary;
    }
    // calculate getPaymentAmount; override abstract method getPaymentAmount in Employee
    @Override
    public double getPaymentAmount(){
        return getWeeklySalary();
    }
    // return String representation of SalriedEmployee object
    @Override
    public String toString(){
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}

