/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program calculates and returns the value of a base exponent
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_6_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        long base = 0;
        int exponent = 0;

        while(base != -1){
            System.out.print("Enter base (-1 to exit): ");
            base = input.nextInt();

            if(base != -1){
                System.out.print("Enter exponent: ");
                exponent = input.nextInt();

                System.out.println(Math.pow(base, exponent));

                System.out.printf("%d^%d: %d\n",
                        base, exponent, integerPower(base, exponent));
            }
        }
    }
    public static long integerPower(long base, int exponent){
        if(exponent <= 1)
            return base;
        return base * integerPower(base, --exponent);
    }
}
