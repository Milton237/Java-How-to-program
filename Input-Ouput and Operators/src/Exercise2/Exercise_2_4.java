/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;
import java.util.Scanner;

/**
 *Program  that inputs three integers from the
  user and displays the sum, average, product, smallest and largest of the numbers
 * @author MILTON PRO
 */
public class Exercise_2_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, sum, product, average;
        int smallest = 1;
        int largest = 1;
        System.out.print("Enter the first integer: ");
        num1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        num2 = input.nextInt();
        System.out.print("Enter the third integer: ");
        num3 = input.nextInt();
        sum = num1 + num2 + num3;
        product = num1 * num2 * num3;
        average = sum/3;
        if((num1 > num2) && (num1 > num3)){
            largest = num1;
        }
        if((num1 < num2) && (num1 < num3)){
            smallest = num1;
        }
        if((num2 > num1) && (num2 > num3)){
            largest = num2;
        }
        if((num2 < num1) && (num2 < num3)){
            smallest = num2;
        }
        if((num3 > num1) && (num3 > num2)){
            largest = num3;
        }
        if((num3 < num1) && (num3 < num2)){
            smallest = num3;
        }
        System.out.printf("The sum is %d%n", sum);
        System.out.printf("The product is %d%n", product);
        System.out.printf("The average is %d%n", average);
        System.out.printf("The largest is %d%n", largest);
        System.out.printf("The smallest is %d%n", smallest);
    }
}
