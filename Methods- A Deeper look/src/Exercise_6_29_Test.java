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
public class Exercise_6_29_Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Exercise_6_29_Class cai = new Exercise_6_29_Class();

        char cont = 'y';

        while(cont == 'y'){

            cai.run();

            System.out.print("Continue? (y/n) ");
            cont = input.next().charAt(0);

            if(cont == 'y')
                cai.reset();
        }
    }
}
