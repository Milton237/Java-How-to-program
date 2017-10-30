/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program accepts student scores from the user and grades them
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_6_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter students average (-1 to exit): ");
            int average = input.nextInt();

            if(average == -1)
                break;

            System.out.printf("%d\n", qualityPoints(average));
        }
    }
    public static int qualityPoints(int average){
        if(average >= 90 && average <= 100)
            return 4;

        if(average >= 80 && average < 89)
            return 3;

        if(average >= 70 && average < 80)
            return 2;

        if(average >= 60 && average < 70)
            return 1;

        return 0;
    }
}
