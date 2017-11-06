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
public class BasePlusCommissionEmployee2 extends CommissionEmployee{
    private double baseSalary;

    // constructor
    public BasePlusCommissionEmployee2(String first, String last, String ssn,
            double sales, double rate, double salary){
        super(first, last, ssn, sales, rate);

        setBaseSalary(salary);
    }
    public BasePlusCommissionEmployee2(String first, String last, String ssn,
            double sales, double rate, double salary, int month, int day, int year){
        // call CommissionEmployee constructor
        super(first, last, ssn, sales, rate, month, day, year);
        setBaseSalary(salary);
    }
    // SETTERS
    public void setBaseSalary(double salary){
        if(salary >= 0.0f)
            baseSalary = salary;
        else
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0f");
    }
    // GETTERS
    public double getBaseSalary(){
        return this.baseSalary;
    }
    // calculate getPaymentAmount; override method getPaymentAmount in CommissionEmployee
    @Override
    public double getPaymentAmount(){
        return getBaseSalary() + super.getPaymentAmount();
    }
    // return String representation of object
    @Override
    public String toString(){
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}

