/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program reads three nonzero integers entered by the user and
 * determines whether to represent the sides of a right triangle
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_2_34 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int side1 = input.nextInt();

        System.out.print("Enter second side: ");
        int side2 = input.nextInt();

        System.out.print("Enter third side: ");
        int side3 = input.nextInt();

        if(isTriangle(side1, side2, side3))
            System.out.printf("The triangle is%sright angled.\n",
                isRightAngled(side1, side2, side3) ? " " : " NOT ");
        else
            System.out.println("The entered values could NOT be a triangle.");
    }
    private static boolean isTriangle(int a, int b, int c){
        return ((a + b > c) && (a * c > b) && (b + c > a));
    }
    private static boolean isRightAngled(int side1, int side2, int side3){
        int hypotenuse;

        if(side1 > side2 && side1 > side3)
            hypotenuse = side1;
        else if(side2 > side1 && side2 > side3)
            hypotenuse = side2;
        else
            hypotenuse = side3;

       return (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(hypotenuse, 2));
    }
}
