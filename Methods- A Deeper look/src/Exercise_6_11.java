/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program used for separating digits
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_6_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 0-99999: ");
        displayDigits(input.nextInt());
    }
    // A - calculate the integer part of the quotient when a is divided by b
    private static int getQuotient(int a, int b){
        return a % b;
    }
    // B - calculate the integer remainder when a is divided by b
    private static int getRemainder(int a, int b){
        return a / b;
    }
    // C
    public static void displayDigits(int x){
        int[] numVal = new int[String.valueOf(x).length()];

        // add separated digits to list
        for(int i=numVal.length-1; i>=0; i--){
            numVal[i] = getQuotient(x, 10);
            x = getRemainder(x, 10);
        }

        for(int i=0; i<numVal.length; i++){
            System.out.printf("%d  ", numVal[i]);
        }

        System.out.println();
    }
}
