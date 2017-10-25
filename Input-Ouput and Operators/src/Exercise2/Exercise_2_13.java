/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;
import java.util.Scanner;
/**
 * Program to calculate the area, diameter and circumference of a circle
 * @author MILTON PRO
 */
public class Exercise_2_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int radius;
        System.out.print("Enter the radius: ");
        radius = input.nextInt();
        System.out.printf("The diameter of the circle is %d%n", radius*2);
        System.out.printf("The area of the circle is %f%n", (radius*radius)*2*Math.PI);
        System.out.printf("The circumference of the circle is %f%n", 2*radius*Math.PI);
    }
}
