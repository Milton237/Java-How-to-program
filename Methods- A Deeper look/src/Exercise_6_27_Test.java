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
public class Exercise_6_27_Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Exercise_6_27 cai = new Exercise_6_27();

        int[] digits = new int[2];
        int count = 0;
        char cont = 'y';

        while(cont == 'y'){
            // inner loop to ensure a sample size of 10
            while(count != 10){
                cai.getQuestion();
                cai.checkAnswer(input.nextInt());

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
