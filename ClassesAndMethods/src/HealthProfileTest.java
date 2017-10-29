/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Test to class to run the methods in th HealthProfile class
 * @author MILTON PRO
 */
import java.util.Scanner;

public class HealthProfileTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String fName = sc.nextLine();

        System.out.print("Enter you last name: ");
        String lName = sc.nextLine();

        System.out.print("Enter your gender (male/female): ");
        String gender = sc.nextLine();

        System.out.print("Enter Date of birth dd mm yyyy: ");
        int[] dob = new int[3];

        for(int i=0; i<3; i++){
            dob[i] = sc.nextInt();
        }

        System.out.print("1 for imperial, 2 for metric: ");
        int choice = sc.nextInt();

        System.out.printf("Input weight in %s: ",
                (choice == 1) ? "pounds" : "kilograms");
        double weight = sc.nextDouble();

        System.out.printf("Input height in %s: ",
                (choice == 1) ? "inches(ft * 12 * in)" : "metres");
        double height = sc.nextDouble();

        HealthProfile profile = new HealthProfile(fName, lName, gender, dob, height, weight, choice);
        profile.showHealthProfile();
    }
}

