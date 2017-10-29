/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program calculates the sales commission of a salesperson depending on the
 * number of items sold
 * @author MILTON PRO
 */
import java.util.Scanner;
public class SalesCommissionCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float wages = 200.2f;
        float rate = 9.2f/100.2f;
        int itemNo = 0;
        int i = 0;
        while(i >= 0){
            System.out.print("Enter the item No: ");
            itemNo = input.nextInt();
            System.out.print("Enter the quantity sold: ");
            float qty = input.nextFloat();
            if(itemNo == 1){
                wages = wages + ((rate * 239.99f) * qty);
            }
            if(itemNo == 2){
                wages = wages + ((rate * 129.75f) * qty);
            }
            if(itemNo == 3){
                wages = wages + ((rate * 99.95f) * qty);
            }
            if(itemNo == 4){
                wages = wages + ((rate * 350.89f) * qty);
            }
            i++;
            System.out.printf("The salesperson wages for this week is: %.2f%n", wages);
        }
    }
}
