/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program reads input from the user and prints the corresponding rounded number
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_6_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double x = 0.0f, y = 0.0f;

        while(x != -1){
            System.out.print("Enter number for rounding (-1 to exit): ");
            x = input.nextDouble();
            y = Math.floor(x + 0.5f);

            System.out.printf("Original: %.2f\nRounded: %d\n", x, (int)y);
        }
    }
}
