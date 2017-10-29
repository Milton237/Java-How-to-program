/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program calculates the world population growth each year for the next 75 years
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_4_38_Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        long population = input.nextLong();

        System.out.print("Enter current world population growth rate: ");
        double growthRate = input.nextDouble();

        System.out.print("Enter a sample size (no of projection years): ");
        int sample = input.nextInt();

        Exercise_4_38_Class popGrowth = new Exercise_4_38_Class(population, growthRate, sample);

        printProjection(popGrowth);
    }
    public static void printProjection(Exercise_4_38_Class popGrowth){
        long[][] projection = popGrowth.getPopulationProjection();

        System.out.println("\n***********************************\n");
        System.out.printf("Population projection for %d years\n\n", popGrowth.getSample());
        System.out.println("***********************************\n");

        System.out.println("Year\t\tPopulation\t\t\tDifference");
        for(int i=0; i<projection.length; i++){
            System.out.printf("%d\t\t%d\t\t\t%d\n", i+1, projection[0][i], projection[1][i]);
        }
    }
}
