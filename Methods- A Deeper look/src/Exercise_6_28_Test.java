/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *computer-aided instruction
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_6_28_Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Exercise_6_28_Class cai = new Exercise_6_28_Class();

        int[] digits = new int[2];
        int count = 0;
        char cont = 'y';

        while(cont == 'y'){

            cai.run();


            // inner loop to ensure a sample size of 10
            while(count != 10){
                cai.getQuestion();
                cai.checkAnswer(input.nextLong());

                ++count;
            }
            cai.getResults();

            System.out.print("Continue? (y/n) ");
            cont = input.next().charAt(0);

            if(cont == 'y')
                count = 0;
                cai.reset();
        }
    }
}
