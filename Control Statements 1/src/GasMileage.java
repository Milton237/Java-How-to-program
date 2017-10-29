/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program calculates the average miles driven per gallon for a vehicle
 * @author MILTON PRO
 */
import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfGallons =0;
        int milesDriven = 0;
        float totalMilesPerGallon = 0;
        System.out.println("Enter -1 to indicate end of input");
        while((numberOfGallons != -1) && (milesDriven != -1)){
            System.out.print("Enter the number of gallons: ");
            System.out.println("");
            numberOfGallons = input.nextInt();
            System.out.print("Enter the number milles: ");
            milesDriven = input.nextInt();
            System.out.println("");
            float milesPerGallon = milesDriven / numberOfGallons;
            totalMilesPerGallon += milesPerGallon;
            System.out.printf("The miles per gallon for this trip is: %.2f%n", milesPerGallon);
        }
        System.out.printf("The total miles per gallon for all the trips is: %.2f%n", totalMilesPerGallon);
    }
}
