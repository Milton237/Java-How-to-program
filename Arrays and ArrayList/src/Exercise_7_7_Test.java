/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program simulates an air reservation system
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_7_7_Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Exercise_7_7_Class ars = new Exercise_7_7_Class();
        String section = "economy";

        ars.printGreeting();

        while(ars.seatsAvailable()){
            ars.printMenu();
            int choice = input.nextInt();

            if(choice == 1 || choice == 2)
                section = (choice == 1) ? "economy" : "first";
            else
                continue;

            ars.assignSeat(section);
        }
        System.out.println("\tPLANE FULL\n");
    }
}
