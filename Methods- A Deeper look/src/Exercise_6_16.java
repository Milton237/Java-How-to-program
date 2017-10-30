/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program accepts a number of digits from the user and returns them
 * with the order reversed.
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_6_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer to see it reversed: ");
        System.out.printf("%d\n", reverseInt(input.nextInt()));
    }
    public static int reverseInt(int x){
        String reversed = "";

        while(x != 0){
            reversed += x % 10;
            x /= 10;
        }

        return Integer.parseInt(reversed);
    }
}
