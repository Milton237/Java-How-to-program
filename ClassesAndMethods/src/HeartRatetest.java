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
public class HeartRatetest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        HeartRates heart = new HeartRates("John", "Doe", 19,5,2005);
        System.out.print("Enter your first name: ");
        String fName = input.nextLine();
        System.out.print("Enter your last name: ");
        String lName = input.nextLine();
        System.out.print("Enter your day of birth: ");
        int day = input.nextInt();
        System.out.print("Enter your month of birth: ");
        int month = input.nextInt();
        System.out.print("Enter your year of birth: ");
        int year = input.nextInt();
        heart.setFirstname(fName);
        heart.setlastName(lName);
        heart.setDay(day);
        heart.setMonth(month);
        heart.setYear(year);
        System.out.println("");
        System.out.printf("First Name: %s%nLast Name: %s%nDate of birth: %d/%d/%d%nMaximum Heart Rate: %d%nTarget heart rate: %.2f%n",
                heart.getFirstName(), heart.getLastName(),heart.getDay(), heart.getMonth(), heart.getYear(), heart.getMaximumHeartRate(),heart.targetHeartRate());
        
        
        
        
        
    }
    
}
