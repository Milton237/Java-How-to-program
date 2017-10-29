/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program to calculate compound interest
 * @author MILTON PRO
 */
public class Exercise_5_8 {
    public static void main(String[] args){
        int amount; // amount on deposit at end of each year
        int principal = 1000; // initial amount before interest
        int rate = 5; // interest rate

        System.out.printf("%s%20s\n", "YEAR", "Amount on deposit");

        for(int year=0; year<=10; year++){
            amount = principal * (int)Math.pow(1 + rate, year);

            System.out.printf("%4d%,20d\n", year, amount);
        }
    }
}
