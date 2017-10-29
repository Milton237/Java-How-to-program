/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program reads two integers from the user and determines if the 
 * first is a multiple of the second
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_6_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter a pair of space separated integers (-1 exit): ");
            int x = input.nextInt();
            if(x != -1){
                int y = input.nextInt();

                System.out.printf("%d as multiple of %d = %s\n", x, y,
                        (isMultiple(x, y) == true) ? "true" : "false");
            }
            break;
        }
    }
    public static boolean isMultiple(int x, int y){
        return (y % x == 0) ? true : false;
    }
}
