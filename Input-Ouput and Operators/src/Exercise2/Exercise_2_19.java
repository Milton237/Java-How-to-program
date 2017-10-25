/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;
import java.util.Scanner;
/**
 *Program calculates the world population growth rate
 * @author MILTON PRO
 */
public class Exercise_2_19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pop;
        int rate;
        int pop1, pop2, pop3, pop4, pop5;
        System.out.print("Enter the world's population: ");
        pop = input.nextInt();
        System.out.print("Enter the growth rate annualy: ");
        rate = input.nextInt();
        pop1 = pop + (pop * (rate/100));
        pop2 = pop1 + (pop1 * (rate/100));
        pop3 = pop2 + (pop2 * (rate/100));
        pop4 = pop3 + (pop3 * (rate/100));
        pop5 = pop4 + (pop4 * (rate/100));
        System.out.printf("World population after one year is %d%n", pop1);
        System.out.printf("World population after two year is %d%n", pop2);
        System.out.printf("World population after three year is %d%n", pop3);
        System.out.printf("World population after four year is %d%n", pop4);
        System.out.printf("World population after five year is %d%n", pop5);
    }
}
