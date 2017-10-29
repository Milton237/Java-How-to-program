/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program that calculates the salary of three employees
 * @author MILTON PRO
 */
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = 1;
        while(i < 4){
            System.out.print("Enter number of hours worked: ");
            int hours = input.nextInt();
            System.out.print("Enter hourly rate: ");
            float rate = input.nextFloat();
            System.out.print("Enter number of excess hours worked: ");
            int hours2 = input.nextInt();
            float pay = (hours * rate) + ((hours2/2) * rate);
            System.out.printf("Employee salary for this week is :%.2f%n", pay);
        }
    }
}
