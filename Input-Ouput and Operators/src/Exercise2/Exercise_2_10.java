/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;
import java.util.Scanner;
/**
 *Program that reads an integer and determines if the integer is odd or even
 * @author MILTON PRO
 */
public class Exercise_2_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int num = input.nextInt();
        int mod;
        mod = num%2;
        if(mod == 0){
            System.out.println("The integer is even!");
        }
        if(mod != 0){
            System.out.println("The integer is odd!");
        }
        
    }
}
