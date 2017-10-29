/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program converts temperature from Celcius to Fahrenheit and vice versa
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_6_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            printMenu();
            int choice = input.nextInt();

            if(choice == 9)
                break;

            if(choice == 1){
                System.out.print("\nTemperature in celsius: ");
                System.out.printf("Temperature in farenheit: %.2f\n\n",
                        farenheit(input.nextDouble()));
            }else{
                System.out.print("\nTemperature in farenheit: ");
                System.out.printf("Temperature in celsius: %.2f\n\n",
                        celsius(input.nextDouble()));
            }
        }
    }
    private static void printMenu(){
        System.out.println("********");
        System.out.println("1. Celsius to Farenheit");
        System.out.println("2. Farenheit to Celsius");
        System.out.println("9. Quit.");
        System.out.println("********");
        System.out.print("> ");
    }
    private static double celsius(double farenheit){
        return 5.0 / 9.0 * (farenheit - 32);
    }
    private static double farenheit(double celsius){
        return 9.0 / 5.0 * celsius + 32;
    }
}
