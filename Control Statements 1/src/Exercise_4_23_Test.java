/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program the two largest values entered by a user from a set of ten numbers
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_4_23_Test {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        Exercise_4_23_class largest = new Exercise_4_23_class();

        for(int i=0; i<10; i++){
            System.out.printf("%d/10. Enter number: ", i+1);
            largest.enterNumber(input.nextInt());
        }
        System.out.printf("First Largest: %d\nSecond Largest: %d\n",
                largest.getFirstLargest(), largest.getSecondLargest());
    }
}
