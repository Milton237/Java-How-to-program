/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;
import java.util.Scanner;
/**
 *Program calculates the body mass index of a user
 * @author MILTON PRO
 */
public class Exercise2_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int weight;
        int height;
        int bmi;
        System.out.print("Enter your weight in Kg: ");
        weight = input.nextInt();
        System.out.print("Enter your height in m: ");
        height = input.nextInt();
        bmi = weight / (height * height);
        System.out.printf("Your BMI is %d%n", bmi);
        System.out.println("BMI Values");
        System.out.println("Underweight:   less than 18.5");
        System.out.println("Normal:        between 18.5 and 24.9");
        System.out.println("Overweight:    between 25 and 29.9");
        System.out.println("Obese:         30 or greater");
        
    }
}
