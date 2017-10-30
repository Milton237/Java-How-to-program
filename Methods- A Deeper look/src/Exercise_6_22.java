/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program calculates and returns the distance between two points
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_6_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st set of space separated coordinates: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter 2nd set of space separated coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.printf("The distance between (%.2f, %.2f) & (%.2f, %.2f) = %.2f\n",
                x1, y1, x2, y2, distance(x1, y1, x2, y2));
    }
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
