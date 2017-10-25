/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;
import java.util.Scanner;
/**
 * Program that determines the multiple between two numbers
 * @author MILTON PRO
 */
public class Exercise_2_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2, mod;
        System.out.print("Enter the first integer: ");
        num1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        num2 = input.nextInt();
        mod = num2%num1;
        if(mod == 0){
            System.out.printf("%d is a multiple of %d", num1, num2);
        }
        if(mod != 0){
            System.out.printf("%d is not a multiple of %d", num1, num2);
        }
    }
}
