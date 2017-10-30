/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program determines how much a salesperson earns
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_7_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] frequency = new int[9];

        while(true){
            System.out.print("Enter salespersons total (-1 to exit): ");
            int response = input.nextInt();

            if(response < 0)
                break;

            if(response < 200)
                continue;
            else if(response > 1000)
                response = 1000;
            ++frequency[(response / 100) -2];
        }

        for(int i=0; i<frequency.length; i++){
            if(i == 8)
                System.out.printf("$%d00+   : %d\n", i + 2, frequency[i]);
            else
                System.out.printf("$%d00-$%d99: %d\n", i + 2, i + 2, frequency[i]);
        }
    }
}
