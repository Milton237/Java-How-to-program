/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Revised account test with constructor
 * @author MILTON PRO
 */
import java.util.Scanner;
public class AccountTest2 {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        AccountClass2 myAccount = new AccountClass2("Ndi Milton");
        System.out.printf("Initial account name is %s%n", myAccount.getName());
        System.out.println("Please enter your name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println("");
        System.out.printf("New name in account object is %s%n", myAccount.getName());
    }
}
