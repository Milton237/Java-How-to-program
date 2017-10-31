/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program simulates the attributes and functions of a savings account
 * @author MILTON PRO
 */
public class Exercise_8_3_Class {
    private static double annualInterestRate = 0.0f;
    private double savingsBalance = 0.0f;

    // constructor
    public Exercise_8_3_Class(double savingsBalance){
        setSavingsBalance(savingsBalance);
    }
    // SETTERS
    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    // update the interest rate
    public static void modifyInterestRate(double newInterestRate){
        // check for negative interest rates
        if(newInterestRate >= 0.0f)
            annualInterestRate = newInterestRate;
        else
            throw new IllegalArgumentException("interest rate must be >= 0.0f");
    }
    // GETTERS
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }
    // calculates the monthly interest and update the savings balance
    public void calculateMonthlyInterest(){
        savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }
    // return savingsBalance as string
    public String toString(){
        return String.format("%.2f", getSavingsBalance());
    }
}
