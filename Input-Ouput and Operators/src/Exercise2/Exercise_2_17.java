/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;
import java.util.Scanner;
/**
 * Program that determines the number of -ve, +ve and zeros in a given number of 5 integers
 * @author MILTON PRO
 */
public class Exercise_2_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        int negative= 0;
        int positive = 0;
        System.out.print("Enter a number with 5 digits: ");
        int num = input.nextInt();
        num1 = num/10000;
        if(num1 < 0){
            negative = 1;
            num = num + (num1 * 10000);
        }
        if(num1 > 0){
            positive = 1;
            num = num - (num1 * 10000);
        }
         
         num2 = num/10000;
        if(num2 < 0){
            negative = 2;
            num = num + (num1 * 10000);
        }
        if(num2 > 0){
            positive = 2;
            num = num - (num2 * 10000);
        }
        
        num = num - (num2 * 10000);
         num3 = num/10000;
        if(num3 < 0){
            negative = 3;
            num = num + (num3 * 10000);
        }
        if(num3 > 0){
            positive = 3;
            num = num - (num3 * 10000);
        }
        
         num4 = num/10000;
        if(num4 < 0){
            negative = 4;
            num = num + (num4 * 10000);
            
        }
        if(num4 > 0){
            positive = 4;
            num = num - (num4 * 10000);
        }
               
         num5 = num/10000;
        if(num5 < 0){
            negative = 5;
        }
        if(num5 > 0){
            positive = 5;
        }
        
        System.out.printf("There a %d negative numbers and %d positive numbers%n", negative,positive);
        
        
    }
}
