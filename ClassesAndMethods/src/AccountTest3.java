/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Revised account test with balance variable and set and get 
 * method for the balance
 * @author MILTON PRO
 */
import java.util.Scanner;
public class AccountTest3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        AccountClass3 myAccount = new AccountClass3("Ndi Milton", 50.5);
        AccountClass3 myAccount2 = new AccountClass3("Jato Mark", 90.5);
        //display initial balance of each object
        System.out.printf("Initial account names and balance are:%n%s  $%.2f%n %s  $%.2f%n", myAccount.getName(),myAccount.getBalance(), myAccount2.getName(), myAccount2.getBalance());
        System.out.println("");
        System.out.print("Enter Deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nAdding %.2f to account1 balance%n", depositAmount);
        myAccount.setBalance(depositAmount);
        System.out.print("Enter Deposit amount for account2: ");
        double depositAmount2 = input.nextDouble();
        System.out.printf("%nAdding %.2f to account2 balance%n", depositAmount2);
        myAccount2.setBalance(depositAmount2);
        System.out.printf("New account1 balance is %.2f%n", myAccount.getBalance());
        System.out.printf("New account2 balance is %.2f%n", myAccount2.getBalance());
        
        
        
    }
}
