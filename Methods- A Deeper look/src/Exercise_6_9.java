/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program to display a square of any character
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_6_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter side of square (-1 to exit): ");
            int x = input.nextInt();

            if(x == -1)
                break;

            System.out.print("Enter fill char: ");
            char fill = input.next().charAt(0);

            squareOfChar(x, fill);
        }
    }
    public static void squareOfChar(int x, char fillCharacter){
        for(int i=0; i<x; i++){
            System.out.println();
            for(int j=0; j<x; j++){
                System.out.print(fillCharacter);
            }
        }
        System.out.printf("\n\n");
    }
}
