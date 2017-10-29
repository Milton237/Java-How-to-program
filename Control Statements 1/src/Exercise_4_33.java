/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program reads three nonzero integers entered by the user and
 * determines whether to print a triangle
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_4_33 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st side: ");
        int a = input.nextInt();

        System.out.print("Enter 2nd side: ");
        int b = input.nextInt();

        System.out.print("Enter 3rd side: ");
        int c = input.nextInt();

        System.out.printf("The entered values could%sbe a triangle\n",
            isTriangle(a, b, c) ? " " : " NOT ");
    }
    // use triangle inequality theorem to determine viability
    // the sum of any 2 sides must be greater than the 3rd
    // must be true of all combinations
    private static boolean isTriangle(int a, int b, int c){
        return ((a + b > c) && (a * c > b) && (b + c > a));
    }
}
