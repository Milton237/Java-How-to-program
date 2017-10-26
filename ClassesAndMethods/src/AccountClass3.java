/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Revised account class with balance variable and set and get methods
 * for the balance
 * @author MILTON PRO
 */
public class AccountClass3 {
    
    private String name;
    private double balance;
    public AccountClass3(String name, double balance){
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
}
