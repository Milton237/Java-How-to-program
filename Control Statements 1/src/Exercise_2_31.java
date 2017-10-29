/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program prints the decimal equivalent of a binary number
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_2_31 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int binary = 0;     // original binary
        int decimal = 0;    // conversion
        int place = 0;      // the 2's place

        System.out.print("Enter binary number for conversion: ");
        binary = input.nextInt();

        while(binary != 0){
            // extract rightmost digit
            int lastDigit = binary % 10;

            // raise rightmost digit to 2^place and add to decimal
            decimal += lastDigit * Math.pow(2, place);

            // slice rightmost digit from original
            binary /= 10;

            // shift 2's place to the left
            place++;
        }

        System.out.printf("%d = %d\n", binary, decimal);
    }
}
