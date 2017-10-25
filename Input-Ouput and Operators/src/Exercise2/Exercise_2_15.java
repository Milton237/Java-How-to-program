/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;
import java.util.Scanner;
/**
 * Program that separates an integer into its component digits and prints them with spaces in between
 * @author MILTON PRO
 */
public class Exercise_2_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, int2, int3, int4, int5, int1;
        System.out.print("Enter the integer: ");
        num = input.nextInt();
        int1 = num/10000;
        num = num - (int1 * 10000);
        int2 = num/1000;
        num = num - (int2 * 1000);
        int3 = num/100;
        num = num - (int3 * 100);
        int4 = num/10;
        num = num - (int4 * 10);
        int5 = num/1;
        num = num - (int5 * 1);
        System.out.printf("%d   %d   %d   %d   %d%n", int1, int2, int3, int4, int5);
    }
}
