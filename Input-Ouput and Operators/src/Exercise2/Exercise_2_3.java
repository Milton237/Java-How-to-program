/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;
import java.util.Scanner;
/**
 *Program that compares two numbers
 * @author MILTON PRO
 */
public class Exercise_2_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1, number2;
        System.out.print("Enter the first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        number2 = input.nextInt();
        if(number1 > number2){
            System.out.printf("%d is larger than %d%n", number1, number2);
        }
        if(number2 > number1){
            System.out.printf("%d is larger than %d%n", number2, number1);
        }
        if(number1 == number2){
            System.out.println("These numbers are equal!");
        }
    }// end of main method
}// end of class declaration
