/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercise2;
import java.util.Scanner;

/**
 *program to calculate the sum, product, quotient and difference of two numbers
 * @author MILTON PRO
 */
public class Exercise_2_2 {
    
    //start of main method
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1, number2, sum, difference, product, quotient;
        System.out.print("Entert the first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        number2 = input.nextInt();
        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number1 / number2;
        System.out.printf("The sum of %d and %d is %d%n", number1, number2, sum);
        System.out.printf("The difference of %d and %d is %d%n", number1, number2, difference);
        System.out.printf("The product of %d and %d is %d%n", number1, number2, product);
        System.out.printf("The quotient of %d and %d is %d%n", number1, number2, quotient);
    }//end of main method
}//end of class declaration
