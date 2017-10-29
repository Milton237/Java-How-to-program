/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program to calculate compound interest
 * @author MILTON PRO
 */
public class Exercise_5_4 {
    public static void main(String[] args){
        double amount; // amount on deposit at end of each year
        double principal = 1000.0; // initial amount before interest
        double rate = 0.0; // interest rate

        System.out.printf("%s%20s\n", "YEAR", "Amount on deposit");

        // set interest rate
        for(int r=5; r<=10; r++){
            rate = r;
            System.out.printf("Rate of interest %.2f%%\n", rate);
            // calculate for n years
            for(int year=0; year<=10; year++){
                amount = principal * Math.pow(1.0 + rate, year);

                System.out.printf("%4d%,20.2f\n", year, amount);
            }
        }

    }
}
