/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program calculates and displays the area of a circle from the radius entered by the user
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_6_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle get its area: ");
        System.out.printf("Area: %.2f\n", circleArea(input.nextDouble()));
    }
    // area = pi * radius^2
    public static double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }
}
