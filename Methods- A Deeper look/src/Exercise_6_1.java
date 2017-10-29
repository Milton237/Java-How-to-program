/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program calculates and displays the parking charges for customers
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_6_1 {
     private static final double BASE_FEE = 2.00;
    private static final double HOURLY_FEE = 0.50;
    private static final double MAX_FEE = 10.00;

    private static double total = 0.0f;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double time = 0.0f;

        do{
            time = requestInput("Enter hours parked (-1 to exit): ", sc);
            if(time > 0)
                System.out.printf("Charges: $%.2f\n", calculateCharges(time));

        }while(time != -1);

        System.out.printf("Total charges for the day: $%.2f\n", total);
    }
    public static double requestInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextDouble();
    }
    public static double calculateCharges(double time){
        if(time > 3.0){
            double fee = BASE_FEE + (HOURLY_FEE * Math.ceil(time - 3.0));
            total += Math.min(fee, MAX_FEE);
            return Math.min(fee, MAX_FEE);
        }else{
            total += BASE_FEE;
            return BASE_FEE;
        }
    }
}
