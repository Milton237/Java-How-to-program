/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Revised account test with withdrawal
 * @author MILTON PRO
 */
import java.util.Scanner;
public class AccountTest4 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            AccountClass4 myAccount = new AccountClass4("John Doe", 5000.5);
            AccountClass4 myAccount2 = new AccountClass4("Martin Doe", 4700.5);
            System.out.printf("Initial account names and balance are:%n%s  $%.2f%n %s  $%.2f%n", myAccount.getName(),myAccount.getBalance(), myAccount2.getName(), myAccount2.getBalance());
            System.out.println("");
            System.out.print("Enter withdrawal amount: ");
            double amount = input.nextDouble();
            myAccount.withdraw(amount);
        }
}
