/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program calculates and returns the greatest common divisor
 * between two integers
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_6_17 {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two space separated positive integers: ");
        System.out.printf("The Greatest Common divisor is: %d\n",
                gcd(input.nextInt(), input.nextInt()));

    }
    public static int gcd(int x, int y){
        // base case
        return (y == 0) ? x : gcd(y, x % y);
    }
}
