/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
import java.util.Scanner;

public class ComparisonOfTwoNumbers {
    
    //start of main method
    public static void main(String[] args){
        // create instance of the Scanner class to read input from the user
        Scanner input = new Scanner(System.in);
        //declare variables for the integers to compare
        int number1, number2;
        System.out.print("Enter the first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        number2 = input.nextInt();
        if(number1 > number2){
            System.out.printf("%d is greater than %d%n", number1, number2);
        }
        if(number2 > number1){
            System.out.printf("%d is greater than %d%n", number2, number1);
        }
        if(number1 == number2){
            System.out.printf("%d is equal to %d%n", number1, number2);
        }
        
    } // end of main method
    
}// end of class declaration
