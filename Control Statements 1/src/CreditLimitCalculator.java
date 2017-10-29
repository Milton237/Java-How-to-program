/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program calculates the credit of customers in a shop
 * @author MILTON PRO
 */
import java.util.Scanner;
public class CreditLimitCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int accountNumber;
        int balanceBegining;
        int totalItems;
        int totalCredit;
        int creditLimit;
        int i =0;
        while(i >= 0){
            System.out.print("Enter customer's account number: ");
            accountNumber = input.nextInt();
            System.out.print("Enter customer's balance at the begining of the month: ");
            balanceBegining = input.nextInt();
            System.out.print("Enter customer's total items credited: ");
            totalItems = input.nextInt();
            System.out.print("Enter customer's total credit: ");
            totalCredit = input.nextInt();
            System.out.print("Enter customer's credit limit: ");
            creditLimit = input.nextInt();
            int newBalance = balanceBegining + totalItems - totalCredit;
            if(newBalance > creditLimit){
            System.out.printf("The new balance for this customer is %d.   Credit limit has been exceeded%n", newBalance);
            }
            else{
                System.out.printf("The new balance for this customer is %d%n", newBalance);
            }
            
            i++;
    }
  }
}
