/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program test the functions of the Savings account class
 * @author MILTON PRO
 */
public class Exercise_8_3_Test {
    public static void main(String[] args){
        Exercise_8_3_Class saver1 = new Exercise_8_3_Class(2000.00);
        Exercise_8_3_Class saver2 = new Exercise_8_3_Class(3000.00);

        Exercise_8_3_Class.modifyInterestRate(0.04f);

        System.out.printf("saver1 initial Balance: %s\n", saver1.toString());
        System.out.printf("saver2 initial Balance: %s\n", saver2.toString());
        System.out.println();

        for(int i=0; i<12; i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        System.out.printf("saver1 - 12 months at 4%% interest: %s\n", saver1.toString());
        System.out.printf("saver2 - 12 months at 4%% interest: %s\n", saver2.toString());

        System.out.println("\nIncrease interest rate to 5%\n");

        Exercise_8_3_Class.modifyInterestRate(0.05f);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("saver1 - 1 month at 5%% interest: %s\n", saver1.toString());
        System.out.printf("saver2 - 1 month at 5%% interest: %s\n", saver2.toString());

    }
}
