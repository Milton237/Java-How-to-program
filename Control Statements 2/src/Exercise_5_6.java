/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program that reads input from the user and prints a bar chart
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_5_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] values = new int[5];
        int count = 0;

        // get input
        for(int i=0; i<5; i++){
            values[i] = requestInput("Enter number " + ++count + ": ", input);
        }

        count = 0;
        // print values
        for(int i=0; i<5; i++){
            System.out.printf("%d:  ", ++count);
            for(int j=0; j<values[i]; j++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
    public static int requestInput(String s, Scanner input){
        System.out.print(s);
        return input.nextInt();
    }
}
