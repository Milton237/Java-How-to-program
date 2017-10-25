/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A program to add integers
 * @author MILTON PRO
 */
import java.util.Scanner;

public class AddingIntergers {
    
    //start of main method
    public static void main(String[] args){
        //create a scanner object to obtain input from the user through the keyboard
        Scanner input = new Scanner(System.in);
        // declare variables for the intergers to be added
        int number1;
        int number2;
        int sum;
        System.out.print("Enter the first interger: ");
        number1 = input.nextInt();
        System.out.print("Enter the second interger: ");
        number2 = input.nextInt();
        sum = number1 + number2;
        System.out.printf("The sum of %d and %d is %d%n", number1,number2, sum);
    }// end of main method
    
}// end of class declaration
