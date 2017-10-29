/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Exercise_5_17 {
    private final static double FAIR_TAX_RATE = 0.30; // fair tax rate of 30%
     Scanner input = new Scanner(System.in);

     private double[] savings = new double[7];
     private ArrayList<String> categories = new ArrayList<String>();

     // constructor
     public Exercise_5_17(){
         categories.add("Housing");
         categories.add("Food");
         categories.add("Clothing");
         categories.add("Transportation");
         categories.add("Education");
         categories.add("Health-Care");
         categories.add("Vacations");
     }
     public void showMenu(){
         System.out.println("\nEnter the number of the category to be entered.");
         for(int i=0; i<categories.size(); i++){
             System.out.printf("%d. %s\n", i+1, categories.get(i));
         }
         System.out.println("-1. Exit");
     }
     // calculate and add tax to total
     public void calculateTax(int i){
         System.out.printf("\n%s\n\n", categories.get(i-1).toUpperCase());
         savings[i-1] += requestInput("Enter total " + categories.get(i-1) + " costs: ", input) * FAIR_TAX_RATE;
     }
     // print total savings for all categories
     public void showSavings(){
         System.out.println("\nYour Estimated Fair Tax Summary\n");
         System.out.printf("Based off of %.2f%% tax.\n\n", FAIR_TAX_RATE * 100);

         for(int i=0; i<categories.size(); i++){
             System.out.printf("%s: %.2f\n", categories.get(i), savings[i]);
         }
     }
     private double requestInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextDouble();
    }
}
