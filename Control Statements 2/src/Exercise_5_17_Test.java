/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program that gets input from the user and calculates the fair tax that the
 * will pay
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_5_17_Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Exercise_5_17 tax = new Exercise_5_17();

        int choice = 0;

        while(choice != -1){
            tax.showMenu();
            choice = input.nextInt();

            if(choice > 0)
                tax.calculateTax(choice);
        }

        tax.showSavings();
    }
}
