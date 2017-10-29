/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Test program to test the functionalities of the Exercise_5_7 class
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_5_7_Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Exercise_5_7 sales = new Exercise_5_7();

        int productNo, quantity;

        do{
            productNo = requestInput("Enter product number 1-5 (-1 to quit): ", input);

            // verify product no is in range
            if((productNo != -1) && !(productNo > 5)){
                quantity = requestInput("Enter quantity for product " + productNo + ": ", input);
                sales.addProduct(productNo, quantity);
            }

        }while((productNo != -1));

        System.out.printf("Total: %.2f\n", sales.getTotal());
    }
    public static int requestInput(String s, Scanner input){
        System.out.print(s);
        return input.nextInt();
    }
}
