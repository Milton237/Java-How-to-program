/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Revised account class to perform withdrawal from an account
 * @author MILTON PRO
 */
public class AccountClass4 {
     
    private String name;
    private double balance;
    public AccountClass4(String name, double balance){
        this.name = name;
        if(balance > 0.0){
            this.balance = balance;
        }
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void withdraw(double amount){
        if(this.balance > amount){
        this.balance = balance - amount;
        System.out.printf("$%.2f has been withdrawn fro your account. Your new balance is $%.2f%n",amount, this.balance);
        }
        else{
            System.out.println("Sorry! You don't have up to that amount in your account");
        }
    }
}
