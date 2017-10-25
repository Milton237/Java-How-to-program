/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;
import java.util.Scanner;
/**
 * Program that reads five integers and determines the smallest and largest in the set
 * @author MILTON PRO
 */
public class Exercise_2_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        int smallest = 1;
        int largest= 1;
        System.out.print("Enter the first integer: ");
        num1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        num2 = input.nextInt();
        System.out.print("Enter the third integer: ");
        num3 = input.nextInt();
        System.out.print("Enter the fourth integer: ");
        num4 = input.nextInt();
        System.out.print("Enter the fifth integer: ");
        num5 = input.nextInt();
        if((num1 > num2)&&(num1 > num3)&&(num1 > num4)&&(num1 > num5)){
            largest = num1;
        }
        if((num2 > num1)&&(num2 > num3)&&(num2 > num4)&&(num2 > num5)){
            largest = num2;
        }
        if((num3 > num2)&&(num3 > num1)&&(num3 > num4)&&(num3 > num5)){
            largest = num3;
        }
        if((num4 > num2)&&(num4 > num3)&&(num4 > num1)&&(num4 > num5)){
            largest = num4;
        }
        if((num5 > num2)&&(num5 > num3)&&(num5 > num4)&&(num5 > num1)){
            largest = num5;
        }
        
        if((num1 < num2)&&(num1 < num3)&&(num1 < num4)&&(num1 < num5)){
            smallest = num1;
        }
        if((num2 < num1)&&(num2 < num3)&&(num2 < num4)&&(num2 < num5)){
            smallest = num2;
        }
        if((num3 < num2)&&(num3 < num1)&&(num3 < num4)&&(num3 < num5)){
            smallest = num3;
        }
        if((num4 < num2)&&(num4 < num3)&&(num4 < num1)&&(num4 < num5)){
            smallest = num4;
        }
        if((num5 < num2)&&(num5 < num3)&&(num5 < num4)&&(num5 < num1)){
            smallest = num5;
        }
        
        System.out.printf("The largest integer is %d%n", largest);
        System.out.printf("The smallest integer is %d%n", smallest);
    }
}
