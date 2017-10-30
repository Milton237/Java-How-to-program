/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program calculates the nth Fibonacci number
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_7_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter nth number to calculate fibonacci to: ");
        System.out.println(fibonacci(input.nextInt()));
    }
    // fibonacci
    public static double fibonacci(double n){
        // base case (not possible to positively reduce)
        if(n <= 1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}
