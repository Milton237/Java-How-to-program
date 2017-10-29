/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program displays a square of asterisks whose side is determined by input
 * from the user
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_6_8 {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter side of square (-1 to exit): ");
            int x = input.nextInt();

            if(x == -1)
                break;

            squareOfAsterisks(x);
        }
    }
    public static void squareOfAsterisks(int x){
        for(int i=0; i<x; i++){
            System.out.println();
            for(int j=0; j<x; j++){
                System.out.print('*');
            }
        }
        System.out.println();
    }
}
