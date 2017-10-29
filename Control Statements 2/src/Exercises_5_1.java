/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program finds the smallest of several integers entered by the user
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercises_5_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numValues = requestInput("Enter number of values to sort: ", input);

        int smallest = requestInput("Enter value: ", input);
        --numValues;

        while(numValues > 0){
            int current = requestInput("Enter values: ", input);

            smallest = Math.min(current, smallest);

            --numValues;
        }
        System.out.printf("The smallest value is %d\n", smallest);
    }
    public static int requestInput(String s, Scanner input){
        System.out.print(s);
        return input.nextInt();
    }
}
