/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program finds and displays the smallest input amongst three integers input
 * by the user
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_6_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 space separated numbers: ");
        System.out.printf("Minimum value is: %.2f\n",
                minumum3(input.nextDouble(), input.nextDouble(), input.nextDouble()));
    }
    public static double minumum3(double x, double y, double z){
        return Math.min(x, Math.min(y, z));
    }
}
