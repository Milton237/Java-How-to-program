/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program reads an integer from the user and determines of the integer is even or odd
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_6_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter an integer to see if it is even(-1 exit): ");
            int x = input.nextInt();

            if(x == -1)
                break;

            System.out.printf("%d is%even.\n", x,
                    (isEven(x) == true) ? " " : " not");
        }
    }
    public static boolean isEven(int x){
        return (x % 2 == 0) ? true: false;
    }
}
